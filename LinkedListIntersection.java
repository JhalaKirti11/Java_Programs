class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}
class Solution {
    public Node getIntersectionNode(Node headA, Node headB) {
        Node tempA = headA;
        Node tempB = headB;
        int la = 0;
        int lb = 0;

        while (tempA != null) {
            la++;
            tempA = tempA.next;
        }
        while (tempB != null) {
            lb++;
            tempB = tempB.next;
        }
        tempA = headA;
        tempB = headB;

        if (la > lb) {
            for (int i = 0; i < la - lb; i++) {
                tempA = tempA.next;
            }
        } else if (lb > la) {
            for (int i = 0; i < lb - la; i++) {
                tempB = tempB.next;
            }
        }

        while (tempA.data != tempB.data) {
            tempA = tempA.next;
            tempB = tempB.next;
        }

        // while (tempA != tempB) {
        // tempA = tempA.next;
        // tempB = tempB.next;
        // }
      
        return tempA;
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
}

class LinkedListB {
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
}

public class LinkedListIntersection {
    public static void main(String[] args) {
        LinkedListA lla = new LinkedListA();
        lla.insertAtFirst(64);
        lla.insertAtFirst(48);
        lla.insertAtFirst(32);
        lla.insertAtFirst(20);
        lla.insertAtFirst(77);
        lla.insertAtFirst(51);
        lla.insertAtFirst(33);

        LinkedListB llb = new LinkedListB();
        llb.insertAtFirst(64);
        llb.insertAtFirst(48);
        llb.insertAtFirst(25);
        llb.insertAtFirst(57);
        llb.insertAtFirst(15);

        Solution sl = new Solution();
        Node c = sl.getIntersectionNode(lla.head, llb.head);
        System.out.println("Both lists intersected at " + c.data);
    }
}
