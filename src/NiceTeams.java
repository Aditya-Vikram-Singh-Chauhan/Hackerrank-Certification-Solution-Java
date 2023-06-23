import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NiceTeams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> rating = new ArrayList<>();
		Integer[] arr1 = {1,2,3,4,5,6};
		Integer[] arr2 = {1,1,1,1};
		Integer[] arr3 = {3,4,5,2,1,1};
		rating.add(Arrays.asList(arr1));
		rating.add(Arrays.asList(arr2));
		rating.add(Arrays.asList(arr3));
		List<Integer> minDiff = new ArrayList<>();
		minDiff.add(4); minDiff.add(1); minDiff.add(3);
		rating.stream().forEach(i -> {
			System.out.println("Number of Nice Teams for "+i+" is : "+getNiceTeam(i,minDiff.get(rating.indexOf(i))));
		});

	}

	private static int getNiceTeam(List<Integer> rating, Integer minDiff) {
		// TODO Auto-generated method stub
		Collections.sort(rating);
		List<Integer> rate = rating.stream().distinct().collect(Collectors.toList());
		//System.out.println(rate);
		int n =rate.size();
		List<Integer> diff = new ArrayList<>();
		IntStream.range(0,n).forEach(i -> {
			IntStream.range(i+1, n).forEach(j -> {
				//System.out.println(rate.get(i) - rate.get(j));
				if(Math.abs(rate.get(i) - rate.get(j)) == minDiff) {
					diff.add(Math.abs(rate.get(i) - rate.get(j)));
				}
			});
		});
		//System.out.println(diff);
		
		return diff.size();
	}

}
