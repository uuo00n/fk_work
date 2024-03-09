package task1;

public class TestShape {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Triangle t1 = new Triangle(3, 4, 5);
        Rectangle r1 = new Rectangle(4, 6);
        System.out.println("23软件3+2一班黄俊博");
        System.out.println("半径为" + c1.getRadius() + "的圆面积为：" + c1.getArea() + "，周长为：" + c1.getPerimeter());
        System.out.println("边长为" + t1.getSide1() + "," + t1.getSide2() + "," + t1.getSide3() + "的三角形面积为：" + t1.getArea() + "，周长为：" + t1.getPerimeter());
        System.out.println("宽度为" + r1.getWidth() + "，高度为" + r1.getHeight() + "的长方形面积为：" + r1.getArea() + "，周长为：" + r1.getPerimeter());
    }
}
