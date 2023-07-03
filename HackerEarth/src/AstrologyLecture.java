
public class AstrologyLecture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int in = 3;
		System.out.println("The pattern is : ");
		getTrapeziumPattern(3);

	}

	private static void getTrapeziumPattern(int n) {
		String[] arr = new String[2*n-1];
		String star = "*";
		String dot = ".";
		for(int i=0; i< arr.length; i++) {
			arr[i] = star.repeat(2*n - 1);
		}
		//System.out.println(Arrays.deepToString(arr));
		List<String> res = new ArrayList<>();
		for(int i=1; i<=n ; i++) {
			arr[i-1] = arr[i-1].substring(0,n-i)+ dot.repeat(i);
			arr[i-1] = arr[i-1] + new StringBuffer(arr[i-1]).reverse().substring(1);
			//System.out.println(arr[i-1]);
			res.add(arr[i-1]);
		}
		List<String> result = new ArrayList<>();
		result.addAll(res);
		Collections.reverse(res);
		res.remove(0);
		result.addAll(res);
		for(String s : result) {
			System.out.println(s);
		}
		// int i, j;
		// for (i = 0; i < n; i++) {
  //           for (j = 0; j < n; j++) {
  //               if (j < n - i - 1)
  //                   System.out.print("*");
  //               else
  //                   System.out.print(".");
  //           }
  //           for (j = 0; j < n - 1; j++) {
  //               if (j < i)
  //                   System.out.print(".");
  //               else
  //                   System.out.print("*");
  //           }
  //           System.out.println();
  //       }
  //       for (i = 2; i <= n; i++) {
  //           for (j = 0; j < n; j++) {
  //               if (j < i - 1)
  //                   System.out.print("*");
  //               else
  //                   System.out.print(".");
  //           }
  //           for (j = 0; j < n - 1; j++) {
  //               if (j < n - i)
  //                   System.out.print(".");
  //               else
  //                   System.out.print("*");
  //           }
  //           System.out.println();
  //       }
	}

}
