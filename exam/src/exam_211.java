import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student {
    String sno; // 学号
    String name; // 姓名

    public Student(String sno, String name) {
        this.sno = sno;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Student student = (Student) obj;
        return sno.equals(student.sno);
    }

    @Override
    public String toString() {
        return "【学号：" + sno + "，姓名：" + name + "】";
    }
}

public class exam_211 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // 添加5个Student对象到ArrayList集合中
        students.add(new Student("2023511593", "黄俊博"));
        students.add(new Student("2022020223", "李四"));
        students.add(new Student("2022020224", "王五"));
        students.add(new Student("2022020225", "赵六"));
        students.add(new Student("2022020226", "钱七"));

        // 使用forEach循环遍历输出集合
        System.out.println("使用forEach循环遍历输出集合：");
        for (Student student : students) {
            System.out.println(student);
        }

        // 使用迭代器遍历输出集合
        System.out.println("\n使用迭代器遍历输出集合：");
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
