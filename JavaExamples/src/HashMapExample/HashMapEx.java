package HashMapExample;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i =1;
		HashMap<Integer,String> map = new HashMap<Integer, String>();
		
		map.put(i, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.put(5, "e");
		
		System.out.println();
	Set set = map.entrySet();
		
	System.out.println(map);
	/*Iterator it = set.iterator();
	while(it.hasNext()){
		Map.Entry entry = (Entry) it.next();
		System.out.println("key : " +entry.getKey() + "value :" +entry.getValue());
	}*/
	
	}

}
