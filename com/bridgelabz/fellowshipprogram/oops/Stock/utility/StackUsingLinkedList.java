package com.bridgelabz.fellowshipprogram.oops.Stock.utility;

public class StackUsingLinkedList<T> {

	public class Node<T> {
		T data;
		Node next;

		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	Node top = null;

	public StackUsingLinkedList() {
		this.top = null;
	}

	public void push(T valueToList) {
		Node node = new Node(valueToList);
		node.next = top;
		this.top = node;
	}

	public T pop() {
		T value;
		if (isempty()) {
			return null;
		} else {
			value = (T) this.top.data;
			this.top = this.top.next;

			return value;
		}
	}

	public boolean isempty() {
		if (top == null) {
			return true;
		} else {
			return false;
		}
	}

	public void printStack() {
		if (isempty())
			System.out.println("stack is empty\n");
		else {
			Node currNode = top;
			while (currNode != null) {
				System.out.println(currNode.data);
				currNode = currNode.next;
			}
		}
	}
}
