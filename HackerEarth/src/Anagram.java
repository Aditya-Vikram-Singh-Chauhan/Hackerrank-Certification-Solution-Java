import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println("The input strings are : "+isAnagram(s1,s2));

	}

	private static String isAnagram(String s1, String s2) {
		// TODO Auto-generated method stub
		if(s1.length() == 0 || s2.length() == 0 || s1.length() != s2.length()) {
			return "Not Anagrams";
		}
		else {
			if(s1.length() > 0 && s2.length() > 0 && s1.length() == s2.length()) {
				s1 = s1.toLowerCase();
				s2 = s2.toLowerCase();
				char[] ch1 = s1.toCharArray();
				char[] ch2 = s2.toCharArray();
				Arrays.sort(ch1); Arrays.sort(ch2);
				if(Arrays.equals(ch1,ch2)) {
					return "Anagrams";
				}
			}
		}
		return "Not Anagrams";
	}

}
