import java.util.Scanner;

public class Palandrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		System.out.println("The input sting is palandrome : "+checkPalandrome(inp));
	}

	private static String checkPalandrome(String inp) {
		// TODO Auto-generated method stub
		if(inp.length() == 0) {
			return "NO";
		}
		else {
			StringBuffer sb = new StringBuffer(inp);
			if(inp.equalsIgnoreCase(sb.reverse().toString())) {
				return "YES";
			}
			return "NO";
		}
		
	}

}
