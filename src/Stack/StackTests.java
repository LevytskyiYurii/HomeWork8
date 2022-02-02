package Stack;

public class StackTests {
    public static void main(String[] args) {

        MyStack<Integer> myStack = new MyStack<Integer>();

        myStack.push(10);
        myStack.push(16);
        myStack.push(1);
        myStack.push(12);
        myStack.push(19);
        System.out.println(myStack);
        System.out.println("Size is: " + myStack.size());

        System.out.println("Last number: " + myStack.peek());
        System.out.println("Call pop method " + myStack.pop());
        System.out.println(myStack);

        myStack.remove(2);
        System.out.println(myStack);


        myStack.clear();
        System.out.println(myStack);
    }
}