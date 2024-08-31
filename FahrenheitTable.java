import java.util.Scanner;
public class FahrenheitTable{
    public static void printFahrenheitTable(int start, int end, int step) {
		for(int i = start; i <= end; i+=step) {
			int c = (i - 32)* 5/9;
			System.out.println(i +" "+ c);
		}
		return;
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int start = sc.nextInt();
			int end = sc.nextInt();
			int step = sc.nextInt();
			printFahrenheitTable(start, end, step);
            sc.close();
		}
}
