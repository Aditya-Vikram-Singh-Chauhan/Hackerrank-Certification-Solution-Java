import java.util.Scanner;

public class ComplexNumbers {
	   int real, img;
		
	   ComplexNumbers(int r, int i){
		this.real = r;
		this.img = i;
	   }
		
	   public static ComplexNumbers sum(ComplexNumbers c1, ComplexNumbers c2)
	   {
	        ComplexNumbers temp = new ComplexNumbers(0, 0);

	        temp.real = c1.real + c2.real;
	        temp.img = c1.img + c2.img;
	        
	        return temp;
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
       ComplexNumbers c1 = new ComplexNumbers(a, b);
        System.out.println(c1.real+" + "+c1.img +"i"); 
       ComplexNumbers c2 = new ComplexNumbers(c,0);
       ComplexNumbers c3 = sum(c1, c2);
       System.out.println(c3.real+" + "+c3.img +"i");
       ComplexNumbers c4=sum(c3,c1);
       System.out.println(c4.real+" + "+c4.img+"i");
	}

}
