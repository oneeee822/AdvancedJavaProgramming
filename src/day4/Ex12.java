package day4;

import java.util.ArrayList;
import java.util.List;

public class Ex12 {
	
	public static void main(String[] args) {
		// Create a ArrayList with elements
		// 3.4, 8.8, 7.9, 9, 10, 12, 0, -13
				
		String[] suit = {"♠", "♥", "♣", "♦"};
		String[] num = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		String[] card = new String[suit.length * num.length];
		
		int rand;
		String temp;
		
		for(int i = 0 ; i < suit.length; i++) {
			for(int j = 0 ; j < num.length; j ++) {
				card[13*i+j] = (suit[i]+num[j]);
				
			}
		}
		
		int n = card.length;
		for(int i = 0 ; i < card.length; i++) {
			rand = i + (int)Math.random() * (n - i);
			
			temp = card[rand];
			card[i] =  card[n-rand];
			card[n-rand] = temp;
		}
		
		for(String c : card) {
			System.out.println(c);
			
		}
		
		
		
	}
	
	
	/***
	public static void main(String[] args) {
		// Create a ArrayList with elements
		// 3.4, 8.8, 7.9, 9, 10, 12, 0, -13
				
		List<String> deck = new ArrayList<String>();
		String[] suit = {"♠", "♥", "♣", "♦"};
		String[] rank = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		String temp;
		double rand;
		int k;
		
		for(int i = 0 ; i < suit.length; i++) {
			for(int j = 0 ; j < rank.length; j ++) {
				deck.add(suit[i]+rank[j]);
			}
		}
		
		for(int i = 0 ; i < deck.size(); i++) {
			rand = Math.random();
			k = (int)(i * rand);
			temp = deck.get(k);
			deck.set(k, deck.get(deck.size()-k-1));
			deck.set(deck.size()-k-1, temp);
		}
		
		System.out.println(deck);
		
	}
	***/
}
