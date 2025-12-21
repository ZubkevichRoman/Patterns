package Patterns.Bulder;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder().setCarName("Bmw")
                .setEngine("m57")
                .setSeats(5)
                .setTransmission("Automatic")
                .build();
        System.out.println(car);
    }
}