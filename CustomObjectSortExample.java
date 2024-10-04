/*  How would you sort an ArrayList of custom objects,
like a Student class, based on their marks?
----------------***------------------------***-------------------------*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    String name;
    int marks;

    public Student(String name, int marks){
        this.name = name;
        this. marks = marks;
    }

    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }

    public String toString(){
        return "Student("+name+", "+marks+")";
    }
}

public class CustomObjectSortExample {
    public static void main(String[] args) {
        ArrayList<Student> st = new ArrayList<>();
        st.add(new Student("Nisha", 38));
        st.add(new Student("Nikita", 43));
        st.add(new Student("Pooja", 31));
        st.add(new Student("kirti", 41));
        System.out.println(st);

        Collections.sort(st, new Comparator<Student>(){
            @Override
            public int compare(Student ob1, Student ob2){
                return Integer.compare(ob1.getMarks(),ob2.getMarks());
            }
        }
        );

        for(Student i : st){
            System.out.println(i);
        }
    }
}
