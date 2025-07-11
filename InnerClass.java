public class InnerClass {
    void m1(){
        class inner1{
            void software(){
                System.out.println("inner class 1/ software class");
            }
        }
        class inner2 extends inner1{
            void programming(){
                System.out.println("inner class 2/ programming class");
            }
        }
        inner2 i = new inner2();
        i.software();
        i.programming();
    }

    public static void main(String[] args){
        InnerClass o = new InnerClass();
        o.m1();
  // approach 2 to call the m1 method at the same thime of creating the;
        //new InnerClass().m1();     
    }
}


