public class ArithmeticExceptionExample {
    public static void main(String[] arg){
        try{
            int a[] = new int[5];
            a[5]= 30/0;
         }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception");
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occurs "+e);
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("parent Exception occurs");
        }
    }
}
