package Array_priyankaMam;

public class E13_2DSum {

	public static void main(String[] args) {

		int a[][] = { { 1, 2 }, { 3, 4 } };
		int b[][] = { { 1, 2 }, { 3, 4 } };

//		int c[][] = new int[a.length][b.length];
		int c;

		if (a.length == b.length) {
			for (int i = 0; i < b.length; i++) {
				for (int j = 0; j < a.length; j++) {
//					c[i][j] = a[i][j] + b[i][j];
					c = a[i][j] * b[i][j];
//					System.out.print(c[i][j] + " ");
					System.out.print(c+" ");  // c variable data can print but not accesed 
				}
				System.out.println();
			}
		} else {
			System.out.println("not equal");
		}

	}

}
