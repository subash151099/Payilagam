//9 printing 1 4 27 256
package Assignments;

public class printing_1_4_27_256 {

	public static void main(String[] args) {
		int i,j,c;
		 System.out.println("Series is : ");
		 for (i=1;i<=4;i++)  //1 2  3
		 {
		  c=1;				// 1  1
		  for (j=1;j<=i;j++)  //1  2   
		  {
		   c=c*i;				//c=1*1  1
		  }
		  System.out.println(c); // 1
		 }
	}

}
