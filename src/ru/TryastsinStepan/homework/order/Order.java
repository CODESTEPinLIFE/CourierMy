package ru.TryastsinStepan.homework.order;

import ru.TryastsinStepan.homework.point.Point;
import ru.TryastsinStepan.homework.purpose.Purpose;
import ru.TryastsinStepan.homework.timemoment.TimeMoment;

public class Order {
     private int  numberOrder;
     private Point collectionPoint;

    private Point deliveryPoint;
     private TimeMoment timeMoment;
     private Purpose purposeOrder;

    public Order() {
    }

    public Order(int numberOrder, Point collectionPoint, Point deliveryPoint,TimeMoment timeMoment, Purpose purposeOrder) {
        this.numberOrder = numberOrder;
        this.collectionPoint = collectionPoint;
        this.timeMoment = timeMoment;
        this.purposeOrder = purposeOrder;
        this.deliveryPoint = deliveryPoint;
    }

    public int getNumberOrder() {
        return numberOrder;
    }

    public void setNumberOrder(int numberOrder) {
        this.numberOrder = numberOrder;
    }

    public Point getCollectionPoint() {
        return collectionPoint;
    }

    public void setCollectionPoint(Point collectionPoint) {
        this.collectionPoint = collectionPoint;
    }

    public TimeMoment getTimeMoment() {
        return timeMoment;
    }

    public void setTimeMoment(TimeMoment timeMoment) {
        this.timeMoment = timeMoment;
    }

    public Purpose getPurposeOrder() {
        return purposeOrder;
    }

    public void setPurposeOrder(Purpose purposeOrder) {
        this.purposeOrder = purposeOrder;
    }
    public Point getDeliveryPoint() {
        return deliveryPoint;
    }

    public void setDeliveryPoint(Point deliveryPoint) {
        this.deliveryPoint = deliveryPoint;
    }

    @Override
    public String toString() {
        return
                "Номер зака " + numberOrder +
                ", Точка сбора " + collectionPoint +
                ", Точка доставки " + deliveryPoint +
                ", Времемя выполнения " + timeMoment +
                ", Назначение заказа " + purposeOrder;
    }
    public int checkOrder() {
        return purposeOrder != null ? 1 : 0;
    }
}
