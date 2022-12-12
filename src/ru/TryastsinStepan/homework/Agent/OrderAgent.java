package ru.TryastsinStepan.homework.Agent;

import ru.TryastsinStepan.homework.courier.Courier;
import ru.TryastsinStepan.homework.order.Order;
import ru.TryastsinStepan.homework.schedule.Schedule;

import java.util.PriorityQueue;
import java.util.Queue;

public class OrderAgent {
    public Courier courier;
    public Order order;
    CourierAgent courierAgent =null;
    public Courier getCourier() {
        return courier;
    }
    private final int MAX_VERTS = 10;
    private Vertex vertexList[]; //массив вершин
    private int adjMat[][]; // матрица смежности
    private int nVerts; // текущее количество вершин
    private Queue<Integer> queue;

    public void addVertex(Courier lab[]) {

        vertexList[nVerts++] = new Vertex(lab);
    }

    public void setCourier(Courier courier) {
        this.courier = courier;
    }

    public Order getOrder() {
        return order;
    }
    public void displayVertex(int v) {
        System.out.println(vertexList[v].getLabel());
    }
    public void setOrder(Order order) {
        this.order = order;
    }

    public OrderAgent(Order order) {

this.order = order;
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        for (int j = 0; j < MAX_VERTS; j++) {
            for (int k = 0; k < MAX_VERTS; k++) {  // заполнение матрицы смежности нулями
                adjMat[j][k] = 0;
            }
        }
        queue = new PriorityQueue<>();
    }
    public void dfs() { // обход в глубину
        vertexList[0].setWasVisited(true);
        displayVertex(0);
        queue.add(0);
        int v2;

        while (!queue.isEmpty()) {
            int v = queue.remove();

            while((v2 = getAdjUnvisitedVertex(v))!=-1) {// цикл будет работать, пока все смежные вершины не будут найденны, и не будут добавлены в очередь
                vertexList[v2].wasVisited =true;
                displayVertex(v2);
                queue.add(v2);
            }
        }
        for (int j = 0; j < nVerts; j++) {  // сброс флагов
            vertexList[j].wasVisited = false;
        }

    }

    private int getAdjUnvisitedVertex(int v) {
        for (int j = 0; j < nVerts; j++) {
            if (adjMat[v][j] == order.checkOrder() && vertexList[j].wasVisited == false) {
                return j; //возвращает первую найденную вершину
            }
        }
        return -1;
    }
    public void findPlacement(Courier courier[]){

        for(int i = 0; i< 2;i++){
           addVertex(courier);
            courierAgent = new CourierAgent(courier[i]);
            courierAgent.addOrder(order, (int) courierAgent.timeExecution(getOrder()));
              dfs();
        }
     }
}
