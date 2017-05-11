package pl.kfrak.FileStream;

/**
 * Created by RENT on 2017-05-11.
 */
public class Point {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "" + x + y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;


    }
}
