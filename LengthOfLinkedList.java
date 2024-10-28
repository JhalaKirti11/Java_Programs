public class LengthOfLinkedList{
    public static class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

// length of the Nodes in LinkedList :-
public static int linkedListLength(Node head){
    int count = 0;
    Node temp = head;
    while (temp!= null){
        count++;
        temp = temp.next;
    }
    return count;
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
      System.out.println("Length of the LinkedList: "+linkedListLength(n1));
    }
}
