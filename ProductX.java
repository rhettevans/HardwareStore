//ICSI 201. Introduction to Computer Science
//Fall 2021
//Sourav Dutta
//Rhett Evans
//001529144

public class ProductX extends Product 
{
	
	public ProductX(String name, double price) 
	{
		super(name, price);
	}
	
	@Override
	public double getPriceCalculated(int units, Date date)
	{
		return this.price * units;
	}
	
	//creates a toString method to display in the receipt
	public String toStringOrder()
	{
		return "    " + this.name + "     +$" + this.price  + " " + "+ X  ";
	}
	
	//creates a toString method to display in the inventory
	@Override
	public String toString() 
	{
		return this.name + "               $" + this.price  + "           " + "Type X";
	}
}
