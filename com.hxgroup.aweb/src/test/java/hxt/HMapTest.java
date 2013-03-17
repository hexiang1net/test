package hxt;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Map<String, String> map = new LinkedHashMap<String, String>();
		
		
		map.put("bb", "xxx");
		map.put("bb", "xbbb");
		map.put("bbgg3", "xbbb");
		map.put("bbgg4", "xbbb");
		map.put("bbg1g1", "xbbb");
		map.put("bb112gg", "xbbb");
		map.put("b123bgg", "xbbb");
		map.put("bb33gg", "xbbb");
		Set<Entry<String, String>> set = map.entrySet();
		System.out.println(set.size());
		System.out.println(map.size() );

	}

}
