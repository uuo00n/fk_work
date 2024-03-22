//code by 2023511593黄俊博

import java.util.Scanner;

public class exam211_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入百分制成绩：");
        int score = scanner.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("百分制成绩 " + score + " 的等级成绩：优秀！");
        } else if (score >= 80 && score < 90) {
            System.out.println("百分制成绩 " + score + " 的等级成绩：良好！");
        } else if (score >= 70 && score < 80) {
            System.out.println("百分制成绩 " + score + " 的等级成绩：中等！");
        } else if (score >= 60 && score < 70) {
            System.out.println("百分制成绩 " + score + " 的等级成绩：及格！");
        } else if (score >= 0 && score < 60) {
            System.out.println("百分制成绩 " + score + " 的等级成绩：不及格！");
        } else {
            System.out.println("输入的成绩不合法！");
        }

        scanner.close();
    }
}
