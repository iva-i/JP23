package tasks;

import java.util.Scanner;

public class Task3006 {

	public static void main(String[] args) {
		// (Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to
		// let the user enter weight, feet, and inches. For example, if a person is 5
		// feet and 10 inches, you will enter 5 for feet and 10 for inches.

		Scanner input = new Scanner(System.in);

		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();

		System.out.print("Enter height in feet and inches: ");
		double heightFeet = input.nextDouble(), heightInches = input.nextDouble();

		final double KILOGRAMS_PER_POUND = 0.45359237, METERS_PER_INCH = 0.0254, METERS_PER_FEET = 0.3048;

		double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = heightFeet * METERS_PER_FEET + heightInches * METERS_PER_INCH;
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);

		System.out.println("BMI is " + bmi);
		if (bmi < 18.5)
			System.out.println("Underweight");
		else if (bmi < 25)
			System.out.println("Normal");
		else if (bmi < 30)
			System.out.println("Overweight");
		else
			System.out.println("Obese");
	}

}
