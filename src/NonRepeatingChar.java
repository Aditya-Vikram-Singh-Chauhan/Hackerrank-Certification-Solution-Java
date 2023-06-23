import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class NonRepeatingChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		char out = getNonRepeatingChar(inp);
		System.out.println("Non Repeating Char is : "+out);

	}

	private static char getNonRepeatingChar(String inp) {
		int[] store = new int[26];
		
		for(int i = 0; i < inp.length(); i++) {
			store[inp.charAt(i) - 'a']++;
			System.out.println(Arrays.toString(store));
		}
		System.out.println(Arrays.toString(store));
		for(int i=0; i<inp.length(); i++) {
			if(store[inp.charAt(i) - 'a'] == 1) {
				return inp.charAt(i);                                                               
			}
		}
		return 0;
	}

}
