package h2_5;

public class ShapeFactory {
    public static Shape createShape(float arg1, float arg2) {
        if (arg2 == 0) {
            return new Circle(arg1);
        } else {
            return new Rectangle(arg1, arg2);
        }
    }
}