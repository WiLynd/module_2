package ss10_dsa_list.bai_tap.array_list;

import java.util.ArrayList;
import java.util.List;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("Phú");
        list.add("Sơn");
        list.add("Hoàng");
        list.add("Ngọc");

        print(list.getData());
        System.out.println(list.indexOf("Phú"));
        System.out.println(list.indexOf("Hoàng"));
        list.remove(1);
        list.add("rất",1);
        print(list.getData());
        MyList<String> clone = list.clone();
        System.out.println(clone.contains("Ngọc"));
        System.out.println(clone.contains("Sơn"));
        System.out.println(clone.get(3));
        System.out.println(clone.size());
        clone.clear();
        System.out.println(clone.size());
        print(clone.getData());

    }

    static void print(Object[] list) {
        for (Object x : list) {
            if (!(x == null)) {
                System.out.println((String) x);
            }
        }
        System.out.println("\n");
    }
}