package lesson3;

import lesson3.payment.CardPayment;
import lesson3.payment.CashPayment;
import lesson3.payment.Payment;

public class Test {

    public static void main(String[] args) {
        Car car = new Car("Audi", "Q7");
        String carName = car.getName();
        System.out.println(carName);

        Payment payment = new CardPayment();
        payment.pay();

        Payment payment1 = new CashPayment();
        payment1.pay();
    }

}
