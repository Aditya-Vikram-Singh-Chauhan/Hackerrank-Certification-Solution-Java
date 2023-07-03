import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inp = "JAVA IS GREAT AND JAVA IS GOOD";
		System.out.println("Non Repeating characters are : "+getNonRepeatingChars(inp));

	}

	private static String getNonRepeatingChars(String inp) {
		// TODO Auto-generated method stub
		List<Character> nonRep = new ArrayList<>();
		inp = inp.replaceAll("\\s", "");
		List<String> in = Arrays.asList(inp.split(""));
		System.out.println(inp);
		System.out.println(in);
		in.stream().forEach(i -> {
			if(Collections.frequency(in, i) == 1) {
				nonRep.add(i.charAt(0));
			}
		});
		System.out.println(nonRep);
		return nonRep.toString();
	}

}
