package MyHashMap;

public class MyHashMap<K, V> {
    private final int initialSize = 8;
    private Entry<K, V> table[];
    private Entry<K, V> next;

    public MyHashMap(){
        table = new Entry[initialSize];
    }

    public void put(K key, V value) {
        int hash = key.hashCode() % initialSize;
        Entry<K, V> e = table[hash];

        if (e == null) {
            table[hash] = new Entry<K, V>(key, value);
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
        }
        return e;
    }


}
