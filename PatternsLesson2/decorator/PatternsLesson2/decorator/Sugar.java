package PatternsLesson2.decorator.PatternsLesson2.decorator;

public class Sugar extends BeverageDecorator {
    public Sugar(Beverage beverage) {
        super(beverage);
    }
    @Override
    public double cost() {
        return beverage.cost() + 0.2;
    }
    @Override
    public String description() {
        return super.description() + ", Sugar";
    }
}
