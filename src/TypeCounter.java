import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TypeCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inp1 = "can you give me 10 bucks puff in 7.5 or 7";
		String inp2 = "give me 10 dollars";
		String inp3 = "string 2 3.54";
		List<Integer> out1 = getTypeCount(inp1);
		List<Integer> out2 = getTypeCount(inp2);
		List<Integer> out3 = getTypeCount(inp3);
		System.out.println("For the input : "+inp1);
		System.out.println("String : "+out1.get(0)+"\nInteger : "+out1.get(1)+"\nDouble : "+out1.get(2));
		System.out.println("For the input : "+inp2);
		System.out.println("String : "+out2.get(0)+"\nInteger : "+out2.get(1)+"\nDouble : "+out2.get(2));
		System.out.println("For the input : "+inp3);
		System.out.println("String : "+out3.get(0)+"\nInteger : "+out3.get(1)+"\nDouble : "+out3.get(2));

	}
	
	private static List<Integer> getTypeCount(String inp) {
		// TODO Auto-generated method stub
		List<Integer> res = new ArrayList<>();
		int intt =0, doub =0, stt = 0;
		String[] st = inp.split(" ");
		for(int i = 0; i< st.length; i++) {
			try {
                int asInt = Integer.parseInt(st[i]);
                intt++;
            }
			catch (NumberFormatException e) {
                try {
                    double asDouble = Double.parseDouble(st[i]);
                    doub++;
                } catch (NumberFormatException e2) {
                    stt++;
                }
            }
		}
		res.add(stt); res.add(intt); res.add(doub);
		return res;
	}

}
