class Node {
    public int data;
    public Node next;

    Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head = null;
    Node tail = null;
    int size = 0;

    public void insertAtFirst(int item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
        return;
    }

    public void insertAtLast(int item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void insertAtSpecificPosition(int item, int position) {
        Node newNode = new Node(item);
        if (position < 0 || position > size) {
            System.out.println("Invalid position");
            return;
        } else if (position == 0) {
            insertAtFirst(item);
        } else if (position == size) {
            insertAtLast(item);
        } else {
            int i = 0;
            Node temp = head;
            while (temp != null) {
                if (i == position - 1) {
                    newNode.next = temp.next;
                    temp.next = newNode;
                    break;
                }
                i++;
                temp = temp.next;
            }
            size++;
        }
    }
}

public class LinkedListInsertionMethods {
    public static void main(String[] args) {
        LinkedList lln = new LinkedList();
        lln.insertAtFirst(4);
        lln.insertAtFirst(7);
        lln.insertAtFirst(5);
        lln.insertAtFirst(3);
        lln.insertAtFirst(9);
        lln.insertAtLast(6);
        lln.insertAtLast(1);
        lln.insertAtSpecificPosition(11,0);
        lln.insertAtSpecificPosition(77, 7);
        lln.insertAtSpecificPosition(45, 9);
    }
}
