package h2_5;

public class Circle implements Shape {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float calculateArea() {
        return (float) (Math.PI * radius * radius);
    }
}