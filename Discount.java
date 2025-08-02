package interviewQ;

public class Discount {
	public static void main(String[] args) {
		int n = 7;
		int[] a = {9,-13,8,-7,-9,18,10};
		int amt = 18;
		noOfProduct(n, a, amt);
	}
	public static void noOfProduct(int n , int[] a , int amt)
	{
		int ct = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]>0 && amt%a[i]==0 || a[i]<0 && amt%(-a[i])==0) {
				ct++;
			}
		}
		System.out.println(ct);
	}
}
