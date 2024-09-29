package calculable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int answer = 0;

        System.out.println("""
                Você deseja comprar um livro ou um produto físico?
                
                1 - Livro.
                2 - Produto.
                3 - Sair.
                
                """);
        answer = sc.nextInt();

        switch (answer){
            case 1: Book myBook = new Book();

                System.out.println("\nQual o preço do seu livro?\n");
                myBook.setPrice(sc.nextDouble());

                System.out.println("\nQuantos livros desse você quer?\n");
                myBook.setQuantity(sc.nextInt());

                myBook.calcPrice(myBook.getPrice(), myBook.getQuantity());

                myBook.finalPrice();
                break;
            case 2: PhysicalProduct myPhysicalProduct = new PhysicalProduct();

                System.out.println("\nQual o preço do seu produto?\n");
                myPhysicalProduct.setPrice(sc.nextDouble());

                System.out.println("\nQuantos produtos desse você quer?\n");
                myPhysicalProduct.setQuantity(sc.nextInt());

                myPhysicalProduct.calcPrice(myPhysicalProduct.getPrice(), myPhysicalProduct.getQuantity());

                myPhysicalProduct.finalPrice();
                break;
            case 3: break;
        }

        sc.close();
    }
}
