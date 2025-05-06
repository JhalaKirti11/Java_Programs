import java.util.*;

//  Without Generic we store multiple data of different type,
//  like int, char, float, string and so on within a single object;
// user define class for generics;

class GenericUsers<T> {
    T container;

    public GenericUsers(T container) {
        this.container = container;
    }

// method on Generic of specific type object:

    public void genericTask() {
        if (container instanceof String) {
            System.out.println("instance of String type: " + (((String) this.container).getClass()).getName());
        } else if (container instanceof Integer) {
            System.out.println("instance of integer type: " + this.container.getClass().getName());
        }
    }

    public T getValue() {
        return this.container;
    }
}
// ----: main class :----

public class GenericsTesting {
    public static void main(String[] args) {
        // String object: T will replace by String everywhere in GenericUsers class:
        GenericUsers<String> GU1 = new GenericUsers<String>("java is an easy language");

        // System.out.println(GU1.container);
        System.out.println(GU1); // output= GenericUsers@2f92e0f4
        System.out.println(GU1.getValue());

        // Integer object: T will replace by Innteger everywhere in GenericUsers class:
        GenericUsers<Integer> GU2 = new GenericUsers<Integer>(334);
        System.out.println(GU2);
        System.out.println(GU2.getValue());

        // get the user-defined class name of the object type;
        System.out.println("class name of String obj: " + GU1.getClass().getName()); // obj of which class
        System.out.println("class name of Integer obj: " + GU2.getClass().getName());

        // call the generic method to know the class type of the object;
        GU1.genericTask();
        GU2.genericTask();

        /*
         * // using build in classes for generics
         * // Integer type list:
         * List<Integer> intListObj = new ArrayList<>();
         * intListObj.add(2);
         * intListObj.add(0);
         * intListObj.add(1);
         * // listObj.add("hello"); // cmpile time error: cant pass string or other typr
         * value to integer
         * System.out.println(intListObj);
         * 
         * // String type list:
         * List<String> stringListObj = new ArrayList<>();
         * stringListObj.add("Hello");
         * stringListObj.add("Hii");
         * stringListObj.add("Hola");
         * System.out.println(stringListObj);
         */
    }
}
