//Count Odd Even Numbers
package tutor_joes_java_course.Array;

public class Count_Odd_Even_Numbers {

	public static void main(String[] args) {
		int a[]= {4,5,3,7,32,56,34,78,32,98,56,90};
		int odd=0,even=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("Total Odd numbers : "+odd);
		System.out.println("Total Even numbers : "+even);

	}

}
