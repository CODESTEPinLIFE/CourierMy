package ru.TryastsinStepan.homework;

import ru.TryastsinStepan.homework.Agent.CourierAgent;
import ru.TryastsinStepan.homework.Agent.OrderAgent;
import ru.TryastsinStepan.homework.courier.Courier;
import ru.TryastsinStepan.homework.order.Order;
import ru.TryastsinStepan.homework.point.Point;
import ru.TryastsinStepan.homework.reader.PurposeReader;
import ru.TryastsinStepan.homework.timemoment.TimeMoment;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        PurposeReader purposeReader = new PurposeReader();
        Courier[] couriers = null;
        Order[] orders = {
                new Order(1, new Point(0, 0), new Point(0,0), new TimeMoment(0,8),null),
                new Order(2, new Point(0, 0), new Point(0,0), new TimeMoment(1,8),null),
        };
        File file2 = new File("Courier.txt");
        try {
            FileReader fileReader = new FileReader(file2.getAbsoluteFile());
             couriers = purposeReader.readCouriers(fileReader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        OrderAgent orderAgent = null;
        for(int i = 0; i<2;i++){
            orderAgent = new OrderAgent(orders[i]);
            orderAgent.findPlacement(couriers);
        }


    }
}