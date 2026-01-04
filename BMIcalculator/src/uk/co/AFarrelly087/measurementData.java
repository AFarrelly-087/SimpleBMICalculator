package uk.co.AFarrelly087;
/**
 * stores the users measurement data
 * @author AFarrelly087
 * @version 1.0.0
 * */
public class measurementData {
	
	private double userHeight, userWeight;
	private Boolean imperial = false, metric = false;
	
//Getters
	public double getUserHeight() {
		return userHeight;
	}

	public double getUserWeight() {
		return userWeight;
	}

	public Boolean getImperial() {
		return imperial;
	}

	public Boolean getMetric() {
		return metric;
	}
//Setters
	public void setUserHeight(double Height) {
		userHeight = Height;
	}

	public void setUserWeight(double Weight) {
		userWeight = Weight;
	}

	public void setImperial(Boolean uimperial) {
		imperial = uimperial;
	}

	public void setMetric(Boolean umetric) {
		metric = umetric;
	}
}
	