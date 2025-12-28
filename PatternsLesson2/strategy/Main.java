package PatternsLesson2.strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new Cash());
        cart.checkout(100);
        cart.setPaymentStrategy(new ApplePay());
        cart.checkout(200);
        cart.setPaymentStrategy(new CreditCard());
        cart.checkout(300);
    }
}
