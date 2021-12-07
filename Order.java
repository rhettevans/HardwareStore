//ICSI 201. Introduction to Computer Science
//Fall 2021
//Sourav Dutta
//Rhett Evans
//001529144

public class Order 
{
	private Product boughtProduct; //displays the string of the item that the uer bought
	private int choice; //stores the choice that the user selected
	private String user; //stores the users name
	private String dateText; //stores the date the user input as a string
	private int units; //stores the amount of units the user wishes to buy
	private double total; //stores the total of the purchase
	
	//creates a method to formulate an order from the users inputs
	public Order(Product product, int choice, String user, 
			String dateText, int units, double total)
	{
		boughtProduct = product;
		this.choice = choice;
		this.user = user;
		this.dateText = dateText;
		this.units = units;
		this.total = total;
	}
	
	//creates the receipt that is printed with the user purchase
	public void printReciept()
	{
		System.out.println("*********************************");
		System.out.println("Date " + dateText);
		System.out.println("*********************************");
		System.out.println(user);
		System.out.println("Your Order:");
		System.out.println("+----+--------------+------+----+");
		System.out.println("| ID |     Name     |Price |Type|");
		System.out.println("+----+--------------+------+----+");
		System.out.println("+ " + choice + " +  " + boughtProduct.toStringOrder() + "+");
		System.out.println("+----+--------------+------+----+");
		System.out.println("In the amount of " + units + " units");
		
		//used to check if the selection is of product type Y
		if(boughtProduct instanceof ProductY) 
		{
			((ProductY)boughtProduct).discount(units);
		
		}
		System.out.println("*********************************");
		System.out.println("Your total: " + total);
		
	}
}
