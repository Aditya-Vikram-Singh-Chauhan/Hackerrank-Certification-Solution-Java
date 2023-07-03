import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TargetFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inp = {2,7,11,15};
		int[] out = targetFromArray(inp,9);
		System.out.println("The indicies which add up to target are : "+"["+out[0]+","+out[1]+"]");

	}

	private static int[] targetFromArray(int[] inp, int target) {
		int[] result = new int[2];
		// This map will store the difference and the corresponding index
        Map<Integer, Integer> map = new HashMap<>();
        // Loop through the entire array
        for (int i = 0; i < inp.length; i++) {
            // If we have seen the current element before
            // It means we have already encountered the other number of the pair
            if (map.containsKey(inp[i])) {
                // Index of the current element
                result[0] = i;
                // Index of the other element of the pair
                result[1] = map.get(inp[i]);
            }
            // If we have not seen the current before
            // It means we have not yet encountered any number of the pair
            else {
                // Save the difference of the target and the current element
                // with the index of the current element
                map.put(target - inp[i], i);
            }
        }
        Arrays.stream(result).forEach(System.out::println);
        return result;
	}

}
