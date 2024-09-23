class X {
    void calculate(int a, int b)    {
        System.out.println("Class X");
    }
}
 
class Y extends X   {
    //Override
    void calculate(int a, int b)    {
        System.out.println("Class Y");
    }
}
 
class Z extends Y   {
    @Override
    void calculate(int a, int b)  {
        System.out.println("Class Z");
    }
}
 
class MainClass {
    public static void main(String[] args)  {
        try{
        X x = new Y();
        x.calculate(10, 20);
 
        Y y = (Y) x;
        y.calculate(50, 100);
        
        Z z = (Z) y;
        z.calculate(100, 200);

        Y ab = new Z();
        ab.calculate(10,30);
        X cd = (X)ab;
        cd.calculate(30,40);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            System.out.println("Exception occures");
        } 
    } 
}
