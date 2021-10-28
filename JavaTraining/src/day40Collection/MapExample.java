package day40Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {
		
		Map m1=new HashMap();
		m1.put("key1", "admin");
		m1.put("key2", "admin");
		m1.put(null, "admin123");
		System.out.println("Map elements are: "+m1);
		System.out.println("Map element count: "+m1.size());
		m1.put("key2", "manager");
		m1.put(null, 1234);
		System.out.println("Map elements are: "+m1);
		System.out.println("Map element count: "+m1.size());
		
		System.out.println("key set of map: "+m1.keySet());
		System.out.println("values of map: "+m1.values());
		
		Set<Entry> a=m1.entrySet();
		for(Entry l:a) {
			System.out.println(l.getKey()+" : "+l.getValue());
		}
	}

}
