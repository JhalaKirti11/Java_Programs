// Square root of a number...

public class SquareRootOfNumber{
   public static void main(String[] args){
			int n = sc.nextInt();
			int i = 1;
			while(i < n/2) {
			int square = i*i;
			if(square == n) {
				System.out.println(i);
				break;
			}
      else if(square > n) {
			System.out.println(i-1);
			break;
			}
				i++;
			}
  }
}
