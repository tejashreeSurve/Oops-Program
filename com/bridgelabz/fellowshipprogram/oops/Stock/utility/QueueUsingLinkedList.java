package com.bridgelabz.fellowshipprogram.oops.Stock.utility;

public class QueueUsingLinkedList<T> {
	public class Node<T> {
		T data;
		Node next;

		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	Node front, rare;

	public QueueUsingLinkedList() {
		this.front = null;
		this.rare = null;
	}

	public void enqueue(T valueToList) {
		Node node = new Node(valueToList);
		if (this.rare == null) {
			this.front = node;
			this.rare = node;
		} else {
			this.rare.next = node;
			this.rare = this.rare.next;
		}
	}

	public T dequeue() {
		Node currNode;
		if (isEmpty())
			return null;
		T deletedNode = (T) this.front.data;
		currNode = this.front;
		this.front = currNode.next;

		if (this.front == null)
			this.rare = null;
		return deletedNode;
	}

	public boolean isEmpty() {
		if (this.front == null)
			return true;
		else
			return false;
	}

	public void printQueueLinkedList() {
		while (this.front != null) {
			System.out.println(this.front.data + " ");
			this.front = this.front.next;
		}
	}
}
