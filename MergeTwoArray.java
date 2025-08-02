package arrayProgram;
import java.util.Arrays;
//We Have Two Arrays And we have to Save It TO Third Array
public class MergeTwoArray {
	public static int[] mergeArray(int[]ar1 , int[]ar2)
	{
		int ans[] = new int[(ar1.length+ar2.length)];
		int mem = 0;
		for (int i = 0; i < ar1.length; i++ , mem++) {
			ans[mem] = ar1[i];
		}
		for (int i = 0; i < ar2.length; i++ , mem++) {
			ans[mem] = ar2[i];
		}
		return ans;
	}
	public static int[] mergeAr(int[]ar1 , int[]ar2) {
		int ans[] = new int[(ar1.length+ar2.length)];
		for (int i = 0; i < ans.length; i++) {
			if (i < ar1.length) {
				ans[i] = ar1[i];
			}
			else {
				ans[i] = ar2[i-ar1.length];
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		
		int[] ar1 = {10,20,30,40,50,60};
		int[] ar2 = {70,80,90,100};
		
		int[] merge = mergeArray(ar1, ar2);
		System.out.println("Array1 "+Arrays.toString(ar1));
		System.out.println("Array2 "+Arrays.toString(ar2));
		System.out.println("By Method One Marge Array "+Arrays.toString(merge));
		System.out.println("By Method Two Marge Array "+Arrays.toString(mergeAr(ar1, ar2)));

	}
}
