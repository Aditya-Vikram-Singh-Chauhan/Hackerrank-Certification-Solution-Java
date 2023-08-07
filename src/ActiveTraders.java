import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ActiveTraders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arr1 = Arrays.asList(new String[] {"Omega", "Alpha", "Omega", "Alpha", "Omega", "Alpha", "Omega", "Alpha", 
				"Omega", "Alpha", "Omega", "Alpha", "Omega", "Alpha", "Omega", "Alpha", "Omega", "Alpha", "Omega", "Beta"});
		System.out.println("Sorted Sum is : "+activeTraders(arr1));
		List<String> arr2 = Arrays.asList(new String[] {"Alpha","Beta","Zeta","Beta","Zeta","Zeta","Epsilon","Beta","Zeta",
				"Beta","Zeta","Beta","Delta","Zeta","Beta","Zeta","Beta","Zeta","Beta","Zeta","Beta"});
		System.out.println("Sorted Sum is : "+activeTraders(arr2));
		List<String> arr3 = Arrays.asList(new String[] {"Bigcorp","Bigcorp","Acme","Bigcorp","Zork","Zork","Abc","Bigcorp",
				"Acme","Bigcorp","Bigcorp","Zork","Bigcorp","Zork","Zork","Bigcorp","Acme","Bigcorp","Acme","Bigcorp",
				"Acme","Littlecorp","Nadircorp"});
		System.out.println("Sorted Sum is : "+activeTraders(arr3));

	}

	private static List<String> activeTraders(List<String> arr) {
		// TODO Auto-generated method stub
		
		Map<String, Double> active = arr.stream().distinct()
				.collect(Collectors.toMap(key -> String.valueOf(key), value -> (double)(Collections.frequency(arr, value)*100)/arr.size()));
		//System.out.println(active);
		List<String> res = new ArrayList<>();
		for(Entry<String, Double> en : active.entrySet()) {
			if(en.getValue() >= 5) {
				res.add(en.getKey());
			}
		}
		Collections.sort(res);
		return res;
	}

}
