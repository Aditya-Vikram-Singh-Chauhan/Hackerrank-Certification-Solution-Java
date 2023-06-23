import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BitwiseAND {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = {10,7,2,8,3};
		List<Integer> arr1 = Arrays.asList(a);
		Integer[] b = {1,2,1,3};
		List<Integer> arr2 = Arrays.asList(b);
		Integer[] c = {0,2,4};
		List<Integer> arr3 = Arrays.asList(c);
		
		//System.out.println(arr1.toString()+"  "+arr2.toString()+"  "+arr3.toString());
		
		System.out.println("Number of bitwise power of 2 are : "+getBitWise(arr1));
		System.out.println("Number of bitwise power of 2 are : "+getBitWise(arr2));
		System.out.println("Number of bitwise power of 2 are : "+getBitWise(arr3));
		
		
		
		

	}

	private static int getBitWise(List<Integer> arr) {
		// TODO Auto-generated method stub
		List<Integer> bits = new ArrayList<>();
		IntStream.range(0, arr.size()).forEach(i -> {
			IntStream.range(i + 1, arr.size()).forEach(j -> {
				int n = arr.get(i) & arr.get(j);
				//System.out.println(arr.get(i)+"  "+arr.get(j)+"   "+n);
				bits.add(n);
			});
		});
		//System.out.println(bits);
		bits.removeAll(Arrays.asList(Integer.valueOf(0)));
		//System.out.println(bits);
//		bits.stream().forEach(i -> {
//			System.out.println((int)(Math.ceil((Math.log(i) / Math.log(2))))
//		            == (int)(Math.floor(((Math.log(i) / Math.log(2))))));
//		});
//		System.out.println(bits.stream().filter(i -> (int)(Math.ceil((Math.log(i) / Math.log(2))))
//	            == (int)(Math.floor(((Math.log(i) / Math.log(2)))))).count());
		return (int) bits.stream().filter(i -> (int)(Math.ceil((Math.log(i) / Math.log(2))))
	            == (int)(Math.floor(((Math.log(i) / Math.log(2)))))).count();
	}

}
