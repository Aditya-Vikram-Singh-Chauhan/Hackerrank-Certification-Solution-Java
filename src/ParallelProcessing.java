import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> files1 = new ArrayList<>();
		files1.add(5); files1.add(3); files1.add(1);
		int numCores1 = 5;
		int limit1 = 5;
		List<Integer> files2= new ArrayList<>();
		files2.add(3); files2.add(1); files2.add(5);
		int numCores2 = 1;
		int limit2 = 5;
		List<Integer> files3 = new ArrayList<>();
		files3.add(4); files3.add(1); files3.add(3); files3.add(2); files3.add(8);
		int numCores3 = 4;
		int limit3 = 1;
		
		System.out.println("The minimum amount of time is : "+getParallelProcessing(files1, numCores1, limit1));
		System.out.println("The minimum amount of time is : "+getParallelProcessing(files2, numCores2, limit2));
		System.out.println("The minimum amount of time is : "+getParallelProcessing(files3, numCores3, limit3));

	}

	private static int getParallelProcessing(List<Integer> files, int numCores, int limit) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<Integer>();

	      int sum=0;

	      if(numCores==1){
	          for(int i=0;i<files.size();i++){
	              sum+=files.get(i);
	          }
	          System.out.println(sum);
	      }else{
	          for(int i=0;i<files.size();i++){
	              if(files.get(i)%numCores==0){
	                  arr.add(files.get(i));
	              }else{
	                  sum+=files.get(i);
	              }
	          }

	          Collections.sort(arr);

	          int k=0;
	          for(int j=arr.size()-1;j>=0;j--){
	              if(k<limit){
	                  sum+=(arr.get(j)/numCores);
	              }else{
	                  sum+=arr.get(j);
	              }
	              k++;
	          }
	      }
		return sum;
	}  

}
