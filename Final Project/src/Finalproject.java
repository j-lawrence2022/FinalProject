//Application: Final project
//Name: Justin Lawrence 
//GitHub User: j-lawrence2022
//Date: Dec 5 2022
//Version: 1.0
//Description: Final project
import java.io.*;
import java.util.Scanner;
import java.io.File;
public class Finalproject {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		FileWriter receipt = new FileWriter("/Users/justinlawrence/Desktop/receiptData.txt", true); 
		//PrintWriter of = new PrintWriter(receipt);
		
		
	
		//Use 2d array to show average price for a customer
		int [][] arr= { {10,12,11,8}, {5,8,6,4} };
		int sum1=0, sum2=0,i,j=0;
		int avg;

		for(i=0; i<4;i++)
		{
		sum1+=arr[j][i];
		sum2+=arr[j+1][i];
		}
		avg= (int)(sum1+sum2)/(8);
		System.out.println("Here are the prices for food items provided.");
		showarray(arr);
		System.out.println("The average price people pay for meals hear are " +avg);

		

	//Ask question for customer name 
		System.out.println("What is your name for this order?");
		String name = keyboard.nextLine();
		
	//create initial amount for w,x,y, and z for selections
		int menuChoice =0;
		int w = 0;
		int x = 0;
		int y = 0;
		int z = 0;
		char item;
	//select item you want
		do
	{
		menuChoice = menu();
		if (menuChoice == 1 )
		{
			w ++;
		}if(menuChoice == 2)
		{
			x ++;
		}
		if(menuChoice == 3)
		{
			y ++;
		}
		if (menuChoice == 4)
		{
			z ++;
		}
		System.out.println("Is this the item you want y/n?");
		item = keyboard.next().charAt(0);
		
	}while(item == 'n');
		
	//create sum fo w,x,y, and z
		int sum = 0;
		switch(menuChoice)
		{
		
		case 1:
			sum = 10 * w;
			break;
		case 2:
			sum = 12 * x;
			break;
		case 3:
			sum = 11 * y;
			break;
		case 4:
			sum = 8 * z;
		}
		
		//print balance for the customer
		
System.out.println("Thank you " +name+ " the total balance of your meal is " +sum);

//Ask if the customer wants and bevarage and ask for input of yes or no		
System.out.println("Do you want a beverage with your meal y/n?");
char beverage = keyboard.next().charAt(0);
int sumtwo = sum;	

//Use to create menu if the answer is yes
if (beverage == 'y')
{
	//create menu for beverages
	System.out.println("Beverage Menu");
	System.out.println("1.Soda(Pepsi products) $5");
	System.out.println("2.Milkshake $8");
	System.out.println("3. Lemondade $6");
	System.out.println("4. Water $4");
	System.out.println("Which beverage do you want?");
	int drinkChoice = keyboard.nextInt();
	
	//Create the added prices from beverages
	switch(drinkChoice)
	{
case 1:
	sumtwo = sum + 5;
	break;
case 2:
	sumtwo = sum + 8;
	break;
case 3:
	sumtwo = sum + 6;
	break;
case 4:
	sumtwo = sum + 4;
	}
	
	//print balance for new total balance
	System.out.println("The total balance is now " +sumtwo+ ".");
	receipt.write("Total price: " +sumtwo);
	
	
}else 
{
	//show the balance if the answer is no
	System.out.println("The final balance is " + sum);
	receipt.write("Total price: " +sum);
	
	
}
receipt.close();
//Determine input if you want to pay debit or cash  
	System.out.println("Are you paying with Debit(D) or Cash(C)?");	
		char payment = keyboard.next().charAt(0);
		
		//If input is D use if statement to use a for loop showing the countdown to no change
		if (payment == 'D')
		{
			for (int a = sumtwo; a >= 0; a--)
			{
				System.out.println("The total cost is " +a);
				
			}
			System.out.println("There is no change for your payment");
			
		}else
		{
			//Have else show what happens if cash is chosen instead.
			System.out.println("Please give cash to cashier to receive your change");
		}
}
		

		

{
	
}
	
public static int menu()
{
	//create menu for food and scanner for input using methods
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Menu:");
	System.out.println("1. Hamburger and fries $10");
	System.out.println("2. Cheeseburger and fries $12");
	System.out.println("3. Hotdog and fries $11");
	System.out.println("4. Salad $8");
	System.out.println("Choose a food items");
	int itemChoice = keyboard.nextInt();
	return itemChoice;

}
//use for loop to create array
private static void showarray(int[][] array)
{
for (int row = 0; row < array.length; row++)
{
for (int col = 0; col < array[row].length; col++)
	System.out.print(array[row][col] + " ");

}


}
{
	

}
}


