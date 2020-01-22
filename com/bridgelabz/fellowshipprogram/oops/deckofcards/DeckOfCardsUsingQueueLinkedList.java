package com.bridgelabz.fellowshipprogram.oops.deckofcards;

import java.util.Random;

/**
 * @author Tejashree Surve
 * @Purpose : Deck Of cards using linked list .
 */
public class DeckOfCardsUsingQueueLinkedList {

	// This method enqueue the cards in Queue and print the list
	public static void printTheArray(String[] arrayOfPlayer) {
		QueueUsingLinkedList<String> queue = new QueueUsingLinkedList<String>();
		for (int i = 0; i < arrayOfPlayer.length; i++) {
			queue.enqueue(arrayOfPlayer[i]);
		}
		queue.printList();
	}

	// This method distributed the cards between 4 players
	public static void distributeCards(String[] arrayForDistribute) {
		int j = 0;
		String[] Player1 = new String[13];
		String[] Player2 = new String[13];
		String[] Player3 = new String[13];
		String[] Player4 = new String[13];
		while (j < 52) {
			for (int i = 0; i < 13; i++) {
				Player1[i] = arrayForDistribute[j];
				j++;
				Player2[i] = arrayForDistribute[j];
				j++;
				Player3[i] = arrayForDistribute[j];
				j++;
				Player4[i] = arrayForDistribute[j];
				j++;
			}
		}
		System.out.println("PLAYER 1\n");
		printTheArray(Player1);
		System.out.println();
		System.out.println("PLAYER 2\n");
		printTheArray(Player2);
		System.out.println();
		System.out.println("PLAYER 3\n");
		printTheArray(Player3);
		System.out.println();
		System.out.println("PLAYER 4\n");
		printTheArray(Player4);
	}

	public static void main(String[] args) {
		Random randomFunction = new Random();
		String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] Rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		String[] deckOfCards = new String[52];
		int k = 0;
		while (k < 52) {
			for (int i = 0; i < Rank.length; i++) {
				for (int j = 0; j < suit.length; j++) {
					deckOfCards[k] = Rank[i] + " of " + suit[j];
					k++;
				}
			}
		}
		System.out.println("this is cards\n");
		for (int j = 0; j < 52; j++) {
			System.out.println(deckOfCards[j]);
		}
		int randomNumber;
		String swapString;
		System.out.println("this is swap array\n");
		for (int i = 0; i < 52; i++) { // swap the cards using random number
			randomNumber = randomFunction.nextInt(52);
			swapString = deckOfCards[randomNumber];
			deckOfCards[randomNumber] = deckOfCards[i];
			deckOfCards[i] = swapString;
		}
		distributeCards(deckOfCards);
	}
}
