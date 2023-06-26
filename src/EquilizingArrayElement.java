import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class EquilizingArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr1 = Arrays.asList(new Integer[] {1,2,3,4,5});
		System.out.println("Minimum number of operations : "+minOperations(arr1,3,2));
		List<Integer> arr2 = Arrays.asList(new Integer[] {64,30,25,33});
		System.out.println("Minimum number of operations : "+minOperations(arr2,2,2));
		List<Integer> arr3 = Arrays.asList(new Integer[] {1,2,3,4});
		System.out.println("Minimum number of operations : "+minOperations(arr3,4,3));
		

	}

	private static int minOperations(List<Integer> arr, int threshold, int divParam) {
		 Map<Integer, int[]> dp = new HashMap<>();
	        Collections.sort(arr);
	        int ans = Integer.MAX_VALUE;
	        for (int x : arr) {
	            int steps = 0;
	            while (true) {
	                dp.putIfAbsent(x, new int[]{0, 0});
	                dp.get(x)[0]++;
	                dp.get(x)[1] += steps;
	                if (dp.get(x)[0] >= threshold) {
	                    ans = Math.min(ans, dp.get(x)[1]);
	                }
	                if (x == 0) {
	                    break;
	                }
	                x /= divParam;
	                steps++;
	            }
	        }
	        return ans;
	}

}
