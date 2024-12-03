package Array_priyankaMam;

public class E15_uniquePair {

	public static void main(String[] args) {

        int a[] = {1,2,1};
        int count1=0;
        
        for(int i=0; i<a.length; i++) {
        	int count=0;
        	for(int j=0; j<i; j++) {
        		if(a[i]==a[j]) {
        			count++;
        		}
        	}
        	if(count==0) {
        		System.out.print(a[i]+" ");
        		count1++;
        	}
        }
        
        System.out.println("\n");
        
        int b[] = new int[count1];
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
		
		System.out.println("b Array");
		for(int num: b) {
			System.out.print(num+" ");
		}
		
		System.out.println("\n");
		
		for(int  i=0; i<b.length; i++) {
			for(int j=0; j<b.length; j++) {
				System.out.println(b[i]+" "+b[j]);
			}
		}
	}
}