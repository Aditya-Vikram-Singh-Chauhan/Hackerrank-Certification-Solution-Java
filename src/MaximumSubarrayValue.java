import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumSubarrayValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr1 = Arrays.asList(new Integer[] {-1,-4,2});
		System.out.println("Maximum Subarray Value is : "+maxSubarrayValue(arr1));
		List<Integer> arr2 = Arrays.asList(new Integer[] {1,-1,1,-1,1});
		System.out.println("Maximum Subarray Value is : "+maxSubarrayValue(arr2));
		List<Integer> arr3 = Arrays.asList(new Integer[] {-1,2,3,4,-5});
		System.out.println("Maximum Subarray Value is : "+maxSubarrayValue(arr3));

	}

	private static int maxSubarrayValue(List<Integer> arr) {
		List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        even.add(0);
        odd.add(0);
        for (int i = 0; i < arr.size(); i++) {
            if (i % 2 == 0) {
                even.add(even.get(even.size() - 1) + arr.get(i));
                odd.add(odd.get(odd.size() - 1));
            } else {
                even.add(even.get(even.size() - 1));
                odd.add(odd.get(odd.size() - 1) + arr.get(i));
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size() + 1; j++) {
                int a = even.get(j) - even.get(i);
                int b = odd.get(j) - odd.get(i);
                ans = Math.max(ans, (a - b) * (a - b));
            }
        }
        return ans;
	}

}
