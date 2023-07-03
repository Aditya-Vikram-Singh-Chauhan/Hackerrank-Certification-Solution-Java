import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MaxCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inp = "aaaaAAAA";
		String inp1 = "Pulkit is a dog!!!!!!!!!!!!";
		System.out.println("Character with the maximum count is : "+ getMaxCharaterInString(inp));
		System.out.println("Character with the maximum count is : "+ getMaxCharaterInString(inp1));

	}

	private static String getMaxCharaterInString(String inp) {
		// TODO Auto-generated method stub
		Map<Character, Integer> hm = new HashMap<>();
		List<String> ch = Arrays.asList(inp.replaceAll("\\s", "").split(""));
		System.out.println(ch);
		ch.stream()
		.forEach(j -> {
			hm.put(j.charAt(0), hm.getOrDefault(j.charAt(0), 0)+ 1);
		});
		System.out.println(hm);
		int max = Collections.max(hm.values());
		char cha = 0;
		for (Entry<Character, Integer> entry : hm.entrySet()) {
		    if (entry.getValue()==max) {
		        cha = entry.getKey();
		    }
		}
		return cha+" "+max;
	}

}
