package interviewQ;

public class LongSubSeq {
	public static void main(String[] args) {
		int[] a = {1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2};
		int max = 0 ;
		int num = a[0];
		int ct = 0;
		for (int i = 0; i < a.length-1; i++) {
			if (a[i]==a[i+1]) {
				ct++;
			}
			else {
				if (ct>max) {
					max = ct;
					num = a[i];
				}
				ct = 0;
			}
		}
		if (ct>max) {
			max = ct;
			num = a[a.length-1];
		}
		System.out.println(max>0?(num+" Is Repeated "+(max+1)+" Times "):"No Element Is Repeated!");
	}
}
