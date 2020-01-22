package com.bridgelabz.fellowshipprogram.oops.Stock.utility;

public class UnOrderedList<T> {
	Node head;

	public static class Node<T> {
		T data;
		Node next;

		Node(T str) {
			data = str;
			next = null;
		}
	}

	public UnOrderedList<T> insertAtEnd(UnOrderedList<T> list, T data) {
		Node<T> new_node = new Node(data);
		new_node.next = null;

		if (list.head == null) {
			list.head = new_node;
		} else {
			Node<T> last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}
		return list;
	}

	public T pop(UnOrderedList<T> list, T string) {
		Node<T> currnode = list.head;
		Node<T> prev = null;

		if ((currnode != null) && (currnode.data == string)) {
			list.head = currnode.next;
			System.out.println("Value is been deleted");
		}
		while ((currnode != null) && (currnode.data != string)) {
			prev = currnode;
			currnode = currnode.next;
		}
		if (currnode != null) {
			prev.next = currnode.next;
			System.out.println("Value is been deleted\n");
		}
		return currnode.data;
	}

	public int size(UnOrderedList<T> list) {
		int size = 0;
		Node<T> currNode;
		currNode = list.head;
		System.out.println("Linked list: \n");
		while (currNode != null) {
			size++;
			currNode = currNode.next;
		}
		return size;
	}

	public T get(int index) {
		Node<T> node = head;
		for (int i = 0; i < index; i++) {
			if (node.next != null) {
				node = node.next;
			} else {
				return null;
			}
		}
		return node.data;
	}

	public T popfromFront() {
		Node<T> node = head;
		T data = node.data;
		head = node.next;
		return data;
	}

}
