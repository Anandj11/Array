package Array_priyankaMam;

public class E10_Program {

	public static void main(String[] args) {

		int a[] = {1,2,3,4};
		int count=0;

		for(int i=0 ;i<a.length; i++) {
			int cnt=0;
			for(int j=0; j<i; j++) {
				if(a[i]==a[j]) {
					cnt++;
				}
			}
			if(cnt==0) {
				count++;
			}
		}
		int b[] = new int[count];
		int index=0;

		for(int i=0 ;i<a.length; i++) {
			int cnt1=0;
			for(int j=0; j<i; j++) {
				if(a[i]==a[j]) {
					cnt1++;
				}
			}
			if(cnt1==0) {
				b[index]=a[i];
				index++;
			}
		}
		for(int num: b) {
			System.out.println(num);
		}
	}
}
