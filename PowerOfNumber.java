// Power of a number :- without a Function...

public class PowerOfNumber{
  public statis void main(String[] args){
    System.out.print("Enter a number : ");
			Scanner sc = new Scanner(System.in);
			int numb = sc.nextInt();
			int power = sc.nextInt();
			int ans = 1;
			while(power > 0) {
				ans = ans * numb;
				power--;
			}
				System.out.println(ans);
  	}
}
