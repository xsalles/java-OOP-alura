package coin.calculate;

public class ConvertCurrency implements ConvertyFinancial{
    private double dollar;
    private double real = 5.51;

    public double getDollar() {
        return dollar;
    }

    public void setDollar(double dollar) {
        this.dollar = dollar;
    }

    public double getReal() {
        return real;
    }

    @Override
    public double getConvertDollarToReal() {
        return getDollar() * getReal();
    }
}
