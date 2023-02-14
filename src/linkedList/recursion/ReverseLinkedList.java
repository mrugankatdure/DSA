package linkedList.recursion;

public class ReverseLinkedList {

    private static class ListNode {

        ListNode next;
        int data;

        public ListNode(ListNode node, int data){
            this.next = node;
            this.data = data;
        }

        public ListNode(){}

    }

    public static void main(String[] args) {

        ListNode head  = new ListNode();
        head.data = 1;

        ListNode second = new ListNode();
        second.data = 2;

        ListNode third = new ListNode();
        third.data = 3;

        head.next = second;
        second.next = third;

        ReverseLinkedList reverseLinkedList  = new ReverseLinkedList();
        reverseLinkedList.reverseListIteratively(head);
        //ListNode reversedList = reverseLinkedList.reverseList(head);

//        ListNode currentNode = reversedList;
//        while(currentNode != null) {
//            System.out.print(currentNode.data);
//            currentNode = currentNode.next;
//            System.out.print(" ->");
//
//        }



    }

    public ListNode reverseList(ListNode head){

        //base cases here
        if(head == null || head.next == null) return head;

        ListNode curr = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return curr;
    }

    public ListNode reverseListIteratively(ListNode head){

        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        while (curr != null) {
           next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;
        }
        return head;
    }
}
