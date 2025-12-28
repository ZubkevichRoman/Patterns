package PatternsLesson2.strategy;

public class Cash implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " via cash");
    }
}
