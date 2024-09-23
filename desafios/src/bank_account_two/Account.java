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
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withDraw(){
        if(wannaWithDraw > balance){
            System.out.println("Valor insuficiente na sua conta");
        } else{
            balance -= wannaWithDraw;
    
            System.out.printf("Você sacou R$%.2f e agora está com o saldo de R$%.2f", wannaWithDraw, balance);
        }
    }

    public void deposit(){
        balance += wannaDeposit;

        System.out.printf("Você depositou R$%.2f e agora o seu saldo é de R$%.2f", wannaDeposit, balance);
    }
}
