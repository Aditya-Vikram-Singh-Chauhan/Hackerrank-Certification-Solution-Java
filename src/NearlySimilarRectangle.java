import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class NearlySimilarRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> sides1 = new ArrayList<>();
		sides1.add(Arrays.asList(new Integer[] {5,10}));sides1.add(Arrays.asList(new Integer[] {10,10}));
		sides1.add(Arrays.asList(new Integer[] {3,6}));sides1.add(Arrays.asList(new Integer[] {9,9}));
		
		System.out.println("Nearly Similar Rectangle : "+nearlySimilarRectangle(sides1));
		
		List<List<Integer>> sides2 = new ArrayList<>();
		sides2.add(Arrays.asList(new Integer[] {4,8}));sides2.add(Arrays.asList(new Integer[] {15,30}));
		sides2.add(Arrays.asList(new Integer[] {25,50}));
		
		System.out.println("Nearly Similar Rectangle : "+nearlySimilarRectangle(sides2));
		
		List<List<Integer>> sides3 = new ArrayList<>();
		sides3.add(Arrays.asList(new Integer[] {2,1}));sides3.add(Arrays.asList(new Integer[] {10,7}));
		sides3.add(Arrays.asList(new Integer[] {9,5}));sides3.add(Arrays.asList(new Integer[] {6,9}));
		sides3.add(Arrays.asList(new Integer[] {7,3}));
		
		System.out.println("Nearly Similar Rectangle : "+nearlySimilarRectangle(sides3));

	}

	private static int nearlySimilarRectangle(List<List<Integer>> sides) {
		Map<List<Integer>, Integer> d = new HashMap<>();
        for (List<Integer> side : sides) {
            int w = side.get(0);
            int h = side.get(1);
            int z = gcd(w, h);
            List<Integer> key = new ArrayList<>();
            key.add(w / z);
            key.add(h / z);
            d.put(key, d.getOrDefault(key, 0) + 1);
        }
        int ans = 0;
        for (int x : d.values()) {
            ans += (x * (x - 1)) / 2;
        }
        return ans;
    }
    public static int gcd(int a, int b) {
        return b > 0 ? gcd(b, a % b) : a;
    }

}
