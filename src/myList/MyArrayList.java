package myList;

import java.util.StringJoiner;

public class MyArrayList <T> {
    private static final int initialSize = 8;

    private Object [] data;
    private int size;

    public MyArrayList()
    {
        data = new Object[initialSize];
    }

    public void add (T value){
        data[size] = value;
        size++;
    }

    public int size() {
        return size;
    }

    public T get(int i) {
        return (T) data[i];
    }

    public void remove(int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        data[--size] = null;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }


    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(", ");
        for (int i = 0; i < size; i++) {
            result.add(data[i].toString());
        }

        return "[" + result + "]";
    }

}
