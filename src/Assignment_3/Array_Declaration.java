//1) Array Declaration
package Assignment_3;

public class Array_Declaration {

	public static void main(String[] args) {
		//Array Declaration
		int a[];
		int[] b;
		
		//Array Initialization
		int[] c=new int[] {1,2,3,4,5};
		int[] intArray = new int[10];
		intArray[0] = 22;
		
		for(int i=0;i<intArray.length;i++) {
			System.out.print(intArray[i]+" ");
		}
	}

}
