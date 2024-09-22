package person_age;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonAge myAge = new PersonAge();

       System.out.println("\nQual é o seu nome?\n");
       myAge.setName(sc.nextLine());

       System.out.println("\nQual a sua idade?\n");
       myAge.setAge(sc.nextInt());

       myAge.olderOrYounger();

       sc.close();
    }
}
