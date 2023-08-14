package Corejava.collections;

import java.util.HashMap;
import java.util.Map;

public class collectionsmap {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("first", "karanam");
		map.put("first", null);
		map.put("second", "seshu");
		map.put("second", "babu");
		map.put("third", "babu");
		map.put("third", null);
		System.out.println(map);

	}

}
