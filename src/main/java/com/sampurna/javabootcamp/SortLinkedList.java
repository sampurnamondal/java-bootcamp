package com.sampurna.javabootcamp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * need to given an unsorted linked list, and you need to write a program in
 * Java to sort them in ascending order of the values in each node.
 */
class LinkedList5 {

	Node head;

	class Node {

		Integer data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	void insertNodeAfter(Integer data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
		} else {
			Node last = head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
	}

	void printLinkedList(LinkedList5 linkedList) {
		Node node = linkedList.head;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	LinkedList5 sortLinkedList(LinkedList5 linkedList) {
		LinkedList5 sortedLinkedList = new LinkedList5();
		Node node = linkedList.head;
		Map<Node, Integer> linkedListData = new HashMap<>();

		while (node != null) {
			linkedListData.put(node, node.data);
			node = node.next;
		}

		List<Integer> sortedList = new ArrayList<>(linkedListData.values());
		Collections.sort(sortedList);

		for (Integer number : sortedList) {
			if (linkedListData.containsValue(number)) {
				sortedLinkedList.insertNodeAfter(number);
			}
		}

		return sortedLinkedList;
	}
}

public class SortLinkedList {

	public static void main(String[] args) {

		LinkedList5 linkedList = new LinkedList5();
		linkedList.insertNodeAfter(3);
		linkedList.insertNodeAfter(2);
		linkedList.insertNodeAfter(1);
		linkedList.insertNodeAfter(5);
		linkedList.insertNodeAfter(4);

		linkedList.printLinkedList(linkedList);
		System.out.println();

		LinkedList5 sortedLinkedList = linkedList.sortLinkedList(linkedList);
		System.out.println("Sorted Linked List" + "/n");
		sortedLinkedList.printLinkedList(sortedLinkedList);

	}

}
