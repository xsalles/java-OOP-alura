package car_two;

public class Car {
    private String modelOfTheCar;
    private double firstYearMiddlePrice, secondYearMiddlePrice, thirdYearMiddlePrice;
    double sumOfMiddlePrices;

    public double getThirdYearMiddlePrice() {
        return thirdYearMiddlePrice;
    }

    public void setThirdYearMiddlePrice(double thirdYearMiddlePrice) {
        this.thirdYearMiddlePrice = thirdYearMiddlePrice;
    }

    public double getFirstYearMiddlePrice() {
        return firstYearMiddlePrice;
    }

    public void setFirstYearMiddlePrice(double firstYearMiddlePrice) {
        this.firstYearMiddlePrice = firstYearMiddlePrice;
    }

    public double getSecondYearMiddlePrice() {
        return secondYearMiddlePrice;
    }

    public void setSecondYearMiddlePrice(double secondYearMiddlePrice) {
        this.secondYearMiddlePrice = secondYearMiddlePrice;
    }

    public String getModelOfTheCar() {
        return modelOfTheCar;
    }

    public void setModelOfTheCar(String modelOfTheCar) {
        this.modelOfTheCar = modelOfTheCar;
    }

    public void calculateAndShowMoreExpensiveOrCheaper() {
        sumOfMiddlePrices = firstYearMiddlePrice + secondYearMiddlePrice + thirdYearMiddlePrice;
        
        if (firstYearMiddlePrice > secondYearMiddlePrice && firstYearMiddlePrice > thirdYearMiddlePrice) {
            System.out.printf("""

                    A maior média de valor desse carro, foi no primeiro ano.
                    Sendo: R$%.2f

                    """, firstYearMiddlePrice);

        } else if (secondYearMiddlePrice >= firstYearMiddlePrice && secondYearMiddlePrice >= thirdYearMiddlePrice) {
            System.out.printf("A maior média de valor desse carro, foi no segundo ano. Sendo: R$%.2f\n",
                    secondYearMiddlePrice);

        } else if (thirdYearMiddlePrice >= firstYearMiddlePrice && thirdYearMiddlePrice >= secondYearMiddlePrice) {
            System.out.printf("A maior média de valor desse carro, foi no terceiro ano. Sendo: R$%.2f\n",
                    thirdYearMiddlePrice);
        } else if (firstYearMiddlePrice == secondYearMiddlePrice && secondYearMiddlePrice == thirdYearMiddlePrice) {
            System.out.println("Todos os valores iguais, então não é possível eu te falar o maior");
        }

        System.out.printf("""
                A soma do valor do preço médio desse carro,
                ao longo de três anos é: R$%.2f
                """, sumOfMiddlePrices);

    }

    public void showInformations() {
        System.out.printf("""

                Modelo do carro: %s
                Preço médio no primeiro ano: %.2f
                Preço médio no segundo ano: %.2f
                Preço médio no terceiro ano: %.2f

                """, getModelOfTheCar(), getFirstYearMiddlePrice(), getSecondYearMiddlePrice(),
                getThirdYearMiddlePrice());
    }

}