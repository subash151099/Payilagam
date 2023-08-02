//29 Decimal to Binary
package Assignment_2;

class Decimal_to_Binary
{
		static void decToBinary(int n)
	{
				int[] binaryNum = new int[1000];

				int i = 0;
		while (n > 0)
		{
		
			binaryNum[i] = n % 2;
			n = n / 2;
			i++;
		}


		for (int j = i - 1; j >= 0; j--)
			System.out.print(binaryNum[j]);
	}
	

	public static void main (String[] args)
	{
		int n = 32;
		System.out.println("Decimal - " + n);
		System.out.print("Binary - ");
		decToBinary(n);
	}
}


