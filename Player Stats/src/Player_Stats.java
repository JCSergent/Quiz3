import java.util.Scanner;

public class Player_Stats {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of times at bat:  ");
		int AtB = input.nextInt();
		
		System.out.print("Enter the number of hits:  ");
		int Hits = input.nextInt();
		
		System.out.print("Enter the number of doubles:  ");
		int dbl = input.nextInt();
		
		System.out.print("Enter the number of triples:  ");
		int triple = input.nextInt();
		
		System.out.print("Enter the number of Home Runs:  ");
		int HR = input.nextInt();
		
		System.out.print("Enter the number of runs:  ");
		int Runs = input.nextInt();
		
		System.out.print("Enter the number of walks:  ");
		int Walks  = input.nextInt();
		
		double BA = BA(AtB, Hits);
		double OBP = OBP(Runs, Walks, AtB);
		double SLG = SLG(AtB, Hits, dbl, triple, HR);
		double OBS = OBS(OBP,SLG);
		double TB = TB(Hits, dbl, triple, HR);
		System.out.println("Batting Average: " + BA);
		System.out.println("On Base Percentage: " + OBP);
		System.out.println("Slugging Percentage: " + SLG);
		System.out.println("On Base + Slugging Percentage: " + OBS);
		System.out.println("Total Bases: " + TB);
		
	}
	
	public static double BA(double AtB, double Hits){
		double BA = Hits/AtB;
		return BA;
	}
	
	public static double OBP(double Runs, double Walks, double AtB) {
		double OBP = (Runs + Walks)/ AtB;
		return OBP;
	}
	
	public static double SLG(double AtB, double Hits, double dbl, double triple, double HR) {
		double SLG = ((Hits-dbl-triple-HR)+(dbl*2)+(triple*3)+(HR*4))/AtB;
		return SLG;
	}
	
	public static double OBS(double OBP, double SLG) {
		double OBS = OBP + SLG;
		return OBS;
	}
	
	public static double TB(int Hits, int dbl, int triple, int HR) {
		double TB = (Hits-dbl-triple-HR)+(dbl*2)+(triple*3)+(HR*4);
		return TB;
	}

}	

