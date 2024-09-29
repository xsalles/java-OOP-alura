package calculable;

import calculable.calc.Calculable;

public class PhysicalProduct extends General implements Calculable {
    double discount = 0.9;

    @Override
    public double calcPrice(double price, double quantity) {
        return price * quantity * discount;
    }

    public void finalPrice(){
        System.out.printf("O preço final desse produto físico com 10% de desconto, é R$%.2f", calcPrice(getPrice(), getQuantity()));
    }
}
