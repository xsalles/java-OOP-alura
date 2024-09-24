package rectangle_room.calculate;

public class MeasureRoom implements GeometryCalc {
    private double height;
    private double width;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calcPermiter(double height, double width) {
        return (getHeight() + getWidth()) * 2;
    }

    @Override
    public double calcArea(double height, double width) {
        return getHeight() * getWidth();
    }
}
