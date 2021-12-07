public class ProductY extends Product 
{

	public ProductY(String name, double price) 
	{
		super(name, price);
	}
	
	@Override
	public double getPriceCalculated(int units, Date date) 
	{
		
		if(units >= 100 && units < 500) 
		{
			return (this.price * units * (5.0 / 6.0));
		}
		else if(units >= 500 && units < 1500) 
		{
			return (this.price * units * .75);
		}
		else if(units >= 1500) 
		{
			return (this.price * units * 0.5);
		}
		
		//Also display discounrd \/
		
		return this.price * units;
	}
	
	public void discount(int units)
	{
		if(units < 1500)
		{
			if(units >= 500)
			{
				System.out.println("Buy " + (1500 - units) 
						+ " more units for " + DollarsCents(this.price / 2.0)
						+ " per unit pricing");
			}
			else if(units < 500 && units >= 100)
			{
				System.out.println("Buy " + (500 - units) 
						+ " more units for " + DollarsCents(this.price * 2.0 / 3.0) 
						+ " per unit pricing");
			}
			else if(units < 100) 
			{
				System.out.println("Buy " + (100 - units) 
						+ " more units for " + DollarsCents(this.price * 5.0 / 6.0) 
						+ " per unit pricing");
			}

		}
	}
	
	//creates a toString method to display in the receipt
	public String toStringOrder()
	{
		return "    " + this.name + "     +$" + this.price  + " " + "+ Y  ";
	}
	
	//creates a toString method to display in the inventory
	@Override
	public String toString() 
	{
		return this.name + "         $" + this.price  + "            " + "Type Y";
	}
}
