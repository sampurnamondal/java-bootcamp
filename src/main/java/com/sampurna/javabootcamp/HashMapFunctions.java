/*Common HashMap functions*/

package com.sampurna.javabootcamp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapFunctions {         //sampurna : use replace remove

	Map<Integer, String> letters = new HashMap<Integer, String>();

	// create hashmap
	public Map<Integer, String> createMap() {
		letters.put(4, "Ball");
		letters.put(5, "Apple");
		letters.put(3, "Cat");
		return letters;
	}

	// get size of map
	public Integer findLength(Map<Integer, String> map) {
		return map.size();
	}

	// check if hashmap is empty
	public Boolean checkIfEmpty(Map<Integer, String> map) {
		return map.isEmpty();
	}
	
	//iterate hashmap
	public void iterateHashMap(Map<Integer, String> map) {
		
		/*Set<String> setOfKeys = map.keySet();
		for(Integer key : setOfKeys) {
			System.out.println(key + ":" + map.get(key));
		}*/
		Set<Map.Entry<Integer, String>> entries = map.entrySet();
		for(Map.Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
	
	//sort hashmap 
	public Map<Integer, String> sortMap(Map<Integer, String> map){
		return new TreeMap<Integer, String>(map);
	}
	
	//sort hashmap by entries
	public Map<Integer, String> sortMapByEntries(Map<Integer, String> map){
		
		List<Map.Entry<Integer, String>> tempList = new ArrayList<Map.Entry<Integer, String>>(map.entrySet());
		Map<Integer, String> sortedMap = new LinkedHashMap<Integer, String>();  //LinkedHashMap to maintain order, sorted using list
		
		Collections.sort(tempList, new Comparator<Map.Entry<Integer, String>>() {
			
			@Override
			public int compare(Entry<Integer, String> entry1, Entry<Integer, String> entry2) {
				return entry1.getKey().compareTo(entry2.getKey());
			}
		});
		for(Map.Entry<Integer, String> entry : tempList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}

	public static void main(String[] args) {
		
		HashMapFunctions hashMapFunctions = new HashMapFunctions();
		Map<Integer, String> map = hashMapFunctions.createMap();
		
		//get size of map
		System.out.println("Length : " + " " + hashMapFunctions.findLength(map));
		
		//check if hashmap is empty
		if(hashMapFunctions.checkIfEmpty(map)) {
			System.out.println("Map is empty");
		}
		else {
			System.out.println("Map is not empty");
		}
		
		//iterate map
		hashMapFunctions.iterateHashMap(map);
		
		//sort hashmap by keys
		System.out.println(hashMapFunctions.sortMap(map));

	}
}
