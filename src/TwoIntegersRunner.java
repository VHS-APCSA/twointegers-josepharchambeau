import java.util.Scanner;
public class TwoIntegersRunner
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("This will add the first and second number together");
		System.out.println("Plug in first number");
		double int1 = input.nextInt();
		System.out.println("Plug in second number");
		double int2 = input.nextInt();
		TwoIntegers twoIntegers = new TwoIntegers(int1, int2);
		String arithmetic = twoIntegers.toArithmetic();
		System.out.println(arithmetic);
		String numberSize = twoIntegers.toNumberSize();
		System.out.println(numberSize);
		boolean trueFalse = twoIntegers.toTrueFalse();
		System.out.println(trueFalse);
		boolean multiples = twoIntegers.toMultiples();
		System.out.println(multiples);
		
	}
}
