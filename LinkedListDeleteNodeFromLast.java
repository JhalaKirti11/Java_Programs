class Node {
    public int data;
    public Node next;

    Node(int data) {
        this.data = data;
    }
}

public class LinkedListDeleteNodeFromLast {
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

    public static Node deleteFromLast(Node head, int index) {
        Node fast = head;
        Node slow = head;
        int size = 0;

        while (fast != null) {
            size++;
            fast = fast.next;
        }

        if (index < 0 || index >= size) {
            System.out.println("invalid input!");
            return head;
        }
        fast = head;
        for (int i = 0; i <= index; i++) {
            fast = fast.next;
        }
      
        if (fast == null) {
            head = head.next;
        } else {
            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }
            slow.next = slow.next.next;
        }
        System.out.println("removed successfully");
        return head;
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
        System.out.println();
        a = deleteFromLast(a, 4);
        display(a);
    }
}
