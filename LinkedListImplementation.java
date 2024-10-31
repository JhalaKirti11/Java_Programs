class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class LinkedListMethodImplementation {
    Node head = null;
    Node tail = null;

    public void insert(int val) {
        Node temp = new Node(val);
        if (head == null) {
            this.head = temp;
        } else {
            tail.next = temp;
        }
        tail = temp;
    }

    public void display() {
        Node temp = head;
        if (temp == null) {
            return;
        } else {
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
}

public class LinkedListImplementation {
    public static void main(String[] args) {
        LinkedListImplementation lli = new LinkedListImplementation();
            lli.insert(3);
            lli.insert(7);
            lli.insert(4);
            lli.insert(9);
        System.out.println("Display all the elements of the linked list:");
            lli.display();
    }
}
