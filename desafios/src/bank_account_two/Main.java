package bank_account_two;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account myAccount = new Account();
        int optionChosed = 0;

        while (optionChosed != 4){
            System.out.println("""

                    *****************
    
                    Digite a opção desejada
    
                    1 - Depositar.
                    2 - Sacar.
                    3 - Consultar saldo.
                    4 - Sair
                    """);
            optionChosed = sc.nextInt();
    
            switch (optionChosed) {
                case 1: System.out.println("\nQuantos reais vocÊ deseja depositar?\n");
                        myAccount.setWannaDeposit(sc.nextDouble());
    
                        myAccount.deposit();    
                    break;
                case 2: System.out.println("\nDigite quantos reais que você deseja sacar: \n");
                        myAccount.setWannaWithDraw(sc.nextDouble());
    
                        myAccount.withDraw();
                    break;
                case 3: System.out.printf("\nO seu saldo é de %.2f", myAccount.getBalance());
                    break;
                case 4: 
                    break;
                default: System.out.println("\nOpção inválida\n");
                    break;
            }

        }


        sc.close();
    }
}
