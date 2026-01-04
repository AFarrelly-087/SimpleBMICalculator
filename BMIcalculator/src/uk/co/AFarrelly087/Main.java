package uk.co.AFarrelly087;

import java.util.Scanner;
/**
 * Main system for user interaction with system
 * @author AFarrelly087
 * @version 1.0.0
 **/
public class Main {
	private Scanner input = new Scanner(System.in);
	private String userInput;
	private double userWeight, userHeight;
	public measurementData userData = new measurementData();
	public dataConverter convert = new dataConverter();
	public BMIcalculator BMI = new BMIcalculator();
	/**
	 * Runs the code in the constructor to avoid being in static variables
	 * */
	Main() {

		System.out.println("Enter what system of measurement you are using:");
		Boolean completed = false;
		while (completed == false) {
			System.out.println("1. Imperial (Feet/Pounds");
			System.out.println("2. Metric (Centimetres/Kilograms");

			userInput = input.nextLine();

			if (userInput.equals("1")) {
				userImperial();
				completed = true;
			} else if (userInput.equals("2")) {
				userMetric();
				completed = true;
			} else {
				System.out.println("Please enter a either 1 or 2");
			}
		}
		
		userHeight = convert.calculateHeight(userData.getUserHeight(),userData.getMetric());
		userWeight = convert.calculateWeight(userData.getUserWeight(), userData.getMetric());
		
		System.out.println("User BMI:" + BMI.calculateBMI(userHeight, userWeight));
		
		

	}
	/**
	 * Runs if the user is using Imperial measurements
	 * */
	public void userImperial() {

		System.out.println("Input your weight (in pounds)");
		userWeight = input.nextDouble();
		System.out.println("Input your height in feet and then inches on the next line (after pressing enter)");
		int userFeet = input.nextInt();
		int userInches = input.nextInt();
		userHeight = (userFeet*12) + userInches;
		userData.setUserHeight(userHeight);
		userData.setUserWeight(userWeight);
		userData.setImperial(true);
		
		System.out.println("User Height:" + userFeet + "'" + userInches);
		System.out.println("User Weight:" + userWeight + "lb");
	}
	
	/**
	 * Runs when the user is using metric measurements
	 * */
	public void userMetric() {
		System.out.println("Input your weight (in Kilograms)");
		userWeight = input.nextDouble();
		System.out.println("Input your height (in metres)");
		userHeight = input.nextDouble();	
		userData.setUserHeight(userHeight);
		userData.setUserWeight(userWeight);
		userData.setMetric(true);
		System.out.println("User Height:" + userHeight + "meters");
		System.out.println("User Weight:" + userWeight + "kgs");
		
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
