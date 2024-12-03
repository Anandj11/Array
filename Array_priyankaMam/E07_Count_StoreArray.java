package Array_priyankaMam;

public class E07_Count_StoreArray {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5,6,7,8,9,10};
		
		int evenCount=0;
		int oddCount=0;
		for(int i=0; i<a.length; i++) {   
			if(a[i]%2==0) {               
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		
		int even[] = new int[evenCount];
		int index=0;
		int odd[] = new int[oddCount];
		int index1=0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				even[index]=a[i];
				index++;
			}
			else {
				odd[index1]=a[i];
				index1++;
			}
		}
		System.out.println(evenCount + " " + oddCount);
		
		System.out.println("Even: ");
		for(int i=0; i<even.length; i++) {
			System.out.println(even[i] + " " + i);
		}
		
		
		System.out.println("Odd: ");
		for(int i=0; i<odd.length; i++) {
			System.out.println(odd[i] + " " + i);
		}
	}
}