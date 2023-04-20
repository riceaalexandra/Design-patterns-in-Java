package h2_5;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.createShape(5.0f, 10.0f);
        System.out.println("Rectangle area: " + shape1.calculateArea());

        Shape shape2 = ShapeFactory.createShape(3.0f, 0.0f);
        System.out.println("Circle area: " + shape2.calculateArea());
    }
}