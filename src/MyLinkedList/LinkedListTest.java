package MyLinkedList;

public class LinkedListTest {
    public static void main(String[] args) {


       MyLinkedList<String> List = new MyLinkedList<String>();

        List.add("a");
        List.add("b");
        List.add("c");
        List.add("d");
        List.add("e");


        System.out.println("Print: LinkedList:   " + List);
        System.out.println(".size():  " + List.size() + "(return size of list)");
        System.out.println(".get(3):  " + List.get(3) + " (get element at index:3)");
        System.out.println(".get(3):  " + List.get(2) + " (get element at index:2)");

        List.remove(1);

        System.out.println(".remove(1):  "  + "(remove element at index: 1)");
        System.out.println(".size():  " + List.size() + " (return size of list)");
        System.out.println("Print new: LinkedList:   " + List);

        List.clear();

        System.out.println("Print new: LinkedList:   " + List);

        MyLinkedList<Integer> List2 = new MyLinkedList<Integer>();
        List2.add(1);
        List2.add(2);
        List2.add(3);
        List2.add(4);

        System.out.println("Print Integer: LinkedList:   " + List2);
    }
}
