
public class NigCensus {

	public static void main(String[] args) {
		
		double popIncrease = 0;
		double currentPop = 206000000;
		double birthRate = 0.03;
		double margin = 1.0;
		System.out.printf("%s%25s%n","YEAR", "Popu-INCREASE");
		for(int year =1; year <= 10; year++) {
			
			
			popIncrease = currentPop * Math.pow( margin + birthRate, year);
			
			
			System.out.printf("%3d%26.2f%n", year,popIncrease);
			
			
		}
		
		
	}

}
