package HashMapDemo;

import java.util.HashMap;

public class HashMapTest {
	public static void main(String[] args) {

		// Create a HashMap object called dicList
		HashMap<String, String> dicList = new HashMap<String, String>();
		if (dicList.isEmpty() == true) {
			System.out.println("Start print map");
		}
		else {
			System.out.println("Let enter map");
		}
			// Add keys and values (collection type, it's description)

			dicList.put("Array", "index/value pair, but it can't expand");
			dicList.put("ArrayList", "index/value pair and it can expand & shrink");
			dicList.put("HashMap", "other type/value pair and it can expand & shrink");
			//System.out.println(dicList);
			System.out.println(dicList.get("Array"));
			System.out.println(dicList.size());

		
	}

}
