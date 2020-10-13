package com.sampurna.javabootcamp;

/** Finding Middle element of linked list in one pass **/

class LinkedList {

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
	
	Node getMid(LinkedList linkedList) {
		
		Node last = linkedList.head;
		Node counter = linkedList.head;
		
		while (last.next != null && last.next.next != null) {
			last = last.next.next;
			counter = counter.next;
		}
		
		return counter;
	}
}

public class MiddleElementInLinkedList {

	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();
		linkedList.insertNodeAfter(1);
		linkedList.insertNodeAfter(2);
		linkedList.insertNodeAfter(3);
		linkedList.insertNodeAfter(4);
		linkedList.insertNodeAfter(5);
		linkedList.insertNodeAfter(6);
		linkedList.insertNodeAfter(7);

		linkedList.printLinkedList();
		System.out.println();

		System.out.println("Middle element = " + " " + linkedList.getMid(linkedList).data);
		
	}

}
