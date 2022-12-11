package ru.TryastsinStepan.homework.courier;

import ru.TryastsinStepan.homework.point.Point;
import ru.TryastsinStepan.homework.purpose.Purpose;
import ru.TryastsinStepan.homework.schedule.Schedule;

public class Courier {

    private String nameSurnameFatherland;
    private long id;
    private double speed;
    private Point startPosition;
    public Schedule scheduleCourier;

    public Courier() {
    }

    public Courier(String nameSurnameFatherland, long id, double speed, Point startPosition) {
        this.nameSurnameFatherland = nameSurnameFatherland;
        this.id = id;
        this.speed = speed;
        this.startPosition = startPosition;
        this.scheduleCourier = null;
    }
public Point getPoint(){
        return this.startPosition;
}
    public String getNameSurnameFatherland() {
        return nameSurnameFatherland;
    }

    public void setNameSurnameFatherland(String nameSurnameFatherland) {
        this.nameSurnameFatherland = nameSurnameFatherland;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Point getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(Point startPosition) {
        this.startPosition = startPosition;
    }

    public Schedule getScheduleCourier() {
        return scheduleCourier;
    }

    public void setScheduleCourier(Schedule scheduleCourier) {
        this.scheduleCourier = scheduleCourier;
    }

    @Override
    public String toString() {
        return
                "Фамилия Имя Отчество :" + nameSurnameFatherland + "\n" +
                " Id :" + id +"\n" +
                " Скорость :" + speed +"\n" +
                 " Позиция курьера :" + startPosition.toString() +"\n" ;
    }
}
