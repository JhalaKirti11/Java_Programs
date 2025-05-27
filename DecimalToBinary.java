//	converting decimal into binary...

public class DecimalToBinary{
	    public static void main(String[] args){
        System.out.print("Enter a decimal numer : ");
			int n = sc.nextInt();
			int ans = 0;
			int i = 0;
		    while(n > 0) {
			    int rem = n % 2;
			    ans = (int)(ans + rem*Math.pow(10,i));
			    n = n/2;
			  i++;
		  }
		  System.out.println(ans);
		}
}
