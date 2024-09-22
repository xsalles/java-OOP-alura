package conta_bancaria;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria myAccount = new ContaBancaria();

        System.out.println("\nDigite o nome do titular da conta bancária\n");
        myAccount.name = sc.nextLine();

        System.out.println("\nDigite o número da agência\n");
        myAccount.setAgency(sc.nextInt());

        System.out.println("\nDigite o saldo da sua conta\n");
        myAccount.setBalance(sc.nextDouble());

        myAccount.showInformations();

       sc.close();
    }
}
