package PatternsLesson2.decorator;

public class Main {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.description() + "$" + espresso.cost());
        Beverage cappuccino = new Milk(espresso);
        System.out.println(cappuccino.description() + "$" + cappuccino.cost());
        Beverage sweetCappuccino = new Sugar(cappuccino);
        System.out.println(sweetCappuccino.description() + "$" + sweetCappuccino.cost());
    }
}
