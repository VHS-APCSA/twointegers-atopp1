import java.util.scanner
public class TIRunner 
{
	public static void main (String []args)
	{
		Scanner input = new Scanner (System.in);
		System.out.print("Enter first integer");
		int input1 = input.nextInt();
		System.out.print("Enter second integer");
		int input2 = input.nextInt();
		System.out.println("The integers are");
		
		TwoIntegers twoIntegers = new TwoIntegers(7, 8);
String arithmetic = twoIntegers.arithmetic();
System.out.println(arithmetic);
}
}