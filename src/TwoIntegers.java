
public class TwoIntegers
{
	private double int1;
	private double int2;
	public TwoIntegers()
	{
		int1 = 0;
		int2 = 0;
	}
	public TwoIntegers(double int1, double int2)
	{
		this.int1 = int1;
		this.int2 = int2;
	}
	public String toNumberSize()
	{
		String numberSize = "";
		int largeNumber = 0;
		int smallNumber = 0;
		if(int1 > int2)
		{
			System.out.println(int1 + " is the bigger number");
			System.out.println(int2 + " is the smaller number");
			int1 = largeNumber;
			int2 = smallNumber;
		}
		else if(int1 == int2)
		{
			System.out.println("The numbers are equal to each other");
		}
		else
		{
			System.out.println(int2 + " is the bigger number");
			System.out.println(int1 + " is the smaller number");
			int2 = largeNumber;
			int1 = smallNumber;
		}
		return numberSize;
	}
	public String toArithmetic()
	{
		String arithmetic = "";
		double sum = 0;
		sum = int1 + int2;
		double product = 0;
		product = int1 * int2;
		double difference = 0;
		difference = int1 - int2;			
		double quotient = 0;
		quotient = int1 /int2;
		arithmetic = "This is your sum = " + sum + "\n" + "This is your product = " + product + "\n" + "This is your difference = " + difference + "\n" + "This is your quotient = " + quotient;
		return arithmetic;
	}
	public double getInt1()
	{
		return int1;
	}
	public double getInt2()
	{
		return int2;
	}
	public void setInt1(int int1)
	{
		this.int1 = int1;
	}
	public void setInt2(int int2)
	{
		this.int2 = int2;
	}
}