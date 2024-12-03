package Array_priyankaMam;

public class E06_CountEvenOdd {

	public static void main(String[] args) {

		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int evenCount=0;
		int oddCount=0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
//				evenCount++;
				System.out.println("even count : "+a[i]);
			}
		}
//		System.out.println("even count :" +evenCount);
		
		System.out.println();
		
		for(int i=0; i<a.length; i++) {
			if(a[i]%2!=0) {
//				oddCount++;
				System.out.println("odd count : "+a[i]);
			}
		}
//		System.out.println("odd count : "+oddCount);
	}

}
