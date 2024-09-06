
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class ListIteratorExample {        // with Integer and String
    public static void main(String[] args){

//  ArrayList of Integer:
        ArrayList<Integer> arint = new ArrayList<>();
        arint.add(34);
        arint.add(52);
        arint.add(87);
        arint.add(19);
        arint.add(22);
        System.out.println("ArrayList: "+arint);

    ListIterator<Integer> li  = arint.listIterator();
    System.out.println("List in forward direction: ");
    while(li.hasNext()){
        System.out.print(li.next()+" ");
    }

    System.out.println("\nList in backward direction: ");
    while(li.hasPrevious()){
        System.out.print(li.previous()+" ");
    }

    System.out.println("\n");


//  ArrayList of String:
    ArrayList<String> arst = new ArrayList<>(Arrays.asList("Krishna","Radha","Balram","Shiv","parwati"));

    System.out.println("String ArrayList: "+arst);

    ListIterator<String> it = arst.listIterator(arst.size());
                                            // if backward direction is 1st to call then use .size();
                                            // otherwise don't in case of forward direction;
    System.out.print("from backward: ");
    while(it.hasPrevious()){
        System.out.print(it.previous()+" ");
    }

    System.out.print("\nfrom forward: ");
    while(it.hasNext()){
        System.out.print(it.next()+" ");
    }
    }    
}
