import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SubarraySum {

	public static void main(String[] args) {
		List<Integer> numbers1 = new ArrayList<>();
		numbers1.add(5); numbers1.add(10); numbers1.add(10);
		List<Integer> numbers2 = new ArrayList<>();
		numbers2.add(-5); numbers2.add(0);
		
		List<List<Integer>> queries1 = new ArrayList<>();
		List<Integer> in = new ArrayList<>();
		in.add(1); in.add(2); in.add(10);
		queries1.add(in);
		List<List<Integer>> queries2 = new ArrayList<>();
		List<Integer> inn = new ArrayList<>();
		inn.add(2); inn.add(2); inn.add(20);
		List<Integer> innn = new ArrayList<>();
		innn.add(1); innn.add(2); innn.add(10);
		queries2.add(inn); queries2.add(innn);
//		
//		System.out.println(numbers1+" "+queries1);
//		System.out.println(numbers2+" "+queries2);
		
		System.out.println("The Sum is : "+findSum(numbers1, queries1));
		System.out.println("The Sum is : "+findSum(numbers2, queries2));

	}

	private static List<Long> findSum(List<Integer> numbers, List<List<Integer>> queries) {
		
		int c = (int) numbers.stream().filter(i -> i == 0).count();
		//System.out.println(c);
		List<Long> sum = new ArrayList<>();
		// TODO Auto-generated method stub
		queries.stream().forEach(i -> {
			int start = i.get(0);
			int end = i.get(1);
			int zero = i.get(2);
			long s = IntStream.range(start-1, end).mapToLong(j -> (long)numbers.get(j)).sum();
			System.out.println(s);
			if(c > 0) {
				s = s+c*zero;
			}
			sum.add(s);
		});
		return sum;
	}

}
