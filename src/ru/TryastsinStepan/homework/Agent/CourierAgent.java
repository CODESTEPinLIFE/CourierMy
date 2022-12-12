package ru.TryastsinStepan.homework.Agent;

import ru.TryastsinStepan.homework.courier.Courier;
import ru.TryastsinStepan.homework.order.Order;
import ru.TryastsinStepan.homework.point.Point;
import ru.TryastsinStepan.homework.purpose.Purpose;
import ru.TryastsinStepan.homework.schedule.Schedule;

public class CourierAgent {

    public Order order;
    public Courier courier;
    Schedule schedule = new Schedule();

    public CourierAgent(Courier courier) {
this.courier = courier;
    }

    public Courier getCourier() {
        return courier;
    }

    public void setCourier(Courier courier) {
        this.courier = courier;
    }

    public  double distanceToCollection ;
    public  double  distanceToDelivery ;
    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public CourierAgent() {
    }

    public double getDistanceToCollection() {
        return distanceToCollection;
    }

    public void setDistanceToCollection(double distanceToCollection) {
        this.distanceToCollection = distanceToCollection;
    }

    public double getDistanceToDelivery() {
        return distanceToDelivery;
    }

    public void setDistanceToDelivery(double distanceToDelivery) {
        this.distanceToDelivery = distanceToDelivery;
    }

    public  long timeToDelivery;
    public long timeToCollection;
    Point pointCollection = null;
    Point pointDelivery = null;
    Point startPointCourier = null;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public double timeExecution(Order order) {

        double distanceToCollectionX = 0;
        double distanceToCollectionY = 0;
        double distanceToCollection = 0;
        double distanceToDeliveryX = 0;
        double distanceToDeliveryY = 0;
        double distanceToDelivery = 0;

            distanceToCollectionX = (order.getCollectionPoint().getX() - courier.getPoint().getX());
            distanceToCollectionY = (order.getCollectionPoint().getY() - courier.getPoint().getY());
            pointCollection = new Point(distanceToCollectionX,distanceToCollectionY);


            distanceToDeliveryX = (pointCollection.getX() - order.getDeliveryPoint().getX());
            distanceToDeliveryY = (pointCollection.getY() - order.getCollectionPoint().getY());

            pointDelivery = new Point(distanceToCollectionX,distanceToCollectionY);


            distanceToCollection = courier.getPoint().distancePoint((int) distanceToCollectionX, (int) distanceToCollectionY);
            distanceToDelivery = pointCollection.distancePoint((int) distanceToDeliveryX, (int) distanceToDeliveryY);


            setDistanceToCollection(distanceToCollection);
            setDistanceToDelivery(distanceToDelivery);


            timeToCollection = (long) (distanceToCollection / courier.getSpeed());
            timeToDelivery = (long) (distanceToDelivery / courier.getSpeed());

        startPointCourier =  pointDelivery ;

        return   timeToCollection + timeToDelivery;

    }
    public Schedule addOrder( Order order, int time){
    Purpose purpose[] = new Purpose[1];
    for(int i = 0 ;i<purpose.length;i++) {
        purpose[i] = new Purpose(getCourier(), order, pointDelivery, time, getDistanceToDelivery() + getDistanceToCollection());
    }
        schedule = new Schedule(purpose);
        setSchedule(schedule);
    return  schedule;
    }
}
