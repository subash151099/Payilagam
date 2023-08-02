//Descending Order
package tutor_joes_java_course.Array;

import java.util.Arrays;

public class DeScending_Order {

	public static void main(String[] args) {
		int temp;
		int a[]= {6,4,5,2,9,1,3,7};
		System.out.println("Before Sorting : "+Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("After Sorting : "+Arrays.toString(a));

	}

}
