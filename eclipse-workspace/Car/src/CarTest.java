import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {

	@Test
	void test() {
		Car test = new Car(35000,50, 60, .10);
		System.out.print("Total Interest: "+test.totalInterest()+ "\nMonthly Payement: "+test.monthlyPayment());
		
		
	}

}
