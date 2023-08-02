//Insert Element
package tutor_joes_java_course.Array;
import java.util.*;
public class Insert_Element {

	public static void main(String[] args) {
		int a[]= {1,2,3,5,6,7,8,9,10};
		System.out.println("Before Insertion : "+Arrays.toString(a));
		int val=4;
		int index=3;
		
		for(int i=a.length-1;i>index;i--) {
			a[i]=a[i-1];
		}
		a[index]=val;
		System.out.println("After Insertion : "+Arrays.toString(a));


	}

}
