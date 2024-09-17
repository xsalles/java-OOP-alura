package carro;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro myCar = new Carro();

        System.out.println("Qual o modelo do carro?\n");
        myCar.modelo = sc.next();

        System.out.println("\nQual a cor do carro?\n");
        myCar.cor = sc.next();

        System.out.println("\nQual o ano do carro?\n");
        myCar.ano = sc.nextInt();

        myCar.showInformations();

        sc.close();
    }
}
