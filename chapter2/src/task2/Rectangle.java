package task2;

//code by 2023511593黄俊博
public class Rectangle implements Shape {
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    private double width, height;

    public Rectangle(double width, double height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("边长不能为负数");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPer() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
