package assignmentProgram;

import java.util.Arrays;

//We Have 2 Arrays , we merge array like 2nd arrays at starting
public class FourthMergeArrayCombination {
	public static int[] mergeArray(int[]ar1 , int[]ar2)
	{
		int ans[] = new int[ar1.length+ar2.length];
		for (int i = 0; i < ans.length; i++) {
			if (i < ar2.length) {
				ans[i] = ar2[i];
			}
			else {
				ans[i] = ar1[i-ar2.length];
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
		System.out.println("4th Cobination Of Marge Array "+Arrays.toString(merge));
	}
}
