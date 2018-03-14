import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	private ArrayList<Card> cards = new ArrayList<Card>(); 
	
	public Deck(int nOfDecks) {
		
		for(int i=0; i<nOfDecks;i++) {
			for(eRank eRank: eRank.values()) {
				
				for(eSuit eSuit: eSuit.values()) {
					
					cards.add(new Card(eRank,eSuit));
					
				}
			}
		}
		Collections.shuffle(cards);	
	}
				
	public Card draw() {
		Card c = cards.get(0);
		cards.remove(c);
		return c;
	}
	
	public int getRemaining(Object eNum) {
		int counter=0;
		if(eNum instanceof eRank) {
			for(Card c : cards) {
				if(c.geteRank()==eNum) {
					counter += 1;
				}
			}
			return counter;
		}
		else {
			for(Card c : cards) {
				if(c.geteSuit()==eNum) {
					counter += 1;
				}
			}
			return counter;
		}
	}
	
	public int SizeOfDeck() {
		return cards.size();
	}
}