package Shapes;

public class Rectangle extends Shape {
    int length;
    int width;

    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
