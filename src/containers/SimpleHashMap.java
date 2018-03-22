package containers;

import java.io.ObjectInputStream.GetField;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class SimpleHashMap<K,V> extends AbstractMap<K, V> {

    static final int SIZE=997;
    @SuppressWarnings("unchecked")
    LinkedList<MapEntry<K, V>>[] buckets=new LinkedList[SIZE];
    
    @Override
	public V remove(Object key) {
    	V oldValue=null;
		int index=Math.abs(key.hashCode())%SIZE;
		if(buckets[index]==null) return oldValue;
		ListIterator<MapEntry<K, V>> it=buckets[index].listIterator();
		while (it.hasNext()) {
			MapEntry<K, V> itPair=it.next();
			if(itPair.getKey().equals(key)){
			   it.previous();
			   it.remove();
			   oldValue=itPair.getValue();
			}
		}
		
		return oldValue;
	}
	@Override
	public void clear() {
		for(LinkedList<MapEntry<K, V>> bucket: buckets){
			if(bucket==null) continue;
		    ListIterator<MapEntry<K, V>> it=bucket.listIterator();
		   while(it.hasNext())
			   it.remove();
		}
	}
	public V put(K key, V value){
    	V oldValue=null;
    	int index=Math.abs(key.hashCode())%SIZE;
    	if(buckets[index]==null)
    		buckets[index]=new LinkedList<MapEntry<K, V>>();
    	LinkedList<MapEntry<K, V>> bucket=buckets[index];
    	MapEntry<K, V> pair=new MapEntry<K, V>(key, value);
    	boolean found=false;
        ListIterator<MapEntry<K, V>> it=bucket.listIterator();
        while(it.hasNext()){
        	MapEntry<K, V> itPair=it.next();
        	if(itPair.getKey().equals(key)){
        		oldValue=itPair.getValue();
        		it.set(pair);
        		found=true;
        		break;
        	}
        }
        if(!found)
        	buckets[index].add(pair);
    	return oldValue;
    }
    public V get(Object key){
    	int index=Math.abs(key.hashCode()) % SIZE; 
    	if(buckets[index]==null) return null;
    	for(MapEntry<K, V> iPair:buckets[index])
    		if(iPair.getKey().equals(key))
    			return iPair.getValue();
    	return null;		
    }
	
	@Override
	public Set<Map.Entry<K, V>> entrySet() {
		Set<Map.Entry<K, V>> set=new HashSet<Map.Entry<K,V>>();
		for(LinkedList<MapEntry<K, V>> bucket: buckets){
			if(bucket==null) continue;
			for(MapEntry<K, V> mPair:bucket)
				set.add(mPair);
		}
		return set;
	}
	public static void main(String[] args){
		SimpleHashMap<String, String> m=new SimpleHashMap<String,String>();
		m.putAll(Countries.capitals(25));
		System.out.println(m);
		System.out.println(m.get("ERITREA"));
		System.out.println(m.entrySet());
		System.out.println(m.remove("ANGOLA"));
		System.out.println(m);
		m.clear();
		System.out.println(m);
	}
	
}
