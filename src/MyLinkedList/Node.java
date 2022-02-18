package MyLinkedList;

public class Node<N> {
    public N next;
    public N data;

    public Node(N dataValue) {
        next = null;
        data = dataValue;
    }
    public Node(N dataValue, N nextValue) {
        next = nextValue;
        data = dataValue;
    }
    public N getData() {
        return data;
    }
    public void setData(N dataValue) {
        data = dataValue;
    }
    public N getNext() {
        return next;
    }

    public void setNext(N nextValue) {
        next = nextValue;
    }

}

