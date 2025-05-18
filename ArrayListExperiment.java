import java.util.*;

public class ArrayListExperiment {
        public static void main(String[] args) {

                System.out.println("1:  create the list:");
                ArrayList<String> al = new ArrayList<>();
                al.add("Black");
                al.add("White");
                al.add("Purple");
                al.add("Red");
                System.out.println(al);

                System.out.println("\n2: iterate the elements:");
                al.iterator();
                System.out.println(al);
                // for(int i = 0; i<al.size(); i++){
                // System.out.println(al.get(i));
                // }

                System.out.println("\n3: insert element at 1st index:");
                al.add(0, "Blue");
                System.out.println(al);

                System.out.println("\n4: retrive an element:");
                System.out.println(al.get(3));

                System.out.println("\n5: update an element:");
                al.set(4, "Yellow");
                System.out.println(al);

                System.out.println("\n6: remove the 3rd element:");
                al.remove(3);
                System.out.println(al);

                System.out.println("\n7: search for element:");
                System.out.println(al.indexOf("White"));

                System.out.println("\n8: sort array list:");
                Collections.sort(al);
                System.out.println(al);

                System.out.println("\n9: copy one arrayList to another");
                // ArrayList<String> newAL2 = new ArrayList<>(al);
                System.out.println(al.clone());

                System.out.println("\n10: shuffle:");
                Collections.shuffle(al);
                System.out.println(al);

                System.out.println("\n11: reverse the element");
                System.out.println(al.reversed());

                System.out.println("\n12: check if two list are eqquals:");
                ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Black", "Pink", "Orange"));
                System.out.println(al.equals(arrayList));


                System.out.println("\n13: Swap the elements:");
                Collections.swap(al, 0, 3);
                System.out.println(al);

                System.out.println("\n14: trimming the capacity:");
                al.trimToSize();
                System.out.println(al);

                System.out.println("\n15: using elements' position:");
                for (int i = 0; i < al.size(); i++) {
                        System.out.println(al.get(i));
                }
        }
}
