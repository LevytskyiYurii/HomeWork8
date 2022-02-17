package MyHashMap;

public class Entry<K, V> {
    public K key;
    public V value;
    public Entry<K, V> next;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public Entry() {

    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        Entry<K,V> temp = this;
        StringBuilder sb = new StringBuilder();
        while (temp != null) {
            sb.append(temp.key).append(" -> ").append(temp.value);
            temp = temp.next;
        }
        return sb.toString();
    }
}
