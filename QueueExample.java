import java.util.*;
public class QueueExample {
    public static void main(String[] args) {
        Queue<String> qu = new LinkedList<>();
        qu.add("neha");
        qu.add("komal");
        qu.add("pooja");
        qu.add("riya");
        qu.add("sita");
        System.out.println(qu);

        System.out.println("1st element: qu.peek(): " + qu.peek()); // giving 1st element;
        System.out.println("1st element: qu.element(): " + qu.element());
        qu.offer("naina"); // add the elelment at last position;
        System.out.println(qu);
        qu.poll(); // Retrieves and removes the head of this queue;
                   // if queue is null, print null;
        System.out.println("\nto remove the 1st element: qu.poll():");
        System.out.println(qu);
        qu.remove(); // if queue is null throw exception
        System.out.println("qu.remove():" + qu); // remove the 1st element;
        System.out.println("\nqu.hashCode() " + qu.hashCode());
    }
}
