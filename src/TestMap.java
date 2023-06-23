import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new HashMap<String, String>();
		map.put("Aditya" , "Chauhan");
		map.put("Mihir" , "Chauhan");
		map.put("Pallavi" , "Chauhan");
		
		System.out.println(map);
		
		
		List<String[]> li = new ArrayList<>();
        li.add(new String[]{"Aditya" , "Chauhan"});
        li.add(new String[]{"Mihir" , "Chauhan"});
        li.add(new String[]{"Pallavi" , "Chauhan"});

		Map map1 = new HashMap<String, String>();
		map1 = li.stream().collect(Collectors.toMap(i -> i[0]+i[1], j-> j[0]+j[1]));
		System.out.println(map1);
	}

}
