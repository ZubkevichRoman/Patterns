package Patterns.FactoryMethod;

public class main {
    public static void main(String[] args) {

        Donut type1 = DonutFactory.donutType("chocolate");
        type1.eat();

        Donut type2 = DonutFactory.donutType("strawberry");
        type2.eat();


    }
}
