
public class TwoIntegers 
{
	public int num1;
	public int num2;
	
	public TwoIntegers()
	{
		num1 = 0;
		num2 = 0;
	}
	public TwoIntegers(int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	public int getNum1()
	{
		return num1;
	}
	public void setNum1(int num1)
	{
		this.num1 = num1;
	}	
	public int getNum2()
	{
		return num2;
	}
	public void setNum2(int num2)
	{
		this.num2 = num2;
	}
	public String arithmetic()
	{
		int sum = num1 + num2;
		int dif = num1 - num2;
		int prod = num1 * num2;
		double quot = (double)num1 / num2;
		int mod = num1 % num2;
		
		return (num1 + " + " + num2 + " = " + sum + ", " +
				num1 + " - " + num2 + " = " + dif + ", " +
				num1 + " * " + num2 + " = " + prod + ", " +
				num1 + " / " + num2 + " = " + quot + ", " +
				num1 + " % " + num2 + " = " + mod);
	}
	public int larger()
	{
		if (num1 >= num2)
		{
			return num1;
		}
		else
		{
			return num2;
		}
	}
	public boolean isEven()
	{
		if((num1 + num2) % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}	
	}
	public boolean isMultiple()
		{
		if ((num2 % num1) == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}