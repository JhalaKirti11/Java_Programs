/* Given the head of a sorted linked list, delete the middle element.
Return the linked list sorted as well. */

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head = null;
    Node tail = null;
    int size = 0;
    public Node insertAtFirst(int item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
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

    public Node deleteMiddle(){
        Node temp = head;
        int size2 = 0;
        while(temp != null){
            size2++;
            temp = temp.next;
        }
        temp = head;
        int middle = (0+size)/2;
        for(int i= 0; i < middle-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
        return head;
    }
}

public class LinkedListDeleteMiddle02 {
    public static void main(String[] args) {
        LinkedList lla = new LinkedList();
          Node a = lla.insertAtFirst(64);
          Node b = lla.insertAtFirst(48);
          Node c = lla.insertAtFirst(32);
          Node d = lla.insertAtFirst(20);
          Node e = lla.insertAtFirst(77);
          Node f = lla.insertAtFirst(51);
          Node g = lla.insertAtFirst(3);
          Node h = lla.insertAtFirst(19);
          Node j = lla.insertAtFirst(14);
          Node i = lla.insertAtFirst(33);

        lla.display();
        i = lla.deleteMiddle();
        lla.display();
    }
}
