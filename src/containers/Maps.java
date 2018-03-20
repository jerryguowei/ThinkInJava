package containers;

import java.util.Map;


public class Maps {

	public static void printKeys(Map <Integer,String> map){
		System.out.println("Size = " + map.size() +", ");
		System.out.println("Keys: ");
		System.out.println(map.keySet());
	}
	public static void test(Map<Integer, String> map){
		System.out.println(map.getClass().getSimpleName());
		map.putAll(new CountingMapData(25));
		printKeys(map);
	}
	
	public static void main(String[] args) {
		
	}

}
