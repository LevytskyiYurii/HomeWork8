package MyLinkedList;

public class LinkedListTest {
    public static MyLinkedList<String> List;

    public static void main(String[] args) {


        List = new MyLinkedList<String>();

        List.add("1");
        List.add("2");
        List.add("3");
        List.add("4");
        List.add("5");


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
    }
}
