//21 Fibonacci Series
package Assignment_2;

public class Fibonacci_Series {

	public static void main(String[] args) {
		int a=-1,b=1,c;
		int i=1,range=10;
		while(i<=range) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			i++;
		}

	}

}
