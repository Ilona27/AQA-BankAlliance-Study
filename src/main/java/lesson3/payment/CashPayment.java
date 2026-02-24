package lesson3.payment;

public class CashPayment extends Payment {

    @Override
    public void pay() {
        System.out.println("Pay by cash");
    }
}
