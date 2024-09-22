package bank_account;

public class ContaBancaria {
    private int agency;
    private double balance;
    String name;

    public int getAgency(){
        return agency;
    }

    public void setAgency(int agency){
        this.agency = agency;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    void showInformations(){
         System.out.printf("""
                 *****************

                Nome: %s
                Agência: %d
                Saldo: R$%f
                 """, name, agency, balance);
    }


}
