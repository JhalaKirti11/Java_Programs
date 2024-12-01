class A{
   public void present(){
    int a = 5;
    int b = 3;
    int sum = a+b;
    System.out.println("Parent class : Sum = " + sum);
   }
    }
    class B extends A{
        public void present(){
            int a = 7;
            int b = 2;
            int subs = a-b;
            System.out.println("Child class : Subs = "+ subs);
        }
        public void walk(){
            System.out.println("Child's walk() method is invoking parent's present() method with 'super' keyword!");
            super.present();
        }
    }

public class ParentMethodInvokedByChild {
    public static void main(String[] a){
        B obj = new B();
        obj.present();
        //A obj1 = new B();
        obj.walk();
    }
}
