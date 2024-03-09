package task2;

/*
这个类会在task2中，改进 编程练习 1-1 输出ATM界面
实现键盘输入：
三步：导入类、创建对象、实现输入
copyright：23软件(3+2)一班黄俊博
 */


import java.util.Scanner;//导入Scanner类

public class ATMmanage {
    public static void main(String[] args) {
        //创建Scanner对象，封装键盘
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        //实现输入
        while (true) {
            printATM();
            input = scanner.nextInt();//Alt+回车
            //根据用户输入来执行指定的功能---多分支结构
            switch (input) {
                case 1:
                    System.out.println("存款中......");
                    break;
                case 2:
                    System.out.println("取款中......");
                    break;
                case 3:
                    System.out.println("查询余额......");
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("输入错误，别无选择！！！！！");
            }
        }
    }

    public static void printATM() {
        System.out.println("我是23软件(3+2)一班黄俊博");
        System.out.println("---欢迎使用ATM存取款系统---");
        System.out.println("1.存款");
        System.out.println("2.取款");
        System.out.println("3.查询余额");
        System.out.println("4.退出");
        System.out.println("请输入你的选择(1~4)");
    }
}
