import java.util.ArrayList;
import java.util.List;

public class RoadRepair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> crewID1 = new ArrayList<>();
		crewID1.add(1); crewID1.add(3); crewID1.add(5);
		List<Integer> jobID1 = new ArrayList<>();
		jobID1.add(3); jobID1.add(5); jobID1.add(7);
		
		System.out.println("Minimum Cost is : "+getMinCost(crewID1,jobID1));
		
		List<Integer> crewID2 = new ArrayList<>();
		crewID2.add(5); crewID2.add(3); crewID2.add(1); crewID2.add(4); crewID2.add(6);
		List<Integer> jobID2 = new ArrayList<>();
		jobID2.add(9); jobID2.add(8); jobID2.add(3); jobID2.add(15); jobID2.add(1);
		
		System.out.println("Minimum Cost is : "+getMinCost(crewID2,jobID2));
		
		List<Integer> crewID3 = new ArrayList<>();
		crewID3.add(5); crewID3.add(1); crewID3.add(4); crewID3.add(2);
		List<Integer> jobID3 = new ArrayList<>();
		jobID3.add(4); jobID3.add(7); jobID3.add(9); jobID3.add(10);
		
		System.out.println("Minimum Cost is : "+getMinCost(crewID3,jobID3));

	}
	public static long getMinCost(List<Integer> crewID, List<Integer> jobID) {
        crewID.sort(Integer::compareTo);
        jobID.sort(Integer::compareTo);
        long result = 0;
        for (int index = 0 ; index < crewID.size() ; index++) {
            result += Math.abs(jobID.get(index) - crewID.get(index));
        }
        return result;
    }

}
