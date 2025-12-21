package Patterns.FactoryMethod;

public class DonutFactory {

    public static Donut donutType(String type) {
        switch (type) {
            case "chocolate":
                return new ChocolateDonut();
            case "strawberry":
                return new StrawberryDonut();
            default:
                throw new IllegalArgumentException("Unknown donut type: " + type);
        }
    }
}
