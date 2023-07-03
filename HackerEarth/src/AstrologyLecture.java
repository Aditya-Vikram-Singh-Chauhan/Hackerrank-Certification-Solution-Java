
public class AstrologyLecture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int in = 3;
		System.out.println("The pattern is : ");
		getTrapeziumPattern(3);

	}

	private static void getTrapeziumPattern(int n) {
		int i, j;
		for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (j < n - i - 1)
                    System.out.print("*");
                else
                    System.out.print(".");
            }
            for (j = 0; j < n - 1; j++) {
                if (j < i)
                    System.out.print(".");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        for (i = 2; i <= n; i++) {
            for (j = 0; j < n; j++) {
                if (j < i - 1)
                    System.out.print("*");
                else
                    System.out.print(".");
            }
            for (j = 0; j < n - 1; j++) {
                if (j < n - i)
                    System.out.print(".");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
	}

}
