import java.util.Scanner;

public class problem1 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);//.useDelimiter("");
		
		int dataVal1;
		int dataVal2;
		int dataVal3;
		int dataVal4;
		int choice; 
		int userInput;
		
		System.out.println("Do you want to decrypt or encrypt?");
		System.out.println("Press 1 for encrypt. Press 2 for decrypt.");
		choice = in.nextInt();
		
		if (choice == 1)
		{
			System.out.println("Enter four integers");
			userInput = in.nextInt();
			dataVal1 = userInput/1000;
			dataVal2 = (userInput%1000)/100;
			dataVal3 = (userInput%100)/10;
			dataVal4 = (userInput%10);
		

		dataVal1 = (dataVal1+7)%10;
		dataVal2 = (dataVal2+7)%10;
		dataVal3 = (dataVal3+7)%10;
		dataVal4 = (dataVal4+7)%10;
		

		int temp = dataVal1;
		dataVal1 = dataVal3;
		dataVal3 = temp;
		temp = dataVal4;
		dataVal4 = dataVal2;
		dataVal2 = temp;
		
		System.out.print(dataVal1);
		System.out.print(dataVal2);
		System.out.print(dataVal3);
		System.out.print(dataVal4);
				
	}
		
		if (choice == 2)
		{
			System.out.println("Enter four integers.");
			userInput = in.nextInt();
			dataVal1 = userInput/1000;
			dataVal2 = (userInput%1000)/100;
			dataVal3 = (userInput%100)/10;
			dataVal4 = (userInput%10);
			
			dataVal1 = (dataVal1 + 3)%10;
			dataVal2 = (dataVal2 + 3)%10;
			dataVal3 = (dataVal3 + 3)%10;
			dataVal4 = (dataVal4 + 3)%10;
			
			System.out.print(dataVal3);
			System.out.print(dataVal4);
			System.out.print(dataVal1);
			System.out.print(dataVal2);
			

	
}
	}
}	
	
