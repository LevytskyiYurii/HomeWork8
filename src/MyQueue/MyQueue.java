package MyQueue;

import java.util.Arrays;
import java.util.StringJoiner;

public class MyQueue {
    private static final int initialSize = 8;

    Object[] queue;
    int size;
    int front;
    int rear;

    public MyQueue(){
        queue = new Object[initialSize];
    }

    public void add(Object data)
    {
        queue[rear] = data;
        rear++;
        size++;
    }

    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(", ");
        for (int i = 0; i < size; i++) {
            result.add(queue[i].toString());
        }

        return "[" + result + "]";
    }
}
