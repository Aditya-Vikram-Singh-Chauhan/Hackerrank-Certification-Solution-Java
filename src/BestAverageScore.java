import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class BestAverageScore {

	public static void main(String[] args) {
		String[][] inp = {{"Alice", "70"} ,{"Bob", "80"},{"Charles", "75"},
		{"Bob", "80"},{"Dane", "1"},{"Dane", "2"},{"Dane", "3"}};
		
		int out = getBestAverageScore(inp);
		System.out.println(out);
	}
	public static int getBestAverageScore(String[][] scores){
		if(scores.length == 0) {
			return -1;
		}
		HashMap<String,Integer> noOfSubjects = new HashMap<>();
		HashMap<String,Integer> totalMarks = new HashMap<>();
		for(int i =0; i<scores.length; i++) {
			noOfSubjects.put(scores[i][0], noOfSubjects.getOrDefault(scores[i][0], 0)+1);
			totalMarks.put(scores[i][0], totalMarks.getOrDefault(scores[i][0],0)
					+ Integer.parseInt(scores[i][1]));
		}
		ArrayList<Integer> avg = new ArrayList<>();
		for(String Stud : totalMarks.keySet()) {
			avg.add(totalMarks.get(Stud)/noOfSubjects.get(Stud));
		}
		System.out.println(avg.toString());
		return Collections.max(avg);
		}

}


