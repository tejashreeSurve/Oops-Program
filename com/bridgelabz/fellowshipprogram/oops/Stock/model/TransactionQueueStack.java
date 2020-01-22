package com.bridgelabz.fellowshipprogram.oops.Stock.model;

import com.bridgelabz.fellowshipprogram.oops.Stock.utility.QueueUsingLinkedList;
import com.bridgelabz.fellowshipprogram.oops.Stock.utility.StackUsingLinkedList;

public class TransactionQueueStack {
	public QueueUsingLinkedList<Transaction> list = new QueueUsingLinkedList<Transaction>();
	public StackUsingLinkedList<Transaction> slist = new StackUsingLinkedList<Transaction>();
}
