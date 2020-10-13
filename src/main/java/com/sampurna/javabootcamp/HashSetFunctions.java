/*Common HashSet functions*/

package com.sampurna.javabootcamp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class HashSetFunctions {
	
	Set<Integer> numberSet = new HashSet<Integer>();
	
	public Set<Integer> createHashSet(){
		Integer number = 20;
		Random rndm =new Random();
		
		for(int i = 0; i < number; i++) {
			numberSet.add(rndm.nextInt(number));
		}
		return numberSet;
	}
	
	//iterate set
	public void iterateSet(Set<Integer> set) {
		for(Integer number : set) {
			System.out.println(number);
		}
	}
	
	//check if element exists in set
	public Boolean checkIfExists(Set<Integer> set, Integer number) {
		return set.contains(number);
	}
	
	//convert hashset to array
	public int[] convertToArray(Set<Integer> set) {
		
		return set.stream().mapToInt(Integer :: intValue).toArray();
	}
	
	
	public static void main(String args[]) {
		
		HashSetFunctions hashSetFunctions = new HashSetFunctions();
		Set<Integer> numberSet = hashSetFunctions.createHashSet();
		Integer numberToCheck = 9;
		
		//iterate set
		hashSetFunctions.iterateSet(numberSet);
		
		//check if element exists in set
		if(hashSetFunctions.checkIfExists(numberSet, numberToCheck)) {
			System.out.println(numberToCheck + " " + "is present in set");
		}
		else {
			System.out.println(numberToCheck + " " + "is not present in set");
		}
		
		System.out.println("Set to array" + " " + Arrays.toString(hashSetFunctions.convertToArray(numberSet)));
	}
}
