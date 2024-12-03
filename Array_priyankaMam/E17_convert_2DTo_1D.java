package Array_priyankaMam;

public class E17_convert_2DTo_1D {

	public static void main(String[] args) {

		int a[][] = { { 1, 2 }, { 3, 4 } };

		int b[] = new int[a.length * a.length];
		int index = 0;

		for (int i = 0; i < a.length; i++) { // 0<2,1<2,2<2
			for (int j = 0; j < a.length; j++) { // 0<2,1<2,2<2
				b[index++] = a[i][j]; //b[0]=a[0][0]=1,b[0]=a[0][1]=2,
				                      //b[0]=a[1][0]=3,b[0]=a[1][1]=4,
			}

		}
		for (int i= 0; i < b.length; i++) { 
			System.out.println(b[i]);  // 1 2 3 4
		}
	}
}