package com.sampurna.javabootcamp;

/*need to write a program to find the 3rd element from the tail of a singly linked list**/

class Node {

	Integer data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkedList4 {

	Node head;

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

	void printLinkedList(LinkedList4 linkedList) {
		Node node = linkedList.head;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	Integer getthirdFromLast(LinkedList4 linkedList, Integer number) {

		Node node = linkedList.head;
		Node counter = linkedList.head;
		Integer count = 1;

		while (node.next != null) {
			node = node.next;
			count++;

			if (count > number) {
				counter = counter.next;
			}
		}
		return counter.data;
	}
}

public class ThirdElementFromLastLinkedlIist {

	public static void main(String[] args) {

		LinkedList4 linkedList = new LinkedList4();
		linkedList.insertNodeAfter(1);
		linkedList.insertNodeAfter(2);
		linkedList.insertNodeAfter(3);
		linkedList.insertNodeAfter(4);
		linkedList.insertNodeAfter(5);
		linkedList.insertNodeAfter(6);

		linkedList.printLinkedList(linkedList);

		Integer thirdFromLast = linkedList.getthirdFromLast(linkedList, 3);
		System.out.println("Third from last element:" + " " + thirdFromLast);

	}

}
