import java.util.Scanner;

public class GuessTheRandomNumber_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number");

        int numb = sc.nextInt();
        int random = (int) Math.floor(Math.random() * 10) + 1;
        while (numb != random) {
            System.out.println("Wrong number guess again");
            numb = sc.nextInt();

            if (numb > random) {
                System.out.println("The number is greater than the actual number!");
            } else if (numb < random) {
                System.out.println("The number is less than the actual number!");
            } else {
                System.out.println("Bingo! The corrent answer is " + random);
            }
        }
        sc.close();
    }
}
