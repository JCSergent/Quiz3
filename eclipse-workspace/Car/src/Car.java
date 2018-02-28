
public class Car {
	private double carCost;
	private double downPayment;
	private double loanLength;
	private double interestRate;
	
	public Car(double carCost, double downPayment, double loanLength, double interestRate) {
		this.carCost = carCost;
		this.downPayment = downPayment;
		this.loanLength = loanLength;
		this.interestRate = interestRate;
	}
	public double totalInterest() {
		return carCost*(interestRate*(loanLength/12));
	}
	
	public double monthlyPayment() {
		return (carCost+ totalInterest())/loanLength;
	}
	
}
