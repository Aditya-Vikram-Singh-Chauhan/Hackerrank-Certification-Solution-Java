import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestNonrepeatingSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inp = "abcabcbb";
		int out = getLongestSubstring(inp);
		System.out.println("Longest Non Repeating Substring is : "+out);

	}

	private static int getLongestSubstring(String s) {
		int res = 0;
        HashSet<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
        while (i < s.length() && j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                if (j - i > res) res = j - i;
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return res;
	}

}
