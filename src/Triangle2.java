
public class Triangle2 extends Shape {

    private double base;
    private double height;

    public Triangle2(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }
}
