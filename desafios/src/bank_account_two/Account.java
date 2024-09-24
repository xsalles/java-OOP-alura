package bank_account_two;

public class Account {
    private double balance;
    private double wannaWithDraw;
    private double wannaDeposit;

    public double getWannaDeposit() {
        return wannaDeposit;
    }

    public void setWannaDeposit(double wannaDeposit) {
        this.wannaDeposit = wannaDeposit;
    }

    public double getWannaWithDraw() {
        return wannaWithDraw;
    }

    public void setWannaWithDraw(double wannaWithDraw) {
        this.wannaWithDraw = wannaWithDraw;
    }

    public double getBalance() {
        return balance -= 12;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withDraw(){
        if(wannaWithDraw > balance){
            System.out.println("\nValor insuficiente na sua conta\n");
        } else{
            balance -= wannaWithDraw;
    
            System.out.printf("\nVocê sacou R$%.2f e agora junto com as taxas, está com o saldo de R$%.2f\n", wannaWithDraw, balance);
        }
    }

    public void deposit(){
        balance += wannaDeposit;

        System.out.printf("\nVocê depositou R$%.2f e agora junto com as taxas, o seu saldo é de R$%.2f\n", wannaDeposit, getBalance());
    }
}
