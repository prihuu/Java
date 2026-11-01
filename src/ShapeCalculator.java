
public class ShapeCalculator {

    public static void main(String[] args) {

        System.out.println("Shape Calculator\n");

        //create an array of Shape objects
        Shape[] shapes = {
                new Circle(5.0),
                new Rectangle(4.0, 6.0),
                new Triangle2(3.0, 8.0)
        };

        //loop through the array
        for (Shape shape : shapes) {

            System.out.println("Area of " + shape + ": "
                    + shape.calculateArea());

            System.out.println();
        }
    }
}
