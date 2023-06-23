import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class UserFriendlyPasswordSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<String>> events1 = new ArrayList<>();
		events1.add(Arrays.asList(new String[]{"setPassword", "cAr1"}));
		events1.add(Arrays.asList(new String[]{"authorize", "223691457"}));
		events1.add(Arrays.asList(new String[]{"authorize", "303580761"}));
		events1.add(Arrays.asList(new String[]{"authorize", "100"}));
		events1.add(Arrays.asList(new String[]{"setPassword", "d"}));
		events1.add(Arrays.asList(new String[]{"authorize", "100"}));
		
		System.out.println("Valid Password : "+userFriendlyPassword(events1));
		
		List<List<String>> events2 = new ArrayList<>();
		events2.add(Arrays.asList(new String[]{"setPassword", "000A"}));
		events2.add(Arrays.asList(new String[]{"authorize", "108738450"}));
		events2.add(Arrays.asList(new String[]{"authorize", "108738449"}));
		events2.add(Arrays.asList(new String[]{"authorize", "244736787"}));
		
		System.out.println("Valid Password : "+userFriendlyPassword(events2));
		
		List<List<String>> events3 = new ArrayList<>();
		events3.add(Arrays.asList(new String[]{"setPassword", "1"}));
		events3.add(Arrays.asList(new String[]{"setPassword", "2"}));
		events3.add(Arrays.asList(new String[]{"setPassword", "3"}));
		events3.add(Arrays.asList(new String[]{"authorize", "49"}));
		events3.add(Arrays.asList(new String[]{"authorize", "50"}));
		
		System.out.println("Valid Password : "+userFriendlyPassword(events3));
	}
	 static int P = 131;
	    static int M = 1000000000 + 7;
	    static int[] PP = IntStream.range(0, 11).map(i -> (int)Math.pow(P, i)).toArray();
	    static String[] APPENDS = Stream.concat(Stream.concat(Arrays.stream(new String[]{""}), 
	    		Arrays.stream("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".split(""))), 
	    		Arrays.stream("0123456789".split(""))).toArray(String[]::new);
    static long calc_hash(String pw) {
        long cur_h = 0,m;
        for (int i = 0; i < pw.length(); i++) {
        	m = (long)pw.charAt(pw.length() - (i + 1));
        	cur_h += m * PP[i];
        }
        return cur_h % M;
    }
	private static List<Integer> userFriendlyPassword(List<List<String>> events) {
		// TODO Auto-generated method stub
        List<Integer> ans = new ArrayList<>();
        Set<Long> good_hashs = new HashSet<>();
        IntStream.range(0,events.size()).forEach(i -> {
        	List<String> event = events.get(i);
        	if (event.get(0).equals("setPassword")) {
        		good_hashs.clear();
        		Arrays.stream(APPENDS).map(x -> calc_hash(event.get(1) + x)).forEach(j -> good_hashs.add(j));
            } else {
                assert event.get(0).equals("authorize");
                ans.add(good_hashs.contains(Long.parseLong(event.get(1))) ? 1 : 0);
            }
        });
        return ans;
	}

}
