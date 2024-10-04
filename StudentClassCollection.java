package hm;
import java.util.ArrayList;
import java.util.Iterator;

class Student{
    String name;
    int eng;
    int java;
    int c;

    public Student(String name, int eng, int java, int c){
        this.name = name;
        this.eng = eng;
        this.java = java;
        this.c = c;
    }
    public String getName(){
        return name;
    }

    public int getTotalMarks(){
        return eng+java+c;
    }

    public String toString(){
        return this.name + " " + this.eng + " " + this.java + " " + this.c;
    }
}

 class StudentClassCollection{
    public static void main(String[] args){
        ArrayList<Student> ar = new ArrayList<>();
        ar.add(new Student("Neha",75,80,70));
        ar.add(new Student("Babita",65,73,59));
        ar.add(new Student("Raju",75,87,60));
        ar.add(new Student("Karan",56,72,80));
        ar.add(new Student("Hari",88,59,68));


    // iterate the name starts with "H":
        for(Student i :ar){
            if(i.getName().startsWith("H")){
                System.out.println(i);
            }
        }


    // Remove the name starts with "B":
        Iterator<Student> itr = ar.iterator();
        while(itr.hasNext()){
            if(itr.next().getName().startsWith("B")){
                itr.remove();
            }
        }
        System.out.println("List is: "+ar);

        
    // Average of the total marks of all the students:
        int total = 0;
        for(Student i : ar){
            total = total+i.getTotalMarks();
        }
        double avg= total/ar.size();
        System.out.println("Average marks: "+avg);
    }
}
