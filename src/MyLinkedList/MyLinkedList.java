package MyLinkedList;

public class MyLinkedList {
    private static int counter;
    private Node head;

    public MyLinkedList(){
    }

    private static int getCounter() {
        return counter;
    }

    private static void incrementCounter() {
        counter++;
    }

    private void decrementCounter() {
        counter--;
    }

    public void add(Object value){
        if (head == null){
            head = new Node(value);
        }
        Node temp = new Node(value);
        Node current = head;

        if (current != null){
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(temp);
        }
        incrementCounter();
    }

    public int size() {
        return getCounter();
    }

    public void remove(int index) {
        boolean removed;
        if (index < 1 || index > size())
            removed = false;

        Node current = head;
        if (head != null) {
            for (int i = 0; i < index; i++) {
                if (current.getNext() == null)
                    removed = false;

                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());

            decrementCounter();
            removed = false;
        }
        removed = false;
    }

    public Object get(int index){
        if (index < 0)
            return null;
        Node current = null;
        if (head != null) {
            current = head.getNext();
            for (int i = 0; i < index; i++) {
                if (current.getNext() == null)
                    return null;
                current = current.getNext();
            }
            return current.getData();
        }
        return current;
    }

    public Object clear(){
        return head = null;
    }

    public String toString() {
        StringBuilder output = new StringBuilder();

        if (head != null) {
            Node current = head.getNext();
            while (current != null) {
                output.append("[").append(current.getData().toString()).append("]");
                current = current.getNext();
            }

        }
        return output.toString();
    }
}
