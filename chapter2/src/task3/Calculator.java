package task3;

//code by 2023511593黄俊博

import java.util.Scanner;

public class Calculator {

    // 静态方法calculate，用于执行算术运算
    public static void calculate(double x, double y, char op) throws Exception {
        switch (op) {
            case '+':
                System.out.println("结果是：" + (x + y));
                break;
            case '-':
                System.out.println("结果是：" + (x - y));
                break;
            case '*':
                System.out.println("结果是：" + (x * y));
                break;
            case '/':
                if (y == 0) {
                    throw new Exception("除法运算除数为非法");
                }
                System.out.println("结果是：" + (x / y));
                break;
            default:
                throw new Exception("运算符非法");
        }
    }

    // 主方法，用于从键盘读取输入并调用calculate方法
    public static void main(String[] args) {
        System.out.println("code by 2023511593黄俊博");
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入第一个数：");
        double x = scanner.nextDouble();

        System.out.print("请输入第二个数：");
        double y = scanner.nextDouble();

        System.out.print("请输入运算符（+、-、*、/）：");
        char op = scanner.next().charAt(0);

        try {
            calculate(x, y, op);
        } catch (Exception e) {
            System.out.println("错误：" + e.getMessage());
        }

        scanner.close();
    }
}