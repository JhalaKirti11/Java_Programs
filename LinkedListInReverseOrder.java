// Display The LinkedList Nodes in Reverse Order :-

public class LinkedListInReverseOrder{
    public static class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
    public static void ReverseNodes(Node head){
        if(head == null){
            return;
        }
        ReverseNodes(head.next);
        System.out.print(head.data+" ");
    }
    public static void main(String[] args) {
        Node n1 = new Node(5);
        Node n2 = new Node(10);
        Node n3 = new Node(8);
        Node n4 = new Node(9);
        Node n5 = new Node(3);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        System.out.println("Print the nodes in reverse order");
        ReverseNodes(n1);
    }
}
