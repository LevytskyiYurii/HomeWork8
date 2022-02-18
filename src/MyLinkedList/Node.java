package MyLinkedList;

public class Node<N> {
    Node next;
    N data;

    public Node(N dataValue) {
        next = null;
        data = dataValue;
    }
    public Node(N dataValue, Node nextValue) {
        next = nextValue;
        data = dataValue;
    }
    public N getData() {
        return data;
    }
    public void setData(N dataValue) {
        data = dataValue;
    }
    public Node getNext() {
        return next;
    }

    public void setNext(Node nextValue) {
        next = nextValue;
    }

}

