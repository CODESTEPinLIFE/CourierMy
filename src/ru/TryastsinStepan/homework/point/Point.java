package ru.TryastsinStepan.homework.point;

public class Point {
    private double x;
    private double y;

    public Point() {}

    public Point(double x,double y) {
        this.x = x;
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Point[" +
                "x :" + getX() +
                ", y :" + getY() +
                ']';
    }
    public int distancePoint(int x2,int y2){
        return (int) Math.sqrt(Math.pow((x2 - getX()), 2) + Math.pow((y2 - getY()), 2));
    }
}
