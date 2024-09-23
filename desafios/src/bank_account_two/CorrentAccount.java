package bank_account_two;


public class CorrentAccount extends Account {
    private double fee;
    double balance = getBalance();

    public double getFee() {
        return fee = 0.01;
    }

    public void monthlyFee(){
        balance *= fee;
    }
}
