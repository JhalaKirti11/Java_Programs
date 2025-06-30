interface Person{
    void show();
}
public class AnonymousClassExample{
    public static void main(String[] args){
        Person p = new Person(){
            public void show(){
                System.out.println("show Data");
            }
        };
        p.show();
    }
}
