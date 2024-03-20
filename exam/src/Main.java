//code by 2023511593黄俊博

import java.util.Scanner;
import java.util.TreeSet;

class Teacher implements Comparable<Teacher> {
    private String tid;
    private String name;

    public Teacher(String tid, String name) {
        this.tid = tid;
        this.name = name;
    }

    public String getTid() {
        return tid;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Teacher other) {
        return this.tid.compareTo(other.getTid());
    }

    @Override
    public String toString() {
        return "教工号：" + tid + "，姓名：" + name;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("code by 2023511593黄俊博");
        Scanner scanner = new Scanner(System.in);

        // 用TreeSet保存教师信息并按教工号从小到大排序
        TreeSet<Teacher> teachersAscending = new TreeSet<>();
        System.out.println("请输入4个教工号：");
        String t1 = scanner.nextLine();
        String t2 = scanner.nextLine();
        String t3 = scanner.nextLine();
        String t4 = scanner.nextLine();

        Teacher teacher1 = new Teacher(t1, "张三");
        Teacher teacher2 = new Teacher(t2, "张三");
        Teacher teacher3 = new Teacher(t3, "李四");
        Teacher teacher4 = new Teacher(t4, "张三");

        teachersAscending.add(teacher1);
        teachersAscending.add(teacher2);
        teachersAscending.add(teacher3);
        teachersAscending.add(teacher4);

        System.out.println("从小到大排序：");
        for (Teacher teacher : teachersAscending) {
            System.out.println(teacher);
        }

        // 用TreeSet保存教师信息并按教工号从大到小排序
        TreeSet<Teacher> teachersDescending = new TreeSet<>((tch1, tch2) -> tch2.getTid().compareTo(tch1.getTid()));
        teachersDescending.add(teacher1);
        teachersDescending.add(teacher2);
        teachersDescending.add(teacher3);
        teachersDescending.add(teacher4);

        System.out.println("从大到小排序：");
        for (Teacher teacher : teachersDescending) {
            System.out.println(teacher);
        }
    }
}
