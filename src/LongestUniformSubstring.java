import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LongestUniformSubstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		
		int[] out = getLongestUniformSubstring(inp);
		System.out.println(Arrays.toString(out));

	}

	private static int[] getLongestUniformSubstring(String inp) {
		ArrayList<Character> alpha = new ArrayList<>();
		ArrayList<Integer> count = new ArrayList<>();
		char ch = inp.charAt(0);
		int co = 1;
		for(int i=1; i<inp.length(); i++) {
			if(ch == inp.charAt(i)) {
				co++;
			}
			else {
				alpha.add(ch);
				count.add(co);
				co =1;
				ch = inp.charAt(i);
			}
		}
		alpha.add(ch);
		count.add(co);
		int[] out = new int[2];
		int max = Collections.max(count);
		char maxchar = alpha.get(count.indexOf(max));
		for(int i=0; i<inp.length(); i++) {
			if(maxchar == inp.charAt(i)) {
				out[0] = i;
				break;
			}
		}
		
		out[1] = max;
		return out;
	}

}
