    import java.util.*;

    public class demo2 {

        public static void main(String[] args) {

            //1.创建HashMap存储学生信息---注意要泛型。存储位置由key的hashCode()决定

            Map<Integer,String> map=new HashMap<>();

            //添加元素

            map.put(202301,"张三");

            map.put(202302,"张三");

            map.put(202301,"李四");  //key重复的元素----会覆盖原来的元素！

            map.put(202305,"王五");

            map.put(202304,"钱红");

            //2.遍历Map集合输出学生信息----方法1：keySet()法；

            Set<Integer> keys = map.keySet();//返回map的键集合

            for (Integer key:keys) {

                System.out.println(key+":"+map.get(key)); //map.get(key)---返回key对应的值

            }

            //3.毕业时，需要用户输入学生的学号，并根据学号进行删除操作。

            Scanner scanner=new Scanner(System.in);

            int key = scanner.nextInt(); //输入学生学号

            map.remove(key);  //自动装箱---参数 key 相当于 new Integer(key)

            //遍历输出map集合---方法2：EntrySet法遍历Map集合

            Set<Map.Entry<Integer, String>> entries = map.entrySet();

            //迭代器法遍历Set集合

            Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();

            while (iterator.hasNext()){

                Map.Entry<Integer, String> entry=iterator.next();

                System.out.println(entry.getKey()+":"+entry.getValue());

            }

        }

    }


