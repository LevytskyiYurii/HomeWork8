package MyQueue;

import java.util.StringJoiner;

public class MyQueue <T> {
    private static final int initialSize = 8;

    Object[] queue;
    int size;
    int front;
    int rear;

    public MyQueue(){
        queue = new Object[initialSize];
    }

    public void push(T value)
    {
        queue[rear] = value;
        rear++;
        size++;
    }

    public Object peek()
    {
        return queue[front];
    }

    public Object poll()
    {
        T value = (T) queue[front];
        front++;
        size--;
        return value;
    }

    public Object size()
    {
        return size;
    }
    public void remove(int index)
    {
        System.arraycopy(queue, index + 1, queue, index, size- 1);
        queue[size--] = null;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            queue[i] = null;
        }
        size = 0;
    }

    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(", ");
        for (int i = 0; i < size; i++) {
            result.add(queue[front+i].toString());
        }

        return "[" + result + "]";
    }
}
