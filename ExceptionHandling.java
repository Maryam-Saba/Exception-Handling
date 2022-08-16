public class ExceptionHandling
{
	void divisionbyzero(int a, int b)
	{
		if(b==0)
		{
			throw new ArithmeticException("Cannot dividened by zero");
		}
		else
		{
			System.out.println(a/b);
		}
	}
public static void main(String args[])
	{
		ExceptionHandling obj= new ExceptionHandling();
		obj.divisionbyzero(10,0);
	}
}