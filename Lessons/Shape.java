package Lessons;

public abstract class Shape {
    private double x,y;

    public Shape(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public abstract void print();
}