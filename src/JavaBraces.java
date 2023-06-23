import java.util.Arrays;
import java.util.Stack;

public class JavaBraces {

	public static void main(String[] args) {
		String inp1 = "[()]{}{[()()]()}";
		String inp2 = "[(])";
		System.out.println("The braces are : "+getIsBalanced(inp1));
		System.out.println("The braces are : "+getIsBalanced(inp2));
	}

	private static String getIsBalanced(String s) {
		Stack<Character> str = new Stack();
        boolean answer = true;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '{' || ch == '[' || ch == '('){
                str.push(ch);
                continue;
            }
            if(str.isEmpty()){
                return "Is Not Balanced";

            }
            if(ch == ')'){
                if(str.peek() == '('){
                    str.pop();
                }else{
                    answer = false;
                    break;
                }
            }
            if(ch == ']'){
                if(str.peek() == '['){
                    str.pop();
                }else{
                    answer = false;
                    break;
                }
            }
            if(ch == '}'){
                if(str.peek() == '{'){
                    str.pop();
                }else{
                    answer = false;
                    break;
                }
            }
            

        }
        if(!str.isEmpty()){
                answer = false;
            }
            if(answer)
            return "Is Balanced";
            else
            return "Is Not Balanced";
	}


}
