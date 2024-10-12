// check the enteres nuber of series is in increasing or decreasing order...
import java.util.Scanner;
class checkOrder{
    public String incres_decres(int x, int y, int z){
            String order = "unsystametic";
        if(x>y&&x>z&&y>z){
            order = "decresing";

        }else if(x<y&&x<z&&y<z){
            order = "incresing";
        }
        return order;
        }
    }
    
    class SeriesIncresOrDecres {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        checkOrder obj = new checkOrder();
        String order = obj.incres_decres(a,b,c);
        System.err.println("it's a "+ order+ " order");
        sc.close();
    }
}
