package Array_priyankaMam;

import java.util.Scanner;

public class E11_2DArray {

	public static void main(String[] args) {

//		int a[][] = { { 1, 2 }, { 2, 3 } };
		int a[][] = new int[2][2];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element: ");
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println();
		System.out.println("Using for loop");
		for (int i = 0; i < a.length; i++) { //0<2, 1<2, 2<2
			for (int j = 0; j < a.length; j++) { //0<2, 1<2, 2<2, 0<2, 1<2, 2<2
				System.out.print(a[i][j] + " = " + i + " " + j + " "); //a[0][0]=1, a[0][1]=2, a[1][0]=2, a[1][1]=3
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Using for foreach loop");
		for(int[] row: a) {
			for(int element: row) {
				System.out.print(element+" ");
			}
			System.out.println();
		}
	}
}
