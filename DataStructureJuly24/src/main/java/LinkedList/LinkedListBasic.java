package LinkedList;

public class LinkedListBasic {

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n1;
        System.out.println(isCircularLinkedList(n1));
    }

    public static boolean isCircularLinkedList(Node head){
        Node headNode = head;
        Node nextNode = headNode.next;
        while(nextNode != null){
            if(nextNode == head){
                return true;
            }
            nextNode = nextNode.next;
        }
        return false;
    }
}
