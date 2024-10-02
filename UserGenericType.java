// user defined generic :

 class Box<T>{
    T container;
    public Box(T container){
        this.container = container;
    }

    public T getContValue(){
        return container;
    }

    public boolean comparision(T name, T naam){
        boolean isEqual = false;
        if(name == naam){
            isEqual = true;
        }
        return isEqual;
    }

    public void performTask(){
        if(container instanceof String){
            System.out.println("length of "+ container+" is "+(((String)this.container).length()));
        }else if(container instanceof Integer){
            System.out.println("This is int value "+ container);
        }
    }
}
public class UserGenericType {
    public static void main(String[] args) {
        String name = "Bob";
        String naam = "Josef";
        Box<String> b = new Box<>(name);
        String value = b.getContValue();
        System.out.println(value);

        boolean isEqual = b.comparision(name, naam);
        System.out.println("isEqual "+isEqual);
        b.performTask();
    }
    
}
