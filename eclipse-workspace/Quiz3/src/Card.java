
public class Card {

	private eRank eRank;
	private eSuit eSuit;
	
	public Card(eRank eRank, eSuit eSuit) {
		this.eRank = eRank;
		this.eSuit = eSuit;
	}
	
	public eRank geteRank() {
		return eRank;
	}
	
	public eSuit geteSuit() {
		return eSuit;
	}
	
	private void setRank(eRank eRank) {
		this.eRank = eRank;
	}
	
	private void setSuit(eSuit eSuit) {
		this.eSuit = eSuit;
	}
}
