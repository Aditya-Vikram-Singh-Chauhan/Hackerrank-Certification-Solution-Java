import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> dictionary1 = new ArrayList<>();
		dictionary1.add("hack"); dictionary1.add("a"); dictionary1.add("rank"); dictionary1.add("khac"); dictionary1.add("ackh");
		dictionary1.add("kran"); dictionary1.add("rankhacker"); dictionary1.add("a"); dictionary1.add("ab"); dictionary1.add("ba");
		dictionary1.add("stairs"); dictionary1.add("raits");
		List<String> dictionary2 = new ArrayList<>();
		dictionary2.add("heater"); dictionary2.add("cold"); dictionary2.add("clod"); dictionary2.add("reheat");
		dictionary2.add("docl");
		List<String> dictionary3 = new ArrayList<>();
		dictionary3.add("listen"); dictionary3.add("tow"); dictionary3.add("silent"); dictionary3.add("lisent");
		dictionary3.add("two");
		dictionary3.add("abc"); dictionary3.add("no"); dictionary3.add("on");

		List<String> query1 = new ArrayList<>();
		query1.add("a"); query1.add("nark"); query1.add("bs"); query1.add("hack"); query1.add("stair");
		List<String> query2 = new ArrayList<>();
		query2.add("codl"); query2.add("heater"); query2.add("abcd");
		List<String> query3 = new ArrayList<>();
		query3.add("two"); query3.add("bca"); query3.add("no"); query3.add("listen");
		
		System.out.println("Number of String Anagram for each of the queries are : "+stringAnagram(dictionary1, query1));
		System.out.println("Number of String Anagram for each of the queries are : "+stringAnagram(dictionary2, query2));
		System.out.println("Number of String Anagram for each of the queries are : "+stringAnagram(dictionary3, query3));
	}

	private static List<Long> stringAnagram(List<String> dictionary, List<String> query) {
		// TODO Auto-generated method stub
		List<Long> an = new ArrayList<>();
		dictionary.stream().forEach(j -> {
			Stream<Character> characterStream = j.chars()
					  .mapToObj(c -> (char) c).sorted();
			 dictionary.set(dictionary.indexOf(j), characterStream.map(c->c.toString()).collect(Collectors.joining()));
		});
		query.stream().forEach(j -> {
			Stream<Character> characterStream = j.chars()
					  .mapToObj(c -> (char) c).sorted();
			 query.set(query.indexOf(j), characterStream.map(c->c.toString()).collect(Collectors.joining()));
		});
		System.out.println(dictionary);
		System.out.println(query);
		query.stream().forEach(i -> {
			long n = dictionary.stream().filter(j -> j.equalsIgnoreCase(i)).count();
			an.add(n);
		});
		return an;
	}

}
