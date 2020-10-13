/*Add numbers in linked lists*/
package com.sampurna.javabootcamp;

import java.util.ArrayList;
import java.util.List;

class LList {

	ListNode head;

	class ListNode {

		int data;
		ListNode next;

		ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void insertAfterNode(LList list, int data) {

		ListNode newNode = new ListNode(data);

		if (list.head == null) {
			list.head = newNode;
		} else {
			ListNode last = head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
	}

	public void printList(LList list) {
		ListNode node = list.head;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public Integer getInteger(LList list) {
		ListNode node = list.head, previous = null;
		Integer result = 0;
		while (node != null) {
			ListNode temp = null;
			temp = node;
			if (node.next == null) {
				list.head = node;
			}
			node = node.next;
			temp.next = previous;
			previous = temp;
		}
		ListNode lnode = list.head;
		while (lnode != null) {
			result = result * 10 + lnode.data;
			lnode = lnode.next;
		}

		return result;
	}

	static LList getAdditionOfList(Integer integer1, Integer integer2) {
		LList result = new LList();
		Integer sum = integer1 + integer2;
		List<Integer> reverseNumbers = getReverse(sum);
		for(Integer number : reverseNumbers) {
			
			result.insertAfterNode(result, number);
		}
		return result;
	}

	private static List<Integer> getReverse(Integer sum) {
		List<Integer> reverseNumbers = new ArrayList<Integer>();
		while (sum > 10) {
			reverseNumbers.add(sum % 10);
			sum = sum / 10;
		}
		reverseNumbers.add(sum);
		return reverseNumbers;
	}

}

public class AddNumbersInLinkedList {

	public static void main(String[] args) {

		LList firstList = new LList();
		firstList.insertAfterNode(firstList, 2);
		firstList.insertAfterNode(firstList, 4);
		firstList.insertAfterNode(firstList, 3);

		LList secondList = new LList();
		secondList.insertAfterNode(secondList, 5);
		secondList.insertAfterNode(secondList, 6);
		secondList.insertAfterNode(secondList, 4);

		LList resultantList = LList.getAdditionOfList(firstList.getInteger(firstList),
				secondList.getInteger(secondList));

		resultantList.printList(resultantList);

	}

}
