package stacks;

public class crudOps { // insert, delete and update operations  using array DS
    public static void main(String[] args) {
        Stack stack = new Stack(4);
        stack.addElement(1);
        stack.addElement(2);
        stack.addElement(3);
        stack.addElement(4);
        stack.addElement(5);

        System.out.println(stack.popElement());
    }
}


class Stack {

    private int[] arr;
    private int top;
    private int capacity;

    Stack(int capacity){
        this.arr = new int[capacity];
        this.top = 0;
        this.capacity = capacity;
    }

    public void addElement(int element){

        //before adding check if stack is full
        if(isFull()){
            System.out.println("Stack is full");
            System.exit(1);
        }
        System.out.println("Inserting element");
        arr[top++] = element;
    }

    public int popElement(){

        //check if stack is empty
        if(isEmpty()){
            System.out.println("Stack is empty, add elements first");
        }
        return arr[top--];
    }

    private boolean isEmpty() {
        return top == -1;
    }

    private boolean isFull() {
        return top == capacity;
    }

}
