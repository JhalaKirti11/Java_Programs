
class Interest{
    public static void simpleInterest(int p, int r, int t){
        int si = (p*r*t)/100;
        System.out.println(si);
    }
}
    public class CalculateSimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter principle amount: ");
        int p = sc.nextInt();

        System.out.print("enter the rate: ");
        int r = sc.nextInt();

        System.out.print("enter the time period: ");
        int t = sc.nextInt();
        
        Interest.simpleInterest(p,r,t);
        sc.close();
    }
}
