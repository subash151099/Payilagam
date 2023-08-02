//22 Fionacci Series using two variables
package Assignment_2;

public class Fionacci_Series_using_two_variables {

	public static void main(String[] args) {
		fib(15);
		}
	
	static void fib(int n)
	{
		int a = 0, b = 1;
		if (n >= 0)
			System.out.print(a + " ");
		if (n >= 1)
			System.out.print(b + " ");
		for (int i = 2; i <= n; i++)
		{
			System.out.print(a + b + " ");
			b = a + b;
			a = b - a;
		}
	}

}
