package access;
import modifiers.accessClass;
 class calculate extends accessClass{
    public int sum = a+12;
    public void calc(){
        add();
    }
}

public class CallClass {
    public static void main(String[] args){
        calculate ob = new calculate();
        System.out.println(ob.sum);
        ob.calc();
    }   
}
