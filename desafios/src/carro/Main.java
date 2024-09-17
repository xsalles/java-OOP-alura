package carro;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car myCar = new Car();

        System.out.println("Qual o modelo do carro?\n");
        myCar.model = sc.next();

        System.out.println("\nQual a cor do carro?\n");
        myCar.color = sc.next();

        System.out.println("\nQual o ano do carro?\n");
        myCar.year = sc.nextInt();

        myCar.showInformations();

        myCar.showTheAge();

        sc.close();
    }
}
