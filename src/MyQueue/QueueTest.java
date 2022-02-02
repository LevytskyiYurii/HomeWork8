package MyQueue;


public class QueueTest {
    public static void main(String[] args) {
    MyQueue<Integer> q = new MyQueue<Integer>();
    q.push(15);
    q.push(20);
    q.push(56);
    q.push(20);
    q.push(56);

        System.out.println(q);
        System.out.println("Size is: " + q.size());

        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println("Size is: " + q.size()); // after poll;


        q.remove(3); // should be [20, 56, 56];
        System.out.println("Removed 3d element " + q);

        q.clear();
        System.out.println(q.size());
        System.out.println(q.peek()); // After clear() first element null;
    }
}
