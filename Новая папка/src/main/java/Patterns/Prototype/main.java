package Patterns.Prototype;

public class main {
    public static void main(String[] args) {
        Car car1 = new Car("Bmw", 10);
        Car car2 = (Car) car1.clone();
        System.out.println(car1);
        System.out.println(car2);

        car2.setCarName("Mercedes");

        System.out.println(car1);
        System.out.println(car2);

    }
}
