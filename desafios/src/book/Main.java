package book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book myBook = new Book();

        System.out.println("\nQual o nome do livro?\n");
        myBook.setNameOfTheBook(sc.nextLine());

        System.out.println("\nQual o nome do autor do livro?\n");
        myBook.setNameOfTheAuthor(sc.nextLine());

        myBook.showDetails();

        sc.close();
    }
}
