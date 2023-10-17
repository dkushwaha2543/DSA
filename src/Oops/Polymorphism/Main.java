package Oops.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Shape square = new Square();

        square.area();
    }
}
