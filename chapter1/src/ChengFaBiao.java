/*
这个包会在默认包里---没有package语句
编程练习1-1 输出ATM界面
copyright：23软件(3+2)一班黄俊博

(1)如何实现代码格式化 Ctrl + Alt + L
(2)如何对齐:\t,\n
 */
public class ChengFaBiao {
    public static void main(String[] args) {
        //双重for循环实现乘法表输出
        System.out.println("--------黄俊博的乘法表--------");
        for (int i = 1; i <= 9; i++) {
            //输出第i行的各列,各列要对齐！
            for (int j = 1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+"\t");//第i行 第j列---不换行
            }
            //换行
            System.out.print("\n");
        }
    }
}
