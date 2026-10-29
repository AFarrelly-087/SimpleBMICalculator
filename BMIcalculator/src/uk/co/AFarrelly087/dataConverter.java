package uk.co.AFarrelly087;
/**
 * converts from metric to imperial units of measurement
 * @author AFarrelly087
 * @version 1.0.0
 * */
public class dataConverter {

	dataConverter(){
		
	}

	/**
	 * Converts the users body weight if the users weight is in metric, otherwise returns the weight
	 * @param stone, the users weight in stone
	 * @param pounds, the users weight in pounds
	 * 
	 * */
	public double calculateWeightInKilograms(int stone, int pounds) {
		double poundsToKg = pounds * 0.45359237;
		double stoneToKg = stone * 6.350293;

        return stoneToKg + poundsToKg;
	}
	/**
	 * Converts user height from meters to inches
	 * @param feet is the users height in feet
	 * @param inches is the remainder of the users height in inches
	 * */
	public double calculateHeightInMetres(int feet, int inches) {
		double inchesToCentimetre = inches * 2.54;
		double feetToCentimetre = feet * 30.48;
        return (feetToCentimetre + inchesToCentimetre)/100;
	}
	
}
