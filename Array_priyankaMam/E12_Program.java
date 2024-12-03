package Array_priyankaMam;

import java.util.Scanner;

public class E12_Program {

	public static void main(String[] args) {

		int a[][] = new int[4][7];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element: ");
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<7; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println();
		System.out.println("Using for loop");
		for (int i = 0; i <4; i++) { //0<2, 1<2, 2<2
			for (int j = 0; j <7; j++) { //0<2, 1<2, 2<2, 0<2, 1<2, 2<2
				System.out.print(a[i][j] + " "); //a[0][0]=1, a[0][1]=2, a[1][0]=2, a[1][1]=3
			}
			System.out.println();
		}
	}

}
