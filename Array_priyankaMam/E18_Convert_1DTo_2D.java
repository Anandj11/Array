package Array_priyankaMam;

import java.util.Scanner;

public class E18_Convert_1DTo_2D {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int n = sc.nextInt();
		
		System.out.println("enter ele");
		int a[] = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Array Element :");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("enter no row 2d");
		int row = sc.nextInt();
		System.out.println("enter no col 2d");
		int col = sc.nextInt();
		
		int b[][] = new int[row][col];
		int index=0;
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				b[i][j]=a[index];
				index++;
			}
		}

		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
}
