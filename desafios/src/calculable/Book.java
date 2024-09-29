package calculable;

import calculable.calc.Calculable;

public class Book extends General implements Calculable {
    double discount = 0.8;

    @Override
    public double calcPrice(double price, double quantity) {
        return price * quantity * discount;
    }

    public void finalPrice(){
        System.out.printf("O preço final desse livro com 20% de desconto, é R$%.2f", calcPrice(getPrice(), getQuantity()));
    }
}
