package PatternsLesson2.decorator;

public class Espresso implements Beverage {
    @Override
    public String description() {
        return "espresso";
    }

    @Override
    public double cost() {
        return 5;
    }
}
