//1.Five different ways of Swapping two Numbers
package FrequentlyAskedInterviewPrograms;

public class Swapping2Nums {

	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("Before Swapping : "+a+" "+b);
		
//		Logic-1   Using third variable
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("Logic-1 After Swapping : "+a+" "+b);
		
//		Logic-2   Using + & - Operators without third variable 
		int c=10,d=20;
		c=c+d;  //10+20=30
		d=c-d;  //30-20=10
		c=c-d;  //30-10=20
		System.out.println("Logic-2 After Swapping : "+c+" "+d);
		
//		Logic-3  Using * & / -Operators - e and f values should not be zero
		int e=10,f=20;
		e=e*f;  //10*20=200
		f=e/f;  //200/20=10
		e=e/f;  //200/10=20
		System.out.println("Logic-3 After Swapping : "+e+" "+f);
		
//		Logic-4  Using Bitwise operator XOR (^)
		int g=10,h=20;//g=1010   h=10100
		g=g^h;
		h=g^h;
		g=g^h;
		System.out.println("Logic-4 After Swapping : "+g+" "+h);
		
//		Logic-5  Single statement
		int i=10,j=20;
		j=i+j-(i=j);
		//j=10+20-(i=20);
		//j=30-20 =10;
		//i=20, j=10
		System.out.println("Logic-5 After Swapping : "+i+" "+j);
		
	}

}
