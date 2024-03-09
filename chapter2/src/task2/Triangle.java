package task2;

//code by 2023511593黄俊博
public class Triangle implements Shape {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        if (side1 < 0 || side2 < 0 || side3 < 0) {
            throw new IllegalArgumentException("边长不能为负数");
        }
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
            throw new IllegalArgumentException("三个边长数不能构成三角形");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle() {
        this(1, 1, 1);
    }

    @Override
    public double getPer() {
        return side1 + side2 + side3;
    }

    @Override
    public double getArea() {
        double s = getPer() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2));
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
