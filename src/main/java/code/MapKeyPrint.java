package code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapKeyPrint {
	public static void main(String[] args) {
		List<Map<String, String>> tableList = new ArrayList<>();
		Map<String, String> m1= new HashMap<>();
		m1.put("table", "a1");
		m1.put("owner", "1");
		tableList.add(m1);
		Map<String, String> m2= new HashMap<>();
		m2.put("table", "a2");
		m2.put("owner", "2");
		tableList.add(m2);
		Map<String, String> m3= new HashMap<>();
		m3.put("table", "a1");
		m3.put("owner", "1");
		tableList.add(m3);
		
		List<Map<String, String>> list = tableList.stream().filter(m -> 
		(m.get("table").equals("a1") && m.get("owner").equals("1"))).collect(Collectors.toList());
		System.out.println(list.size());

		tableList.forEach(m ->{
			m.forEach((k,v)->{
				System.out.println(k+" -----> "+v);
			});
		});
		
	}
}
