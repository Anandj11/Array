package Array_priyankaMam;

public class E14_Transpose {

	public static void main(String[] args) {

		// Transpose array
		// 1 3
		// 2 4
		
		int a[][] = {{1,2},
				     {3,4}};
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				System.out.print(a[j][i]+ " ");
			}
			System.out.println();
		}
	}
}