package com.sampurna.javabootcamp;

/**
 * Just write a program in Java to find the length of a singly linked list in
 * one pass, i.e. in just one iteration of a singly linked list.
 **/
class LinkedList2 {

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

	void printLinkedList() {
		Node node = head;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	Integer getLength(LinkedList2 linkedList) {
		Node node = linkedList.head;
		Integer length = 0;
		while (node != null) {
			length++;
			node = node.next;
		}
		return length;
	}
}

public class LengthOfLinkedList {

	public static void main(String[] args) {

		LinkedList2 linkedList = new LinkedList2();
		linkedList.insertNodeAfter(1);
		linkedList.insertNodeAfter(2);
		linkedList.insertNodeAfter(3);
		linkedList.insertNodeAfter(4);
		linkedList.insertNodeAfter(5);

		linkedList.printLinkedList();
		Integer length = linkedList.getLength(linkedList);
		System.out.println("Length" + " " + length);
	}

}
