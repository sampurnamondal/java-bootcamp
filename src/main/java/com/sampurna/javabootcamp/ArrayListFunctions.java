/*Common array list functions*/

package com.sampurna.javabootcamp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ArrayListFunctions {

	List<Integer> numberList = new ArrayList<Integer>();

	public List<Integer> createList() {
		Random rndm = new Random();
		Integer number = 20;
		for (int i = 0; i < number; i++) {
			numberList.add(rndm.nextInt(number));
		}
		return numberList;
	}

	// iterate list
	public void iterateList(List<Integer> list) {

		/*
		 * for(Integer number : list) { System.out.println(number); }
		 */

		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

	// convert list to array
	public Object[] convertToArray(List<Integer> list) {
		return list.toArray();
	}

	// checks if element exists in list
	public Boolean checkIfExists(List<Integer> list, Integer number) {
		return list.contains(number);
	}

	// find length of list
	public Integer findLength(List<Integer> list) {
		return list.size();
	}

	// sort ArrayList in reverseOrder
	public List<Integer> sortInReverse(List<Integer> list) {
		// Collections.sort(list, Collections.reverseOrder());
		// return list;

		list.sort((Integer a, Integer b) -> -(b.compareTo(a)));
		return list;
	}

	// add element at particular element
	public List<Integer> addElement(List<Integer> list, Integer index, Integer element) {
		list.add(index, element);
		return list;
	}

	// remove element at particular index
	public List<Integer> removeElement(List<Integer> list, Integer index) {
		list.remove(index);
		return list;
	}

	public static void main(String args[]) {

		ArrayListFunctions arrayFunctions = new ArrayListFunctions();
		List<Integer> list = arrayFunctions.createList();
		Integer numberToUse = 400;
		Integer index = 11;

		// iterate list
		arrayFunctions.iterateList(list);

		// convert to array
		System.out.println(Arrays.toString(arrayFunctions.convertToArray(list)));

		// check if number present in list
		if (arrayFunctions.checkIfExists(list, numberToUse)) {
			System.out.println(numberToUse + " " + "is present in list");
		} else {
			System.out.println(numberToUse + " " + "is not present in list");
		}

		// find length of list
		System.out.println("Length : " + " " + arrayFunctions.findLength(list));

		// sort ArrayList in reverseOrder
		System.out.println("Reverse order : " + " " + "\n");
		arrayFunctions.iterateList(arrayFunctions.sortInReverse(list));

		// add element at particular element
		System.out.println("New element added" + arrayFunctions.addElement(list, index, numberToUse));

		// remove element at particular index ??check..object removed(number removed)
		// instead of integer(index not removed)
		System.out.println(
				"New array after element removed" + arrayFunctions.removeElement(list, Integer.valueOf(index)));

	}

}
