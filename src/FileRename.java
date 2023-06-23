import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FileRename {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] oo = {"ababa", "cccc", "abba"};
		String[] nn = {"aba", "ccc", "abc"};
		List<String> oldName = Arrays.asList(oo);
		List<String> newName = Arrays.asList(nn);
		
		List<Integer> res = new ArrayList<>();
		IntStream.range(0, oldName.size()).forEach(i -> {
			res.add(renameFile(oldName.get(i), newName.get(i)));
		});
		IntStream.range(0, oldName.size()).forEach(i -> {
			System.out.println("Number of ways to rename the old filename "+oldName.get(i)+" to the new filename "+newName.get(i)+
					" are : "+res.get(i));
		});

	}

	private static int renameFile(String oldName, String newName) {
		// TODO Auto-generated method stub
		int n = newName.length();
        int m = oldName.length();
        int[] dp = new int[m + 1];
        Arrays.fill(dp, 1);
        for (int i = 1; i <= n; i++) {
            int[] dpp = new int[m + 1];
            for (int j = i; j <= m; j++) {
                dpp[j] = dpp[j - 1];
                if (newName.charAt(i - 1) == oldName.charAt(j - 1)) {
                    dpp[j] += dp[j - 1];
                }
            }
            dp = dpp;
        }
		return dp[m] % (int)(Math.pow(10, 9) + 7);
	}

}
