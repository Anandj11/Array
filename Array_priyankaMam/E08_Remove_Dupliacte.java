package Array_priyankaMam;

public class E08_Remove_Dupliacte {

	public static void main(String[] args) {

		// print last value
		int a[] = {1, 2, 3, 1};
		
		for(int i=0; i<a.length; i++) {  // 0<4,1<4,2<4,3<4
			int count=0;   
			for(int j= i+1; j<a.length; j++) { // 1<4,2<4,3<4: 2<4,3<4: 3<4,4<4
				if(a[i] == a[j]) {   // 1==2,1==3,1==1: 2==3,2==1: 3==1
					count++; //1,0,0
				}
			}
			
			if(count==0) { //1==0,0==0,0==0
				System.out.println(a[i]);//2,3,1
			}
		}
		
		System.out.println();
		
		// print first value
		int a1[] = {1,2,3,3};
		
		for(int i=0; i<a1.length; i++) {  // 0<4,1<4,2<4,3<4
			int cnt=0;
			for(int j=0; j<i; j++) {  // 0<0,0<1,1<1,0<2,1<2,2<2,0<3,1<3
				if(a1[i]==a1[j]) {    // 1==1,2==0,2==1
					cnt++; //1
				}
			}
			if(cnt==0) {  // 0==0,0==0,0==0
				System.out.println(a1[i]); //1,2,3
			}
		}
	}
}