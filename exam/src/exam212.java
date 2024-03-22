import java.util.HashSet;

class studentMsg {
    private String name;
    private int age;
    private int score;

    // 构造方法
    public studentMsg(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    // 重写hashCode方法
    @Override
    public int hashCode() {
        return name.hashCode();
    }

    // 重写equals方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        studentMsg student = (studentMsg) o;
        return name.equals(student.name);
    }

    // 重写toString方法
    @Override
    public String toString() {
        return "【 姓名：" + name + "，年龄：" + age + "，成绩：" + score + " 】";
    }
}

public class exam212 {
    public static void main(String[] args) {
        HashSet<studentMsg> studentSet = new HashSet<>();

        // 存储5个Student对象
        studentMsg student1 = new studentMsg("黄俊博", 20, 100);
        studentMsg student2 = new studentMsg("张三",22,95);
        studentMsg student3 = new studentMsg("张三",23,100);
        studentMsg student4 = new studentMsg("李四",23,90);
        studentMsg student5 = new studentMsg("李四",24,100);

        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student4);
        studentSet.add(student5);

        // 遍历输出学生信息
        System.out.println("学生信息如下：");
        for (studentMsg student : studentSet) {
            System.out.println(student);
        }
    }
}
