package task2;

//code by 2023511593黄俊博
public class DrawShape {
    public static void draw(Shape s) {
        System.out.println("这个图形的面积是：" + s.getArea() + "；周长是：" + s.getPer());
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("我设计的三角形三边：" + triangle.getSide1() + "，" + triangle.getSide2() + "，" + triangle.getSide3());
        draw(triangle);

        // 创建长方形对象并输出
        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println("我设计的长方形宽：" + rectangle.getWidth() + "，高：" + rectangle.getHeight());
        draw(rectangle);
    }
}
