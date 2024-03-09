package task1;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        super();
        this.radius = 0;
    }

    public Circle(double radius) {
        super();
        setRadius(radius);
        calculateArea();
        calculatePerimeter();
    }

    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            System.out.println("半径不能为负数");
        }
    }

    private void calculateArea() {
        this.area = Math.PI * radius * radius;
    }

    // 计算周长
    private void calculatePerimeter() {
        this.perimeter = 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }
}
