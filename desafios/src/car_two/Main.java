package car_two;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car myCar = new Car(); 
       
         
        System.out.println("\nQual o modelo do carro?\n");
        myCar.setModelOfTheCar(sc.nextLine());

        System.out.println("\nDigite o preço médio do carro no primeiro ano:\n");
        myCar.setFirstYearMiddlePrice(sc.nextDouble());

        System.out.println("\nDigite o preço médio do carro no segundo ano:\n");
        myCar.setSecondYearMiddlePrice(sc.nextDouble());

        System.out.println("\nDigite o preço médio do carro no terceiro ano:\n");
        myCar.setThirdYearMiddlePrice(sc.nextDouble());

        myCar.calculateAndShowMoreExpensiveOrCheaper();

        myCar.showInformations();

        sc.close();
    }
}
