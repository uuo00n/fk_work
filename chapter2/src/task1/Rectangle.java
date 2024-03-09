package task1;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {
        super();
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(double width, double height) {
        super();
        setDimensions(width, height);

    }

    public void setDimensions(double width, double height) {
        if (width >= 0 && height >= 0) {
            this.width = width;
            this.height = height;
        } else {
            System.out.println("宽高不能为负数");
        }
    }

    private void calculateArea() {
        this.area = width * height;
    }

    private void calculatePerimeter() {
        this.perimeter = 2 * (width + height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
