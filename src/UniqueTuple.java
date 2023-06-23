import java.util.Arrays;
import java.util.List;

public class UniqueTuple {

	public static void main(String[] args) {
		
		int first = 5;
		int second = 7;
		
		System.out.println("First number is :"+first);
		System.out.println("Second number is :"+second);
		
		swapValues(first, second);
		System.out.println("First number is :"+first);
		System.out.println("Second number is :"+second);

	}

	public static void swapValues(int first, int second) {
		
		first = first - second;
		second = first + second;
		first = second - first;
		//System.out.println("First number is :"+first);
		//System.out.println("Second number is :"+second);
		return;
		
		
	}

}
