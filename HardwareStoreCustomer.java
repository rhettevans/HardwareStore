//ICSI 201. Introduction to Computer Science
//Fall 2021
//Sourav Dutta
//Rhett Evans
//001529144

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HardwareStoreCustomer 
{
	//creates an ArrayList so the number of products is limitless
	static ArrayList<Product> products = new ArrayList<>();
	
	static String dateText; //stores the string date the user inputs
	static String user; //stores the users name
	static double total; //stores the total of the purchase
	
	public static void main(String[] args) throws IOException
	{
		int units; //stores the amount of units
		int choice; //stores the choice the user selected from the inventory
		boolean cont; //checks to see if the loop should be repeated
		String answer; //stores the answer of the user whether or not to continue
		
		//reads the file that the user inputs to create inventory
		FileReader file = new FileReader("./src/Inventory");
		Scanner input = new Scanner(file);
		
		//Reads the text file and loads each product into their respective type
		while(input.hasNext())
		{
			String line = input.nextLine();
			
			if(line.equals("TypeX")) 
			{
				Product px = new ProductX(input.nextLine(), 
						Double.parseDouble(input.nextLine()));
				
				products.add(px);
			}
			if(line.equals("TypeY")) 
			{
				Product py = new ProductY(input.nextLine(), 
						Double.parseDouble(input.nextLine()));
				
				products.add(py);
			}
			if(line.equals("TypeZ")) 
			{
				Product pz = new ProductZ(input.nextLine(), 
						Double.parseDouble(input.nextLine()));
				
				products.add(pz);
			}
		}
		
		Scanner keyboard = new Scanner(System.in);
		
		//uses a do-while loop to make sure the loop runs at least once
		do
		{
			System.out.println("Welcome to the Hardware Store!");
			System.out.println("User: ");
			user = keyboard.nextLine();
			System.out.println("The Inventory: ");
			System.out.println();
			
			//calls the printInventory function to display the inventory
			printInventory();
			
			System.out.println("Your choice: ");
			choice = keyboard.nextInt() - 1;
			System.out.println("Number of units: ");
			units = keyboard.nextInt();
			System.out.println("Date of purchase (mm/dd/yyyy): ");
			dateText = keyboard.next();
			Date date = new Date(dateText);
			
			total = products.get(choice).getPriceCalculated(units, date);
			Order order = new Order(products.get(choice), choice + 1, 
					user, dateText, units, total);
			
			//prints out the users receipt
			order.printReciept();
			
			//checks to see if the user wants to continue
			System.out.println();
			System.out.println("Continue Shopping? Y/N");
			answer = keyboard.next();
			if(answer.toUpperCase().equals("Y"))
			{
				cont = true;
			}
			else
			{
				cont = false;
			}
		} while(cont == true);
	}
	
	//creates the inventory window
	public static void printInventory()
	{
		//Creates a string for each of the products to display as the menu
		for(int i = 0; i < products.size(); i++)
		{
			System.out.println(i + 1 + ": " + products.get(i));
		}
	}
}
