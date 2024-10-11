// Check whether the guessed number is equal to the solution of the problem or not...

import java.util.Scanner;
public class GuessedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		    int n = 60/2 + 70 - 50;	
		    int guess;
            System.out.print("Enter the guessed number: ");
		    do {
			    guess = sc.nextInt();
			        if(guess > n) {
				        System.out.println("Too high, try again.");
			        }else if(guess < n){
				        System.out.println("Too low, try again.");
			        }else {
				        System.out.println("Great");
			        }
		    }while(guess == n);
		        sc.close();
	}
}
