package uk.co.AFarrelly087;

import java.util.Scanner;

/**
 * Class calculates the BMI of the user
 * @author AFarrelly087
 * @version 1.0.0
 * */
public class BMICalculator {

	private Scanner input = new Scanner(System.in);
	private dataConverter converter = new dataConverter();
	private double userWeight, userHeight;

	/**
	 * Calculates the users BMI
	 * */
	public double calculateBMI() {

		setup();

		double bmi = (userHeight * userHeight)/userWeight;
		
		return bmi;
	}

	private void setup(){
		boolean completed = false;

		double height = 0;
		double weight = 0;
		int feet = 0;
		int inches = 0;
		int pounds = 0;
		int stone = 0;


		while (completed == false){
			System.out.println("Are you using the Imperial or Metric System");
			String answer = input.next();
			while(height == 0) {
				if (answer.toLowerCase().equals("imperial")) {
					System.out.println("Please enter how many foot tall you are:");
					answer = input.next();
					if (isInteger(answer) == true) {
						feet = Integer.parseInt(answer);
					}
					else {
						feet = 0;
					}
					System.out.println("Please enter how many inches:");
					answer = input.next();
					if (isInteger(answer) == true) {
						inches = Integer.parseInt(answer);
					}
					else {
						inches = 0;
					}
					height = converter.calculateHeightInMetres(feet,inches);
					System.out.println("Please enter how many pounds(lb) you weigh:");
					answer = input.next();
					if (isInteger(answer) == true) {
						pounds = Integer.parseInt(answer);
					}
					else {
						pounds = 0;
					}
					System.out.println("Please enter how many stone(st) you weigh:");
					answer = input.next();
					if (isInteger(answer) == true) {
						stone = Integer.parseInt(answer);
					}
					else {
						stone = 0;
					}
					weight = converter.calculateWeightInKilograms(stone,pounds);

				} else if (answer.toLowerCase().equals("metric")) {
					System.out.println("Please enter how tall you are in metres:");
					answer = input.next();
					if (isInteger(answer) == true) {
						height = Integer.parseInt(answer);
					}
					else {
						height = 0;
					}
					System.out.println("Please enter your weight in kg:");
					answer = input.next();
					if (isInteger(answer) == true) {
						weight = Integer.parseInt(answer);
					}
					else {
						weight = 0;
					}

				}

				if(weight == 0){
					height = 0;
				}
				else{
					userHeight = height;
					userWeight = weight;
					completed = true;
				}



			}
		}
	}

	private boolean isInteger(String value){
		try{
			Integer.parseInt(value);
			return true;
		} catch (NumberFormatException e){
			return false;
		}
	}


}
