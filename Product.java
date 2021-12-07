//ICSI 201. Introduction to Computer Science
//Fall 2021
//Sourav Dutta
//Rhett Evans
//001529144

public class Product 
{
	protected String name; //Stores the name of the product
	protected double price; //Stores the price of the product
	
	public Product(String name, double price) 
	{
		this.name = name;
		this.price = price;
	}
	
	public double getPriceCalculated(int units, Date date)
	{
		return this.price * units;
	}

	/**
	 * @return the name
	 */
	public String getName() 
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) 
	{
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public double getPrice() 
	{
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) 
	{
		this.price = price;
	}
	
	public static String DollarsCents(double price)
	{
	    int priceDollars = (int)price;
	    long priceCents = Math.round((price-priceDollars)*100);
	    return "" + priceDollars + " dollars " + priceCents + " cents"; 
	}
	
	//creates a toString method to display in the receipt
	public String toStringOrder()
	{
		return "    " + this.name + "     +$" + this.price  + " " + "+ X  ";
	}
	
	//Creates a string for the name, price, and product type of the product
	public String toString() 
	{
		return this.name + "               $" + this.price  + "           " + "Type X";
	}
}
