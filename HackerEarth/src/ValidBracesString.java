import java.util.Stack;

public class ValidBracesString {

	public static void main(String[] args) {
		String inp1 = "[()]{}{[()()]()}";
		String inp2 = "[(])";
		System.out.println("The String is Valid?: "+getValidString(inp1));
		System.out.println("The String is Valid?: "+getValidString(inp2));
	}

	private static String getValidString(String s) {
		Stack<Character> str = new Stack();
        boolean answer = true;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '{' || ch == '[' || ch == '('){
                str.push(ch);
                continue;
            }
            if(str.isEmpty()){
                return "False";

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
            return "True";
            else
            return "False";

	}

}
