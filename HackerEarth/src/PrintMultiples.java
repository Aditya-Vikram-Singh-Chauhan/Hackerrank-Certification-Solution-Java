import java.util.Scanner;
import java.util.stream.IntStream;

public class PrintMultiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		int n = sc.nextInt();
		
		System.out.println("The 10 Multples of "+n+" are : ");
		
		IntStream.range(1, 11).forEach(i ->{
			System.out.println(n + " x " + i + " = " + n*i);
		});
	}

}
