package ru.TryastsinStepan.homework.OrderAgent;

import ru.TryastsinStepan.homework.CourierAgent.CourierAgent;
import ru.TryastsinStepan.homework.courier.Courier;
import ru.TryastsinStepan.homework.order.Order;

public class OrderAgent {
    Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void findPlacement(Courier courier){
        CourierAgent courierAgent = new CourierAgent();
        for(int i = 0; i<3;i++){

        }
    }
}
