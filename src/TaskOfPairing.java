import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class TaskOfPairing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr1 = {3,5,4,3};
		Integer[] arr2 = {5,6,2};
		List<List<Integer>> freqs = new ArrayList<>();
		freqs.add(Arrays.asList(arr1));
		freqs.add(Arrays.asList(arr2));
		freqs.stream().forEach(i ->{
			System.out.println("Number of pairings for "+i+" is : "+taskOfPairing(i));
		});

	}

	private static int taskOfPairing(List<Integer> freq) {
		// TODO Auto-generated method stub
		List<Integer> count = new ArrayList<>();
		IntStream.range(0, freq.size()).forEach(i ->{
			if(freq.get(i)%2 == 0) {
				count.add(freq.get(i)/2);
			}
			else {
				count.add(freq.get(i)/2);
				if(i < freq.size()-1) {
					freq.set(i+1, freq.get(i+1)+1);
				}
			}
		});
		System.out.println(count);
		return count.stream().mapToInt(i -> i).sum();
	}

}
