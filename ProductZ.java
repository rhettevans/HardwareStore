public class ProductZ extends Product 
{
	
	public ProductZ(String name, double price) 
	{
		super(name, price);
	}
	
	@Override
	public double getPriceCalculated(int units, Date date)
	{
		if((date.getMonth() == 9 && date.getDay() >= 15) || (date.getMonth() == 10 && date.getDay() <= 15)) 
		{
			return (this.price * units) - ((units / 3) * this.price);
		}
		
		return this.price * units;
	}
	
	//creates a toString method to display in the receipt
	public String toStringOrder()
	{
		return "    " + this.name + "     +$" + this.price  + " " + "+ Z  ";
	}
	
	//creates a toString method to display in the inventory
	@Override
	public String toString() 
	{
		return this.name + "                $" + this.price  + "            " + "Type Z";
	}
}
