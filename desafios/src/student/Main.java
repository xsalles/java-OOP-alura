package student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student myStudent = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.println("\nQual é o nome do estudante?\n");
        myStudent.nameOfTheStudent = sc.nextLine();

        System.out.println("\nQual a idade desse estudante?\n");
        myStudent.age = sc.nextInt();

        myStudent.showInformations();

        sc.close();
    }

}
