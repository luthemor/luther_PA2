package luther_p2;
import java.util.Scanner;

public class problem2 {

	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		
		double BMI; 
		int choice;
		double height; 
		double weight;
		
		System.out.println("Do you want to calculate your BMI in Metric or Imperial units?");
		System.out.println("Type 1 for Metric or 2 for Imperial.");
		choice = in.nextInt();
		
		if (choice == 1) {
			
			System.out.println("What is your height in meters?");
			height = in.nextDouble();
			System.out.println("What is your weight in kilograms?");
			weight = in.nextDouble();
			
			BMI = (weight/(height * height));
			System.out.println("This is your BMI.");
			System.out.printf("%.2f\n\n", BMI);
		
		}
		
		if (choice == 2) {
			
			System.out.println("What is your height in inches?");
			height = in.nextDouble();
			System.out.println("What is your weight in pounds?");
			weight = in.nextDouble();
			
			BMI = ((703*weight)/(height * height));
			System.out.println("This is your BMI.");
			System.out.printf("%.2f\n\n", BMI);
		}
		
		System.out.println("These are the BMI categories.");
		System.out.println("Underweight = <18.5");
		System.out.println("Normal Weight = 18.5-24.9");
		System.out.println("Overweight = 25-29.9");
		System.out.println("Obesity = >30");
		
			
			
	}
}
