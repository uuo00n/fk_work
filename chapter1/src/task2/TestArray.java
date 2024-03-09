package task2;

public class TestArray {
    public static void testFor1(int[] arr) {
        //以两种方式遍历输出数组
        System.out.println("-------for循环方式输出数组-------");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("-------增强for方式输出数组-------");
        for (int x : arr) {
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void printArray(int[] arr) {//格式化输出数组
        System.out.print("数组为：[");
        for (int i = 0;i<arr.length-1;i++){
            System.out.print(arr[i]+",");//输出最后1个元素之前的每个元素及分隔符号
        }
        System.out.println(arr[arr.length-1]+"]");//输出最后一个元素
    }

    public static void main(String[] args) {
        //初始化数组
        int[] num = {10, 20, 30, 50, 100};
        //调用方法
        System.out.println("黄俊博");//自己的姓名
        testFor1(num);
        printArray(num);
    }
}
