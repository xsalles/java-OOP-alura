package student_two;

public class Student {
    private String nameOfTheStudent;
    private double rates = 0;
    int quantityOfRates = 0;
    double rateAverage;

    public String getNameOfTheStudent(){
        return nameOfTheStudent;
    }

    public void nameOfTheStudent(String nameOfTheStudent){
        this.nameOfTheStudent = nameOfTheStudent;
    }

    public double getRates(){
        return rates;
    }

    public void setRates(double rates){
        this.rates = rates;

        quantityOfRates++;
    }

    void calculateAverage(){
        rates += rates;

        rateAverage = rates / quantityOfRates;

        System.out.printf("A média desse aluno é: %.2f", rateAverage);
    }
}
