class Node {
    public int data;
    public Node next;

    Node(int data) {
        this.data = data;
    }
}

// Approach 01:
public class LinkedListNthNodeFromLast {
    public static void NthElement(Node head, int index) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        System.out.println("size " + size);

        if (index < 0 || index >= size) {
            System.out.println("Out Of Bound!");
        } else {
            temp = head;
            for (int i = 0; i < size - index - 1; i++) {
                temp = temp.next;
            }
            System.out.println("Element at index "+index+" from last: " + temp.data);
        }
    }

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
        NthElement(a, 3);
  
    }
}
