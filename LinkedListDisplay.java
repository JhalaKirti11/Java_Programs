class Node {
    public int data;
    public Node next;

    Node(int data) {
        this.data = data;
    }
}
public class LinkedListDisplay {
    public static void display(Node head) {
        if (head == null) {
            System.out.println("No item!");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(1);
        Node d = new Node(9);
        Node e = new Node(7);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
    }
}
