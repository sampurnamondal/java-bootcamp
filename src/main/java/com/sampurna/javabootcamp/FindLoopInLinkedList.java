package com.sampurna.javabootcamp;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a program to check if given linked list has a loop or not. Sometimes a
 * linked list get corrupt, and two nodes point to the same node, which forms
 * the loop or cycle in the linked list.
 */

class LinkedList3 {

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

	void printLinkedList(LinkedList3 linkedList) {
		Node node = linkedList.head;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	void createCorruptLinkedList(Node head, Integer number) {
		Node corruptNode = new Node(6);
		Node node = head;
		while (node != null) {
			if (node.next == null) {
				node.next = corruptNode;
				corruptNode.next = head.next.next;
				break;
			}
			node = node.next;

		}
	}

	Boolean isLoopPresent(LinkedList3 linkedList) {
		Boolean isLoopPresent = true;
		Node node = linkedList.head;
		List<Integer> linkedListData = new ArrayList<>();

		while (node != null) {
			if (!linkedListData.contains(node.next.data)) {
				linkedListData.add(node.next.data);
			} else {
				isLoopPresent = true;
				break;
			}
			node = node.next;
		}
		return isLoopPresent;
	}
}

public class FindLoopInLinkedList {

	public static void main(String[] args) {

		LinkedList3 linkedList = new LinkedList3();
		linkedList.insertNodeAfter(1);
		linkedList.insertNodeAfter(2);
		linkedList.insertNodeAfter(3);
		linkedList.insertNodeAfter(4);
		linkedList.insertNodeAfter(5);
		linkedList.createCorruptLinkedList(linkedList.head, 6);

		linkedList.printLinkedList(linkedList);

		Boolean isLoopPresent = linkedList.isLoopPresent(linkedList);
		System.out.println(isLoopPresent);
	}

}
