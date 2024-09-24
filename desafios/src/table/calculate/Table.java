package table.calculate;

public class Table implements TableMultiplication{
    private int number;

    @Override
    public void calcTable(int number) {
        for (int i = 2; i < 11; i++) {
            System.out.println(number * i);
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
