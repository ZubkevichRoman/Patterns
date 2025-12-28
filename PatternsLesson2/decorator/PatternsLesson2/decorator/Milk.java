package PatternsLesson2.decorator.PatternsLesson2.decorator;

public class Milk extends BeverageDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return super.cost() + 0.50;
    }

    @Override
    public String description() {
        return super.description() + ", Milk";
    }
}
