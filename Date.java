//ICSI 201. Introduction to Computer Science
//Fall 2021
//Sourav Dutta
//Rhett Evans
//001529144

public class Date 
{
	private int month; //stores the month of the purchase
	private int day; //stores the day of the purchase
	private int year; //stores the year of the purchase
	
	public Date(String date)
	{
		//creates an array that breaks the date into variables
		String[] parts = date.split("/"); 
		int tempMonth = Integer.parseInt( parts[0]); //stores the first section into month
		int tempDay = Integer.parseInt( parts[1]); //second section into day
		int tempYear = Integer.parseInt( parts[2]); //third into year
		
		//determines if the date can continue if valid
		if(validateDate(tempMonth, tempDay, tempYear)) 
		{
			this.month = tempMonth;
			this.day = tempDay;
			this.year = tempYear;
		}
		else
		{
			System.out.println("The date entered is invalid");
		}
	}
	
	//checks to see if the date is valid
	public boolean validateDate(int month, int day, int year)
	{
		int dayCount = 0;
		
		switch(month)
		{
		case 1: case 3: case 5: case 6: case 8: case 10: case 12: 
			dayCount = 31;
			break;
		case 4: case 7: case 9: case 11:
			dayCount = 30;
			break;
		case 2: 
			//This is used to calculate if the year is a leap year
			//to determine if February should have 28 or 29 days
			if(year % 4 == 0)
			{
				dayCount = 29;
			}
			else
			{
				dayCount = 28;
			}
			break;
		}
			
		//Used to determine if the date is valid in the month/year input
		if(day > dayCount || day < 0)
		{	
			return false;
		}
		else
		{
			return true;
		}
	}
	
	
	
	/**
	 * @return the month
	 */
	public int getMonth() 
	{
		return month;
	}

	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) 
	{
		this.month = month;
	}

	/**
	 * @return the day
	 */
	public int getDay() 
	{
		return day;
	}

	/**
	 * @param day the day to set
	 */
	public void setDay(int day) 
	{
		this.day = day;
	}

	/**
	 * @return the year
	 */
	public int getYear() 
	{
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) 
	{
		this.year = year;
	}
}
