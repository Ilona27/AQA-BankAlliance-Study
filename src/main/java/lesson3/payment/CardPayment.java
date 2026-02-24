package lesson3.payment;

public class CardPayment extends Payment {

    @Override
    public void pay() {
        System.out.println("Paying by card");
    }
}
