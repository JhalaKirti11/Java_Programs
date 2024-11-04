class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class Solution {
    public Node middleElement(Node head) {
        Node temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int m = (0+size-1)/2;
        temp = head;
        for (int i = 0; i < m; i++) {
            temp = temp.next;
        }
        return temp;
    }
}

class LinkedListA {
    Node head = null;
    Node tail = null;

    public Node insertAtFirst(int item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        return head;
    }
    public void display() {
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
}

public class LinkedListMiddleElement {
    public static void main(String[] args) {
        LinkedListA lla = new LinkedListA();
        lla.insertAtFirst(64);
        lla.insertAtFirst(48);
        lla.insertAtFirst(32);
        lla.insertAtFirst(20);
        lla.insertAtFirst(77);
        lla.insertAtFirst(51);

        Solution sl = new Solution();
        lla.display();
        Node m = sl.middleElement(lla.head);
        System.out.println("\nMiddle Element: " + m.data);
    }
}
