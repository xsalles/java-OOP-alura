package product;

public class Product {
    private String nameOfTheProduct;
    private double price;
    double newPrice;

    public String getNameOfTheProduct() {
        return nameOfTheProduct;
    }

    public void setNameOfTheProduct(String nameOfTheProduct) {
        this.nameOfTheProduct = nameOfTheProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    void showOriginalPrice() {
        System.out.printf("""

                Nome do produto: %s
                Preço do produto: R$%.2f

                """, nameOfTheProduct, price);
    }

    void showPriceWithDisccount(){
        if (price >= 200.00) {
            newPrice = price * 0.7;
            System.out.println("PARA COMPRAS ACIMA DE 200 REAIS, TEMOS 30% DE DESCONTO!\n Com o desconto de 30%, o seu produto fica: R$" + newPrice);
        } else if (price <= 200.00 && price >= 100.00) {
            newPrice = price * 0.8;
            System.out.println("PARA COMPRAS ENTRE 100 E 200 REAIS, TEMOS 20% DE DESCONTO!\n Com 20%% de desconto o seu produto fica no valor de: R$" + newPrice);
        }
    }
}
