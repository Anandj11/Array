package Array_priyankaMam;

public class E09_Program {

	public static void main(String[] args) {

		// find triplet whose sum 
		int a[] = { 1, 2, 3, 4 };

		for (int i = 0; i<a.length; i++) {
			for (int j = i+1; j<a.length; j++) {
				for (int k = j+1; k<a.length; k++) {
					int sum = a[i] + a[j] + a[k];
					if (sum <= 7) {
						System.out.println(a[i] + " " + a[j] + " " + a[k] + " = "+sum);// 123,123,134,234
					}
				}
			}
		}
	}
}