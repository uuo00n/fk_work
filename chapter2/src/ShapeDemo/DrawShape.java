package ShapeDemo;

public class DrawShape {
    public static void draw(Shape s) {
        System.out.println("这个图形的面积是：" + s.getArea() + ":周长是：" + s.getPerimeter());
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("我设计的三角形三边：" + 3 + "." + 4 + "." + 5);
        draw(triangle);

    }
}
