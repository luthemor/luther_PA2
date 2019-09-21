package luther_p3;
import java.util.Scanner;

public class Assignment2problem3{
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		
		int [][]ratings=new int [5][10];
		String []topics = {"Animals","Books","Sports","Movies","Food"};
		int choice;
		int numVoted=0;
		double []average = new double [5];
		int totalHigh=0;
		int totalLow=0;
		int max=0;
		int min=0;
		int sum=0;
		
			System.out.println("Does someone want to rate?");
			System.out.println("Type '1' for yes or '2' for no");
			choice = in.nextInt();
			
			if (choice == 1)
			{
				numVoted = 1;
				while (true) {
				System.out.println("Rate the importance of the following topics on a of scale 1-10.");
				System.out.println("The topics are: Animals, Books, Sports, Movies, Food");
				
				System.out.println("How would you rate Animals(1-10)?");
				choice = in.nextInt();
				ratings[0][choice-1]++;
				
				System.out.println("How would you rate Books(1-10)?");
				choice = in.nextInt();
				ratings[1][choice-1]++;
				
				System.out.println("How would you rate Sports(1-10)?");
				choice = in.nextInt();
				ratings[2][choice-1]++;
				
				System.out.println("How would you rate Movies(1-10)?");
				choice = in.nextInt();
				ratings[3][choice-1]++;
				
				System.out.println("How would you rate Food(1-10)?");
				choice = in.nextInt();
				ratings[4][choice-1]++;
				
				System.out.println("Does someone else want to rate?");
				System.out.println("Type '1' for yes, '2' for no");
				choice = in.nextInt();
				if (choice == 2) {
					break;
				}
			numVoted++;
				
				
			
		}
			}
			
			for (int i = 0; i<5; i++) {
				sum = 0;
				
			
				for (int j=0;j<10;j++) {
					sum = sum + ((j+1)*(ratings[i][j]));
					
				}
				
			average[i] = ((double)sum/numVoted);
			if (i==0) {
				max = sum;
				min = sum;
				totalHigh= i;
				totalLow=i;
			}
			else {
				if(sum>max) {
					max = sum;
					totalHigh=i;
				}
				if(sum<min) {
					min = sum;
					totalLow = i;		
				}
			}
			}
			
			
				System.out.println("        1  2  3  4  5  6  7  8  9  10  Avg"); 
				for (int i = 0; i<5; i++) {
					
				
					System.out.print(String.format("%-8s", topics[i]));
					for (int j=0;j<10;j++) {
						System.out.printf("%d  ", ratings[i][j]);
					}
					System.out.printf("%.2f", average[i]);
					System.out.println();
				}
	
				System.out.printf("%s recieved the most points with %d\n", topics[totalHigh], max);
				System.out.printf("%s recieved the least points with %d\n", topics[totalLow], min);
	}
}
	
