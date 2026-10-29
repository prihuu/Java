
public class CarTest {
    public static void main(String[] args) {
        Car car = new Car(50, 120);

        if (car.getGasolineTankCapacity() == 50) {
            System.out.println("Tank capacity is correct!");
        } else {
            System.out.println("Tank capacity is incorrect!");
        }

        if (car.getSpeed() == 120) {
            System.out.println("Speed is correct!");
        } else {
            System.out.println("Speed is incorrect!");
        }
    }
}
