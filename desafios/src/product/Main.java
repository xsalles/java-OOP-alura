package product;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product myProduct = new Product();

        System.out.println("""
                Qual o nome do produto?

                """);
        myProduct.setNameOfTheProduct(sc.nextLine());

        System.out.println(""" 

                Qual o preço do produto?
                
                """);
        myProduct.setPrice(sc.nextDouble());

        myProduct.showOriginalPrice();
        
        myProduct.showPriceWithDisccount();

        sc.close();

    }
}
