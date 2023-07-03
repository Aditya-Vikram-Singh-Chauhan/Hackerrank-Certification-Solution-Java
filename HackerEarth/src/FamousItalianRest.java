import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FamousItalianRest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> wealth = Arrays.asList(new Integer[] {1,2,3,4,5,6,7});
		int n = 3;
		System.out.println("Number of valid pairs : "+getValidPairs(wealth, n));
		List<Integer> wealth1 = Arrays.asList(new Integer[] {1,2,3});
		int n1 = 3;
		System.out.println("Number of valid pairs : "+getValidPairs(wealth1, n));

	}

	private static int getValidPairs(List<Integer> wealth, int n) {
		// TODO Auto-generated method stub
		List<Integer> sum = new ArrayList<>();
		wealth.stream().forEach(i -> {
			IntStream.range(wealth.indexOf(i)+1, wealth.size()).forEach(j -> {
				//System.out.println(wealth.get(j)+"  "+i);
				sum.add(wealth.get(j) + i);
			});
		});
		//System.out.println(sum);
		List<Integer> res = new ArrayList<>();
		sum.stream().forEach(i -> {
			if((Math.log10(i)/Math.log10(3)) - (int)(Math.log10(i)/Math.log10(3)) == 0) {
				res.add(i);
				//System.out.println((Math.log10(i)/Math.log10(3))+"  "+(int)(Math.log10(i)/Math.log10(3)));
			}
		});
		//System.out.println(res);
		return (int)res.stream().count();
	}

}
