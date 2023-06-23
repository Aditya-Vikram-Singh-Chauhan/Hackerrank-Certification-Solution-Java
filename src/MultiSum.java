import java.util.Arrays;

public class MultiSum {

	public static void main(String[] args) {
		int[] in = {1,2,3,4,5};
		String[] inp = {"Java", "is", "the", "best"};
		System.out.println("Integer array multisum :"+getMultiSum(in));
		System.out.println("String array multisum :"+getMultiSum(inp));

	}

	private static String getMultiSum(String[] inp) {
		StringBuffer sb = new StringBuffer("");
		Arrays.stream(inp).forEach(i -> sb.append(i));
		return sb.toString();
	}

	private static int getMultiSum(int[] in) {
		int sum;
		sum = Arrays.stream(in).sum();
		return sum;
	}

}
