//21.Fibonaci
package Assignments;

public class Fibonaci {

	public static void main(String[] args) {
		int limit=8;
		int a=-1,b=1,c;
		for (int i=1;i<=limit;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}

	}

}
