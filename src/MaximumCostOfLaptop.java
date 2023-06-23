import java.util.ArrayList;
import java.util.List;

public class MaximumCostOfLaptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> cost1 = new ArrayList<>();
		cost1.add(2); cost1.add(5); cost1.add(3); cost1.add(11); cost1.add(1);
		List<String> labels1 = new ArrayList<>();
		labels1.add("legal");labels1.add("illegal"); labels1.add("legal");labels1.add("illegal"); labels1.add("legal");
		int dailyCount1 = 2;
		
		System.out.println("Maximum Cost Of Laptop is : "+getMaxCost(cost1,labels1,dailyCount1));
		
		List<Integer> cost2 = new ArrayList<>();
		cost2.add(1);
		List<String> labels2 = new ArrayList<>();
		labels2.add("illegal");
		int dailyCount2 = 1;
		
		System.out.println("Maximum Cost Of Laptop is : "+getMaxCost(cost2,labels2,dailyCount2));
		
		List<Integer> cost3 = new ArrayList<>();
		cost3.add(0); cost3.add(3); cost3.add(2); cost3.add(3); cost1.add(1);
		List<String> labels3 = new ArrayList<>();
		labels3.add("legal");labels3.add("legal"); labels3.add("illegal");labels3.add("legal"); labels1.add("legal");
		int dailyCount3 = 1;
		
		System.out.println("Maximum Cost Of Laptop is : "+getMaxCost(cost3,labels3,dailyCount3));

	}

	private static int getMaxCost(List<Integer> cost, List<String> labels, int dailyCount) {
		// TODO Auto-generated method stub
		int s=0,sum=0,max=0;
		for(int i=0;i<cost.size(); i++) {
			if(labels.get(i).equalsIgnoreCase("legal")) {
				s++;
			}
			sum = sum + cost.get(i);
			if(s == dailyCount) {
				max=(sum>max)?sum:max;
                s=sum=0;
			}
		}
		return max;
	}

}
