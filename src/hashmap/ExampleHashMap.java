package hashmap;

import java.util.HashMap;

public class ExampleHashMap {
	static boolean answer= false;

	public static void main(String[] args) {
		
		HashMap<String,String> hash=new HashMap<String,String>();
		
		hash.put("ABC", "Name");
		hash.put("DEF", "Age");
		hash.put("GHI", "Address");
		hash.put("JKL", "Class");
		
		System.out.println(hash.get("ABC"));
		System.out.println(hash.equals("ABC"));
		System.out.println(hash.containsKey("GHI"));
		System.out.println(hash.isEmpty());
		System.out.println(hash.remove("DEF"));
		System.out.println(hash.values());
		System.out.println(hash.replace("GHI", "Age"));
		System.out.println(hash.values());
		System.out.println(hash.size());
		System.out.println(hash.keySet());
		System.out.println(hash.entrySet());
		System.out.println(hash.containsValue("Name"));
		
		String search="Class";
		
		hash.forEach((key,val) -> {
			if(key.contains(search)||val.contains(search))
				answer=true;
			}
		);
		
		System.out.println(hash.keySet()+" . "+hash.values());		
		System.out.println(search+" contains "+answer);
		System.out.println(hash.entrySet());
		
		
	}
}
