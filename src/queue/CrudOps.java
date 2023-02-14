package queue;

public class CrudOps {  // insert, delete and update operations using array DS

    public static void main(String[] args) {



    }
}


class Queue {

    private int[] arr;
    private int front, rear;
    private int SIZE = 5;

    Queue() {
        front = rear = -1;
    }

    public void enqueue (int element) {

        //check if queue is full
        if(isfull()) return;

        if(front == -1) front = 0;
        rear++;
        arr[rear] = element;
    }

    private boolean isfull() {
        return (front == 0 && rear == SIZE - 1);
    }

    public int dequeue () {

        int element;
        if(isEmpty()) {
            System.out.println("Queue is empty, add elements first");
            System.exit(1);
        }
        element = arr[front];
        if(front >= rear){
            front = rear = -1;
        }else {
            front++;
        }
        System.out.println("dequeue => " + element);
        return element;
    }

    private boolean isEmpty() {
        return front == -1;
    }


}
