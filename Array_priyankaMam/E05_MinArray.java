package Array_priyankaMam;

public class E05_MinArray {

	public static void main(String[] args) {

		int a[] = {1,2,0,4,5};
		
		int min = a[0];
//		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<a.length; i++) {
			if(a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Min value : "+min);
	}
}