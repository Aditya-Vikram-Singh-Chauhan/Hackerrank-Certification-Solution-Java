import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VowelSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inp1 = "caberqiitefg";
		int k1 = 5;
		System.out.println("Maximum number of vowels are in the subString : "+findSubstring(inp1, k1));
		String inp2 = "aeiouia";
		int k2 = 3;
		System.out.println("Maximum number of vowels are in the subString : "+findSubstring(inp2, k2));
		String inp3 = "azerdii";
		int k3 = 5;
		System.out.println("Maximum number of vowels are in the subString : "+findSubstring(inp3, k3));
		String inp4 = "qwdftr";
		int k4 = 2;
		System.out.println("Maximum number of vowels are in the subString : "+findSubstring(inp4, k4));
	}

	private static String findSubstring(String inp, int k) {
		// TODO Auto-generated method stub
		List<String> sub = new ArrayList<>();
		int j=0;
		for(int i=0; i< inp.length(); i++) {
			if(i+k < inp.length()) {
				sub.add(inp.substring(i, i+k));
			}
			else if(i+k == inp.length()) {
				j = i;
				//n .e98A7System.out.println(j);
			}
		}
		sub.add(inp.substring(j));
		//System.out.println(sub);
		
		List<Integer> vowels = new ArrayList<>();
		sub.stream().forEach(i -> {
			vowels.add(i.replaceAll("(?i)[^aeiouy]", "").length());
		});
//		System.out.println(vowels.toString());
//		System.out.println(Collections.max(vowels));
//		System.out.println(vowels.indexOf(Collections.max(vowels)));
		if(Collections.max(vowels) == 0) {
			return "0";
		}
		else {
			return sub.get(vowels.indexOf(Collections.max(vowels)));
		}
	}

}
