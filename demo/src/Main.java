import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> studentMap = new HashMap<>();

        studentMap.put("202301", "张三");
        studentMap.put("202302", "张三");
        studentMap.put("202301", "李四");
        studentMap.put("202304", "钱红");
        studentMap.put("202305", "王五");

        System.out.println("学生信息：");
        for (Map.Entry<String, String> entry : studentMap.entrySet()) {
            System.out.println("---- " + entry.getKey() + ":" + entry.getValue());
        }


        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要删除的学生学号：");
        String studentIdToDelete = scanner.nextLine();

        if (studentMap.containsKey(studentIdToDelete)) {
            studentMap.remove(studentIdToDelete);
            System.out.println("学生信息删除成功！");
        } else {
            System.out.println("未找到该学生学号，无法删除！");
        }
        
        System.out.println("删除后的学生信息：");
        for (Map.Entry<String, String> entry : studentMap.entrySet()) {
            System.out.println("---- " + entry.getKey() + ":" + entry.getValue());
        }

        scanner.close();
    }
}
