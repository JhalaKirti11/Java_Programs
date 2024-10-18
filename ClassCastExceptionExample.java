class Parent{
    String name ="Exception";
    String typeName(){
        System.out.println(name);
    return name;
}
}
class Child extends Parent{
    String identity(){
        System.out.println("child class");
        return "Child Class";
    }
}
public class ClassCastExceptionExample {
    public static void main(String[] args){
        System.out.println("Hello");
       try{
        Parent p = new Parent();
        Child c = (Child)p;
            c.identity();
            c.typeName();
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println();
    }
}
