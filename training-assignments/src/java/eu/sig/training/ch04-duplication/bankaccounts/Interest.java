package eu.sig.training.ch04;


public class Interest {

    public void add(float INTEREST_PERCENTAGE, Money balance) {
        Money interest = balance.multiply(INTEREST_PERCENTAGE);
        if (interest.greaterThan(0)) {
            balance.add(interest);
        } else {
            balance.substract(interest);
        }
    }

}
