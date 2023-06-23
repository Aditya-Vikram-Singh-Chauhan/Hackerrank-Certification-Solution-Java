
public class BalancedSystemFilePartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> parent = new ArrayList<>();
		List<Integer> file_size = new ArrayList<>();
		parent.add(-1); parent.add(0); parent.add(0); parent.add(1); parent.add(1); parent.add(2);
		file_size.add(1); file_size.add(2); file_size.add(2); file_size.add(1); file_size.add(1); file_size.add(1);
		
		System.out.println("Most Balanced Partition : "+mostBalancedPartition(parent, file_size));
		
		parent.clear();
		file_size.clear();
		parent.add(-1); parent.add(0); parent.add(1); parent.add(2);
		file_size.add(1); file_size.add(4); file_size.add(3); file_size.add(4);
		
		System.out.println("Most Balanced Partition : "+mostBalancedPartition(parent, file_size));
		
		parent.clear();
		file_size.clear();
		parent.add(-1); parent.add(0); parent.add(0); parent.add(0);
		file_size.add(10); file_size.add(11); file_size.add(10); file_size.add(10);
		
		System.out.println("Most Balanced Partition : "+mostBalancedPartition(parent, file_size));
	}
		
		public static int mostBalancedPartition(List<Integer> parent, List<Integer> files_size) {
	        int n = parent.size();
	        ArrayList<Integer>[] children = new ArrayList[n];
	        for (int i = 0; i < n; i++) {
	            children[i] = new ArrayList<>();
	        }
	        for (int i = 1; i < n; i++) {
	            children[parent.get(i)].add(i);
	        }
	        Integer[] size_sums = new Integer[n];
	        size_sums_rec(0, files_size, children, size_sums);
	        int min = Integer.MAX_VALUE;
	        for (int i = 1; i < n; i++) {
	            min = Math.min(min, Math.abs(size_sums[0] - 2 * size_sums[i]));
	        }
	        return min;
	}
		private static int size_sums_rec(int i, List<Integer> files_size, ArrayList<Integer>[] children, Integer[] size_sums) {
	        size_sums[i] = files_size.get(i);
	        for (int c : children[i]) {
	            size_sums[i] += size_sums_rec(c, files_size, children, size_sums);
	        }
	        return size_sums[i];
	    }

}
