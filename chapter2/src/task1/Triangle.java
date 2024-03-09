package task1;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        super();
        this.side1 = 0;
        this.side2 = 0;
        this.side3 = 0;
    }

    public Triangle(double side1, double side2, double side3) {
        super();
        setSides(side1, side2, side3);
        calculatePerimeter();
        calulayeArea();
    }

    private void setSides(double side1, double side2, double side3) {
        if (side1 >= 0 && side2 >= 0 && isValid(side1, side2, side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            System.out.println("三角形边长不能为负数，并必须满足三角形条件");
        }
    }

    private boolean isValid(double a, double b, double c) {
        return (a + b > c) && (b + c > a) && (a + c > b);
    }

    private void calulayeArea() {
        double s = (side1 + side2 + side3) / 2;
        this.area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    private void calculatePerimeter() {
        this.perimeter = side1 + side2 + side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
}
