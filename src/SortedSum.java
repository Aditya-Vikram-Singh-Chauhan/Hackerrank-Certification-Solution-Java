import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortedSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr1 = Arrays.asList(new Integer[] {4,3,2,1});
		System.out.println("Sorted Sum is : "+sortedSum(arr1));
		List<Integer> arr2 = Arrays.asList(new Integer[] {9,5,8});
		System.out.println("Sorted Sum is : "+sortedSum(arr2));
		List<Integer> arr3 = Arrays.asList(new Integer[] {5,9});
		System.out.println("Sorted Sum is : "+sortedSum(arr3));

	}

	private static int sortedSum(List<Integer> arr) {
		// TODO Auto-generated method stub
		long p = 1000000007;
		String n = "";
		List<Integer> sum = new ArrayList<>();
		for(int i=0; i< arr.size(); i++) {
			n = n + arr.get(i);
		}
		//.out.println(n);
		List<String> r = new ArrayList<>();
		for(int i=0; i< arr.size(); i++) {
			r.add(n.substring(0,i));
		}
		r.add(n); r.remove(0);
		//System.out.println(r);
		r.stream().map(i -> i.split("")).forEach(j -> {
			sum.add(getSum(j));
		});
		//System.out.println(r);
		//System.out.println(sum);
		long ss = sum.stream().mapToLong(i -> (long)i).sum();
		return (int) (ss%p);
	}

	private static Integer getSum(String[] j) {
		// TODO Auto-generated method stub
		Collections.reverse(Arrays.asList(j));
		Collections.sort(Arrays.asList(j));
		//System.out.println("reverse : "+Arrays.asList(j));
		int s = 0;
		for(int i=0; i< j.length; i++) {
			//System.out.println(i+1+"   "+Integer.parseInt(j[i]));
			s = s + ((i+1)*Integer.parseInt(j[i]));
			//System.out.println(s);
		}
		return s;
	}

}
