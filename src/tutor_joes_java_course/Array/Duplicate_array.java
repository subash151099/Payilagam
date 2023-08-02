//Duplicate array
package tutor_joes_java_course.Array;

public class Duplicate_array {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,2,3,5,6,5,7,8,9,10,10,10};
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length-1;j++) {
				if((a[i]==a[j])&&(i!=j)) {
					System.out.println("Duplicate element : "+a[j]);
				}
			}
		}

	}

}
