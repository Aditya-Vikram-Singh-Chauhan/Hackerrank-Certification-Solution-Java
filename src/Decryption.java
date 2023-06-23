import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Decryption {

	public static void main(String[] args) {
		String inp = "world hel2o mis2is2ipy";
		System.out.println("Encrypted String : "+inp);
		System.out.println("Decrypted String : "+getDecryptedString(inp));

	}

	private static String getDecryptedString(String inp) {
		StringBuilder builder = new StringBuilder();
		char previousChar = ' ';
		for (char c : inp.toCharArray()) {
		    if (Character.isDigit(c)) {
		        builder.append(String.join("", Collections.nCopies(Character.getNumericValue(c) - 1, String.valueOf(previousChar))));
		        continue;
		    }

		    builder.append(c);
		    previousChar = c;
		}
		List<String> li = Arrays.asList(builder.toString().split(" "));
		Collections.reverse(li);
		return li.toString().substring(1,li.toString().length()-1).replace(",", "");
	}

}
