import javafx.scene.transform.Scale;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

class Product implements Comparable<Product> {
    //封装商品属性：
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //重写方法

    @Override
    public int compareTo(Product o) {
        return id - o.id; //按照商品编号排序 ----- TreeSet自然排序
    }

    //按照商品编号排序；重写equals()方法，商品编号相同的是相同商品；
    @Override
    public boolean equals(Object obj) {
        Product obj1 = (Product) obj;
        return id == obj1.id;
    }
    //重写toString()方法，返回商品扦息，格式：   <商品编号:商品名,沑价>

    @Override
    public String toString() {
        return "<" + id + ":" + name + "," + price + ">";//返回商品扦息，格式：   <商品编号:商品名,沑价>
    }


}

class ShopCart {
    TreeMap<Product, Integer> Productmap = new TreeMap();//保存商品map集合 购物车对象
    double totalPrice = 0;//保存购物车商品map集合

    //添加商品
    public void add(Product product, int num) {
        if (!Productmap.containsKey(product)) {
            Productmap.put(product, num);
        } else {
            int before = Productmap.get(product);
            int after = Productmap.get(product);
            Productmap.put(product, after);
        }
        //计算总价
        totalPrice = totalPrice + product.getPrice() * num;
    }

    // 移除商品、
    public void remove(Product product, int num) {
        int before = Productmap.get(product);
        if (num >= before) {
            Productmap.remove(product);
            totalPrice = totalPrice - product.getPrice() * before;

        } else {
            int after = before - num;
            Productmap.put(product, after);
            totalPrice = totalPrice - product.getPrice() * num;
        }
    }

    // 清空扨物车
    public void clear() {
        Productmap.clear();
        totalPrice = 0.0;
    }

    // 打印商品；
    public void print() {
        System.out.println("------------------购物车商品清单-----------------------");
        System.out.println("商品数量\t\t商品信息\t\t\t 商品总价");
        Set<Product> key = Productmap.keySet();
        Iterator<Product> iter = key.iterator();
        while (iter.hasNext()) {
            Product p = iter.next();
            Integer i = Productmap.get(p);
            System.out.println("\t" + i + "\t" + p + "\t\t" + p.getPrice() * i);
        }
        System.out.println("----------------------------------");
        System.out.println("\t\t\t\t\t\t商品总价：" + totalPrice);

    }

}

public class ShoppingDemo {
    public static void main(String[] args) {
        //测试类ShoppingDemo。
        Product p1 = new Product(1001, "苹果", 5);
        Product p2 = new Product(1002, "香蕉", 6);
        Product p3 = new Product(1004, "蓝莓", 15);
        Product p4 = new Product(1003, "火龙果", 8);
        ShopCart shopCart = new ShopCart();

        shopCart.add(p1, 5);
        shopCart.add(p2, 3);
        shopCart.add(p3, 2);
        shopCart.add(p4, 2);
        shopCart.add(p1, 1);

        //打印
        System.out.println("第一次打印商品详单");
        shopCart.print();
        //减少商品的数量
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入减少的商品编号和数量：");
//        int id = scanner.nextInt(); //编号
//        int num = scanner.nextInt();//数量
        //遍历购物车查找编号为id的商品,如果有则添加，否则删除
//        TreeMap<Product, Integer> productmap = shopCart.Productmap;
//        for (productmap) {
//
//        }
        shopCart.remove(p4, 2);
        System.out.println("移除商品后的购物车");
        shopCart.print();
        System.out.println("结账，清空购物车");
        shopCart.clear();
        shopCart.print();

    }

}
