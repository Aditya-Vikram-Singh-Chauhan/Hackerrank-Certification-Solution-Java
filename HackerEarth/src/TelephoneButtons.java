import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class TelephoneButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inp = "23";
		System.out.println("Letter combinations are : "+telephoneButtons(inp));

	}
	public static  String []key = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	private static List<String> telephoneButtons(String digits) {
		ArrayList<String>a = new ArrayList<>();
        return val(digits,0,a,""); 
	}
	public static ArrayList<String> val(String digits,int idx,ArrayList<String> empty,String combination ){
        if(digits.length() ==0){
            return empty;
        }
        if(idx==digits.length()){
        empty.add(combination);
        return empty;
        }
    char c = digits.charAt(idx);
    String map = key[c-'1'];
    for(int i=0;i<map.length();i++){
        val(digits,idx+1,empty,combination+map.charAt(i));
    }
    return empty;
	}

}
