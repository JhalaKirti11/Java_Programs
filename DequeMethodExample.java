import java.util.ArrayDeque;

public class DequeMethodExample {
    public static void main(String[] args){
        ArrayDeque<String> dq = new ArrayDeque<>();
        dq.addLast("orange");
        dq.addLast("yellow");
        dq.addLast("blue");
        dq.addLast("dark");
        dq.addFirst("light");
        dq.addLast("green");
       
        System.out.println(dq);

        System.out.println("\n========peek()=========");
        System.out.println("dq.peekFirst():    "+dq.peekFirst());
        System.out.println("dq.peek():        "+dq.peek());

        dq.push("red");     // method of stack not Queue; add the elem on 1st index;
        dq.offer("brown");  // add the elem on last position;
        System.out.println("\nAter push() and offer(): "+dq);
        dq.offerLast("offer()");
        System.out.println(dq);
        System.out.println(dq.add("pink"));

        System.out.println(dq);
        System.out.println("\ndq.getFirst(): "+dq.getFirst());
        System.out.println("dq.getLast(): " +dq.getLast());
        System.out.println(dq.offer("pink"));  
    }
}
