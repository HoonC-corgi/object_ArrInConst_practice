package Obj_ArrInConst;

public class Circle {
    private double x;
    private double y;
    private double r;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public void show() {
        System.out.println("(" + x + "," + y + ")" + r);
    }
}
