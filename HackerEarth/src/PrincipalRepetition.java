import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PrincipalRepetition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> rollnum = Arrays.asList(new Integer[] {6,1,3,3,4,3,3,4,4});
		System.out.println("Number of mails to be deleated : "+getRepetition(rollnum));

	}

	private static int getRepetition(List<Integer> rollnum) {
		// TODO Auto-generated method stub
		List<Integer> c = new ArrayList<>();
		List<Integer> unique = rollnum.stream().distinct().collect(Collectors.toList());
		for(int i=0; i< unique.size(); i++) {
			if(Collections.frequency(rollnum, unique.get(i)) > 1) {
				c.add(Collections.frequency(rollnum, unique.get(i)) -1);
			}
		}
		System.out.println(c);
		return c.stream().mapToInt(i -> i).sum();
	}

}
