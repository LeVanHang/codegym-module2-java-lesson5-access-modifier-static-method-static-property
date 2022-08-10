package accessModifier;

public class Circle {
    private double radius =1.0;
    private  String color = "red";

    public Circle(){
    }

    public String getColor() {
        return color;
    }

    protected Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArena() {
        return Math.PI *radius*radius;
    }
}
