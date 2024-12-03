package Array_priyankaMam;

public class E04_maxArray {

	public static void main(String[] args) {

//		int arr[] = { 1, 2, 3, 4, 5 };
//
//		int max = 0;
//		for (int i = 0; i < arr.length; i++) { // 0<5, 1<5, 2<5, 3<5, 4>5, 5>5
//			if (arr[i] > max) {  // 1>0, 2>1, 3>2, 4>3, 5>4
//				max = arr[i];    // 1, 2, 3, 4, 5
//			}
//		}
//
//		System.out.println("max value : "+max);
		
		
		int a[] = {1,2,0,4,5};
		
		int max=a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Max value : "+max);
	}
}