package student;

public class Student {
    String nameOfTheStudent;
    int age = 0;

    void showInformations(){
        System.out.printf("""
                \nNome do estudante: %s
                Idade: %d
                """, nameOfTheStudent, age);
    }

}
