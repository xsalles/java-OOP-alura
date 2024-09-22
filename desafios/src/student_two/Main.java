package student_two;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student myStudent = new Student();
        int answer = 0;

        System.out.println("""
                *********************

                1-Digitar uma nota
                2-Sair

                Digite a opção que você deseja:
                """);
                answer = sc.nextInt();

        while (answer != 2 && answer == 1) {
            

            System.out.println("Digite a sua nota desse bimestre:\n");
            myStudent.setRates(sc.nextDouble());

            System.out.println("""
                *********************

                1-Digitar uma nota
                2-Sair

                Digite a opção que você deseja:
                """);
                answer = sc.nextInt();
        }

        if(answer == 2 && answer != 1 ){
            myStudent.calculateAverage();
        }

        sc.close();
    }
}
