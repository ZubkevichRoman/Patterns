package PatternsLesson2.adapter;

public class Main {
    public static void main(String[] args) {
        USBInt cardInsertion = new CardReader(new CardInsertion());
        cardInsertion.connectWithUsbCable();
    }
}
