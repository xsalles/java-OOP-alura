package bank_account_two;


public class CorrentAccount extends Account {
    private double fee = 12.00;
    double balance = getBalance();
    
    public void collectFee(){
        balance -= fee;
    }

    
}
