import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsernameChanges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> usernames1 = Arrays.asList(new String[] {"bee", "superhero", "ace"});
		System.out.println("Username change for "+usernames1+" are :"+usernameChange(usernames1));
		List<String> usernames2 = Arrays.asList(new String[] {"hydra"});
		System.out.println("Username change for "+usernames2+" are :"+usernameChange(usernames2));
		List<String> usernames3 = Arrays.asList(new String[] {"foo", "bar", "baz"});
		System.out.println("Username change for "+usernames3+" are :"+usernameChange(usernames3));
		
	}

	private static List<String> usernameChange(List<String> usernames) {
		ArrayList<String> ans = new ArrayList<String>();
        for (String u : usernames) {
            if (u.length() <= 1) {
                ans.add("NO");
            }
            for (int i = 0; i < u.length() - 1; i++) {
                if (u.charAt(i) > u.charAt(i + 1)) {
                    ans.add("YES");
                    break;
                }
                else if (i == u.length() - 2) {
                    ans.add("NO");
                }
            }
        }
        return ans;
	}

}
