package MyHashMap;

public class MyHashMap<K, V> {
    private int size = 0;
    private final int initialSize = 20;
    public Entry<K, V>[] table;

    public MyHashMap(){
        table = new Entry[initialSize];
    }

    public void put(K key, V value) {
        int hash = key.hashCode() % initialSize;
        Entry<K, V> e = table[hash];

        if (e == null) {
            table[hash] = new Entry<K, V>(key, value);
            size++;
        }
    }

    public V get(K key){
        int hash = key.hashCode() % initialSize;
        Entry<K, V> e = table[hash];
        if (e == null){
            return null;
        }
        while (e != null){
            if (e.getKey() == key){
                return e.getValue();
            }
            e = e.next;
        }
        return null;
    }

    public Entry<K, V> remove(K key){
        int hash = key.hashCode() % initialSize;
        Entry<K, V> e = table[hash];
        if (e == null){
            return null;
        }
        if (e.getKey() == key){
            table[hash] = e.next;
            e.next = null;
            size--;
        }
        return e;
    }
    public void clear(){
        for (int i = 0; i < initialSize; i++) {
            table[i] = null;
        }
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < initialSize; i++) {
            if (table[i] != null) {
                sb.append(table[i]).append("\n");
            }
        }
        return sb.toString();
    }
}
