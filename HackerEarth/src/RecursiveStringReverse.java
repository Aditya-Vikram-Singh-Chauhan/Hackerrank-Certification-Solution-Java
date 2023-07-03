import java.util.Scanner;

public class RecursiveStringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		System.out.println("The reverse is : "+recursiveReverse(inp));
	}
	private static String recursiveReverse(String inp) { 
			//checks if the string is empty   
			if(inp.isEmpty())  
			{  
			//System.out.println("String is empty."); 
			//if the above condition is true returns the same string      
			return inp;  
			}   
			else   
			{  
			return recursiveReverse(inp.substring(1))+inp.charAt(0);  
			}
	}

}
