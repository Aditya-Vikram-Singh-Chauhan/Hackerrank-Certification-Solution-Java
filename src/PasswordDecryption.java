import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class PasswordDecryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inp1 = "43Ah*ck0rr0nk";
		String inp2 = "51Pa*0Lp*0e";
		String inp3 = "pTo*Ta*O";
		
		System.out.println("Decrypted password is : "+decryptPassword(inp1));
		System.out.println("Decrypted password is : "+decryptPassword(inp2));
		System.out.println("Decrypted password is : "+decryptPassword(inp3));

	}

	private static String decryptPassword(String inp) {
		// TODO Auto-generated method stub
		List<Integer> num = new ArrayList<>();
		inp.chars().mapToObj(i -> (char)i).filter(i -> Character.isDigit(i) && i != '0').forEach(i -> {
			num.add(i-'0');
		});
		Collections.reverse(num);
		//System.out.println(num);
		if(num != null) {
			inp = replaceZeros(num, inp);
		}
		//System.out.println(inp);
		char[] ch = inp.toCharArray();
		for(int i=0; i< ch.length; i++) {
			if(inp.charAt(i) == '*') {
				char temp = ch[i-1];
				ch[i-1] = ch[i-2];
				ch[i-2] = temp;
			}
		}
		String out = new String(ch);
		return out.replace("*", "");
	}

	private static String replaceZeros(List<Integer> num, String in) {
		// TODO Auto-generated method stub
		String inp = in;
		int i=0;
		for(int j=0; j< inp.length(); j++) {
			if(inp.charAt(j) == '0') {
				inp = inp.substring(0, inp.indexOf('0'))+(char) (num.get(i) + '0')+inp.substring(inp.indexOf('0')+1);
				i++;
			}
		}
		inp = inp.substring(num.size());
		return inp;
	}

}
