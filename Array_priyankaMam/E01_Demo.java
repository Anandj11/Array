package Array_priyankaMam;

import java.util.Scanner;

public class E01_Demo {

	public static void main(String[] args) {

		//* Array is a fixed size sequential collection of similar data type which
		//   stores contigeous memory location, According to its index number.
		//* Store primitive data type such as int, float, double, char.
		//* each data element can be randomly accessed by using in index number.
		//* Advantages: code optimization, Ease of reversing, Ease of sorting, Random access.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size: ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter element:");
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Array element");
		
		for(int num: a){
			System.out.println(num);
		}
		sc.close();
	}

}