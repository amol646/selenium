package cardtest;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTestFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> rec=new LinkedHashMap<Integer, String>();
		
		rec.put(1,"one");
		rec.put(3,"three");
		rec.put(9,"nine");
		rec.put(8,"eight");
		rec.put(4,"four");
		rec.put(33,"thirty three");
		rec.put(11,"eleven");
		rec.put(44,"fourty four");
		rec.put(99,"ninty nine");
		rec.put(88,"eighty eight");
		rec.put(100,"hundred");
		rec.put(2000,"two thousand");
		
		Set<Entry<Integer, String>> sets=rec.entrySet();
		
		System.out.println(sets);
		
		for (Map.Entry<Integer, String> str : rec.entrySet()) {
			
			//System.out.println(str.getValue());
			
		}
		
		
		

	}

}
