package myList;

import java.util.Arrays;

public class ArrayListTests {
    public static void main(String[] args) {


        MyArrayList<Integer> list = new MyArrayList<>();

        list.add(1);
        System.out.println(list);
        list.add(5);
        System.out.println(list);
        list.add(1);
        System.out.println(list);
        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list);
        System.out.println(list.size());
        list.clear();
        System.out.println(list);
    }
}
