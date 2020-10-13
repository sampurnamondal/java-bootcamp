package com.sampurna.javabootcamp;

/** Write a program to reverse a singly linked list in Java. **/

class LinkedList1 {

	Node head;

	class Node {

		Integer data;
		Node next;

		Node(Integer data) {
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

	void reverseLinkedList() {

		Node node = head;
		Node temp = null;
		Boolean flag = false;

		while (node != null) {
			if (node.next != null) {
				head = node.next;
			}else {
				flag = true;
			}
			node.next = temp;
			temp = node;
			if (flag) {
				break;
			}
			node = head;
		}
	}
}

public class ReverseLinkedListInPlace {

	public static void main(String[] args) {

		LinkedList1 linkedList = new LinkedList1();
		linkedList.insertNodeAfter(1);
		linkedList.insertNodeAfter(2);
		linkedList.insertNodeAfter(3);
		linkedList.insertNodeAfter(4);
		linkedList.insertNodeAfter(5);

		linkedList.printLinkedList();
		System.out.println();

		linkedList.reverseLinkedList();
		System.out.println("Reverse linked list" + "/n");
		linkedList.printLinkedList();

	}

}
