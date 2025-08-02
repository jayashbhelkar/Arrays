package interviewQ;

public class KingElement {
	public static void main(String[] args) {
		int[] a = {16,17,4,3,5,2};
		
		for (int i = 0; i < a.length-1; i++) {
			int j;
			for (j = i+1; j < a.length; j++) {
				if (a[i]<a[j]) {
					break;
				}
			}
			if (j==a.length) {
				System.out.print(a[i]+" ");
			}
		}
	}
}
