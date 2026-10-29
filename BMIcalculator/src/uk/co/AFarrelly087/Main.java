package uk.co.AFarrelly087;

/**
 * Main system for user interaction with system
 * @author AFarrelly087
 * @version 1.0.0
 **/
public class Main {

	public BMICalculator BMI = new BMICalculator();
	/**
	 * Runs the code in the constructor to avoid being in static variables
	 * */
	Main() {
		double userBMI = BMI.calculateBMI();
		System.out.println("Your BMI is: " + userBMI);
	}


	
	/**
	 * Runs when the user is using metric measurements
	 * */
	public void userMetric() {
		
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
