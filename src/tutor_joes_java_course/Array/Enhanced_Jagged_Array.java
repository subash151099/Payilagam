//Enhanced Jagged Array
package tutor_joes_java_course.Array;

public class Enhanced_Jagged_Array {

	public static void main(String[] args) {
		int a[][]={{1,2,3,4},{1,2,3},{1,2,3,4}};
		for(int k[]:a) {
			for(int e:k) {
				System.out.print(" "+e);
			}
			System.out.println("");
		}

	}

}
