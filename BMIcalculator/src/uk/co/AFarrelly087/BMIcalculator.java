package uk.co.AFarrelly087;
/**
 * Class calculates the BMI of the user
 * @author AFarrelly087
 * @version 1.0.0
 * */
public class BMIcalculator {
	/**
	 * Calculates the users BMI
	 * @param userHeight is the users height in inches
	 * @param userWeight is the users weight in pounds
	 * */
	public double calculateBMI(double userHeight, double userWeight) {
		double calc1 = userHeight*703;
		double calc2 = calc1/65;
		double calc3 = calc2/65;
		
		return calc3;
	}

}
