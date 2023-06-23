import java.util.Scanner;

public class Powerof10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		
		if(inp == 1) {
			System.out.println("True");
		}
		else {
			if(Math.log10(inp) - (int)Math.log10(inp) == 0) {
				System.out.println("True");
			}
			else {
				System.out.println("False");
			}
		}

	}

}
