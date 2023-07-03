import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WierdNotWierd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> inp = Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8,9,10,33,32,1,4,5,22,21});
		System.out.println("Wierd and non Wierd inputs are : ");
		System.out.println(wierdNotWierd(inp));

	}

	private static List<String> wierdNotWierd(List<Integer> inp) {
		// TODO Auto-generated method stub
		List<String> res = new ArrayList<>();
		inp.stream().forEach(i -> {
			if(i%2 != 0) {
				res.add("Weird");
			}
			else {
				if(i>=2 && i<=5) {
					res.add("Not Weird");
				}
				if(i>=6 && i<=20) {
					res.add("Weird");
				}
				if(i>20) {
					res.add("Not Weird");
				}
			}
		});
		return res;
	}

}
