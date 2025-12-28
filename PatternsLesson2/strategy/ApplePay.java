package PatternsLesson2.strategy;

public class ApplePay implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " via Apple Pay");
    }
}
