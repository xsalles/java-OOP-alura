package car;
public class Car {
    String model, color;
    int year = 0;
    int currentYear = 2024;
    int ageOfTheCar;

    void showInformations(){
        System.out.printf("""
                **********************
                \nModelo: %s
                Cor: %s
                Ano do carro: %d \n
                **********************
                """, model, color, year);
    }

    void showTheAge(){
        ageOfTheCar = currentYear - year;

        System.out.printf("\nSe o carro é do ano de %d, você já tem esse carro há %d anos", year, ageOfTheCar);
    }
}
