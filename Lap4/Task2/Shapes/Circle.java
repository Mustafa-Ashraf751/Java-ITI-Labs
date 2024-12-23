package Shapes;

public class Circle extends Shape {
    int radius;


    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Shapes.Circle");
    }

    @Override
    public double getArea() {
        return 22 / 7 * radius * radius;
    }
}
