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
	 * @param weight, the users weight
	 * @param metric is the boolean that determines if the weight is converted to imperial
	 * 
	 * */
	public double calculateWeight(double weight, Boolean metric) {
		if(metric==true) {
			double userWeight = weight*2.205;
			return userWeight;
		}
		return weight;
		
	}
	/**
	 * Converts user height from meters to inches
	 * @param height is the users height
	 * @param metric boolean to determine if the height should be converted
	 * */
	public double calculateHeight(double height, Boolean metric) {
		if(metric == true) {
			double userHeight = height * 39.3701;
			return userHeight;
		}
		
		return height;
	}
	
}
