package MyHashMap;

public class HashMapTests {
    public static void main(String[] args) {
        MyHashMap<String, String> myHashMap = new MyHashMap<String, String>();
        myHashMap.put("A", "B");
        myHashMap.put("E", "F");
        myHashMap.put("H", "P");
        myHashMap.put("P", "2");
        myHashMap.put("1",  "G");
        myHashMap.put("2", "6");
        myHashMap.put("3", "2");
        myHashMap.put("4", "4");
        myHashMap.put("1",  "H");


        System.out.println(myHashMap);
        System.out.println("Size of Map is " + myHashMap.size());
        System.out.println("Value for A is " + myHashMap.get("A"));
        myHashMap.remove("2");
        System.out.println("Size of Map is " + myHashMap.size());
        System.out.println(myHashMap);


        myHashMap.clear();
        System.out.println(myHashMap + "HashMap is empty");
    }
}
