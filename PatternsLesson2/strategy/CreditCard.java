package PatternsLesson2.strategy;

public class CreditCard implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " via credit card");
    }
}
