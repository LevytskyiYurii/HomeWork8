package MyLinkedList;

public class MyLinkedList <N> {
    private static int counter;
    public Node<N> head;

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

    public void add(N value){
        if (head == null){
            head = new Node<>(value);
        }
        Node<N> temp = new Node<>(value);
        Node<N> current =  head;

        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        incrementCounter();
    }

    public int size() {
        return getCounter();
    }

    public void remove(int index) {
        Node<N> current = head;
        if (head != null) {
            for (int i = 0; i < index; i++) {
               current = current.getNext();
            }
            current.setNext(current.getNext().getNext());

            decrementCounter();
        }
    }

    public N get(int index){
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
            return (N) current.getData();
        }
        return (N) current;
    }

    public N clear(){
        return (N) (head = null);
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
