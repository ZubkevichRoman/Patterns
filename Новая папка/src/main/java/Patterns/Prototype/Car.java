package Patterns.Prototype;

public class Car implements Prototype {
    private String CarName;
    private int CarAge;

    public Car(String carName, int carAge) {
        CarName = carName;
        CarAge = carAge;
    }

    @Override
    public String toString() {
        return "Car{" +
                "CarName='" + CarName + '\'' +
                ", CarAge=" + CarAge +
                '}';
    }

    public String getCarName() {
        return CarName;
    }

    public void setCarName(String carName) {
        CarName = carName;
    }

    public int getCarAge() {
        return CarAge;
    }

    public void setCarAge(int carAge) {
        CarAge = carAge;
    }

    @Override
    public Prototype clone() {
        return new Car(CarName,CarAge);
    }
}
