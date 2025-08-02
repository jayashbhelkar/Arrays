package assignmentProgram;

import java.util.Arrays;

//We Have 2 Arrays , We Reverse 1st Array And Merge It With Second Array
public class SecondMergeArrayCombination {
	public static int[] mergeArray(int[]ar1 , int[]ar2)
	{
		int[] ans = new int[ar1.length+ar2.length];
		for (int i = 0 ; i < ans.length; i++) {
			if (i < ar1.length) {
				ans[i] = ar1[ar1.length-1-i];
			} else {
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
		System.out.println("2st Cobination Of Marge Array "+Arrays.toString(merge));
	}
}
