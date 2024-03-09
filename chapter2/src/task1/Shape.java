package task1;

public class Shape {
    protected double area;
    protected double perimeter;

    public Shape(){
        this.area = 0;
        this.perimeter = 0;
    }

    public Shape(double area,double perimeter){
        this.area = area;
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
