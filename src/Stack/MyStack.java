package Stack;
import java.util.StringJoiner;

public class MyStack <T> {
    private static final int initialSize = 8;

    Object[] stack;
    int size;
    int front;
    int rear;

    public MyStack() {
        stack = new Object[initialSize];
    }

    public void push(T value) {
        stack[rear] = value;
        rear++;
        size++;
    }

    public void remove(int index)
    {
        System.arraycopy(stack, index + 1, stack, index, size - 1);
        size--;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            stack[i] = null;
        }
        size = 0;
    }

    public int size()
    {
        return size;
    }

    public T peek()
    {
        return (T) stack[rear-1];
    }

    public T pop()
    {
        T lastObject = (T) stack[rear-1];
        size--;
        return lastObject;
    }


    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(", ");
        for (int i = 0; i < size; i++) {
            result.add(stack[front+i].toString());
        }

        return "[" + result + "]";
    }
}
