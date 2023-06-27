import java.util.Arrays;
import java.util.List;

public class UnexpectedDemand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> order1 = Arrays.asList(new Integer[]{10,30});
		List<Integer> order2 = Arrays.asList(new Integer[] {5,4,6});
		System.out.println("Maximum number of fulfilled orders : "+filledOrders(order1, 40));
		System.out.println("Maximum number of fulfilled orders : "+filledOrders(order2, 3));
	}

	private static int filledOrders(List<Integer> orders, int widgets) {
		// TODO Auto-generated method stub
		int s = 0;
		int c = 0;
		for(int i=0; i< orders.size(); i++) {
			if(s <= widgets && orders.get(i) <= widgets) {
				s = s+ orders.get(i);
				c++;
			}
		}
		return c;
	}

}
