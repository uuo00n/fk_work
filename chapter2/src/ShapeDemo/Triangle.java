package ShapeDemo;

public class Triangle implements Shape {
    //封装边长属性--提供getter，setter方法
    private double a, b, c;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }


    public Triangle(double a, double b, double c) {
        //合法性判断---三个边长是否可以构成三角形 边长不能负数值
        if (a > 0 && b > 0 && c > 0) {
            if ((a + b > c) && (a + c > b) && (b + c > a)) {
                this.a = a;
                this.b = b;
                this.c = c;
            } else {
                System.out.println("不满足任意两边之和大于第三边的条件");
            }
        } else {
            System.out.println("边长不能负数值！");
        }
    }

    public Triangle() {

    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        //海伦公式：已知三边求面积
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
