import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		
		String out = missingChars(inp);
		System.out.println(out);

	}

	private static String missingChars(String inp) {
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		char[] ch = inp.toCharArray();
		for(int i=0; i<ch.length; i++) {
			StringBuffer sb = new StringBuffer();
			sb.append(ch[i]);
			alpha = alpha.replaceAll(sb.toString(), "");
		}
		return alpha;
	}

}
