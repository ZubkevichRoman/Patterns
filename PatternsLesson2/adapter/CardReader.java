package PatternsLesson2.adapter;

public class CardReader implements USBInt {
    private CardInsertion cardInsertion;
    public CardReader(CardInsertion cardInsertion) {
        this.cardInsertion = cardInsertion;
    }
    @Override
    public void connectWithUsbCable() {
        this.cardInsertion.insertCard();
        this.cardInsertion.copyData();
    }
}
