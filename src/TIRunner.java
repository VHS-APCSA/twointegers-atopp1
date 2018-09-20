import java.util.Scanner;
public class TIRunner 
{
	public static void main (String []args)
	{
		Scanner input = new Scanner (System.in);
		System.out.println("Enter first integer");
		int num1 = input.nextInt();
		System.out.println("Enter second integer");
		int num2 = input.nextInt();
		System.out.println("The integers are");
		TwoIntegers twoIntegers = new TwoIntegers(num1, num2);
		String arithmetic = twoIntegers.arithmetic();
		System.out.println(arithmetic);
		int larger = twoIntegers.larger();
		boolean isEven = twoIntegers.isEven();
		boolean isMultiple = twoIntegers.isMultiple();
		System.out.println(larger + " is the larger number.");
		System.out.println("The sum is even = " + isEven );
		System.out.println("The second integer is a multiple of the first = " + isMultiple);
}
}