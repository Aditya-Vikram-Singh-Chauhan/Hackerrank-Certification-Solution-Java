import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr1 = Arrays.asList(new Integer[] {0,1,2,1,2,3});
		System.out.println("Longest Substring : "+longSubstring(arr1));
		List<Integer> arr2 = Arrays.asList(new Integer[] {1,2,3,4,5});
		System.out.println("Longest Substring : "+longSubstring(arr2));
		List<Integer> arr3 = Arrays.asList(new Integer[] {2,2,1});
		System.out.println("Longest Substring : "+longSubstring(arr3));
		List<Integer> arr4 = Arrays.asList(new Integer[] {1,1,1,3,3,2,2});
		System.out.println("Longest Substring : "+longSubstring(arr4));

	}

	private static int longSubstring(List<Integer> arr) {
		int n = arr.size();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            List<Integer> w = new ArrayList<>();
            int cnt = 0;
            for (int j = i; j < n; j++) {
                if (w.contains(arr.get(j))) {
                    cnt++;
                    continue;
                }
                if (w.size() == 0) {
                    w.add(arr.get(j));
                } else if (w.size() == 1) {
                    if (Math.abs(w.get(0) - arr.get(j)) > 1) {
                        break;
                    } else {
                        w.add(arr.get(j));
                    }
                } else {
                    break;
                }
                cnt++;
            }
            ans = Math.max(ans, cnt);
        }
        return ans;
	}

}
