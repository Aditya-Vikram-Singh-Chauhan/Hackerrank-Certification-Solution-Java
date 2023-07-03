import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StartandEndPosition {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(new Integer[]{5,6,6,6,6,7,7,7,7,8,8,8,8,8,8,10});
		int targ1 = 8;
		int targ2 = 6;
		System.out.println
		("Start and Enp position for target "+targ1+" is : "+startandEndPosition(nums,targ1));
		System.out.println
		("Start and Enp position for target "+targ2+" is : "+startandEndPosition(nums,targ2));
		List<Integer> nums1 = Arrays.asList(new Integer[]{});
		int targ3 = 0;
		System.out.println
		("Start and Enp position for target "+targ3+" is : "+startandEndPosition(nums1,targ3));
		}

	private static List<Integer> startandEndPosition(List<Integer> nums, int targ) {
		// TODO Auto-generated method stub
		List<Integer> res = new ArrayList<>();
		if(nums.size() == 0) {
			return Arrays.asList(new Integer[] {-1,-1});
		}
		if(!nums.contains(targ)) {
			return Arrays.asList(new Integer[] {-1,-1});
		}
		else {
			int c = (int)nums.stream().filter(i -> i == targ).count();
			res.add(nums.indexOf(targ));
			res.add(nums.indexOf(targ)+c-1);
		}
		
		return res;
	}

}
