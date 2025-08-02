package assignmentProgram;

import java.util.Arrays;

//We Have Two Arrays , We Reverse The Second Array And Merge it With 1st One to form 3rd 
public class FirstMergeArrayCombination {
	public static int[] mergeArray(int[] ar1 , int[] ar2)
	{
		int ans[] = new int[ar1.length+ar2.length];
		for (int i = 0; i < ans.length; i++) {
			if (i < ar1.length) {
				ans[i] = ar1[i];
			} else {
				ans[i] = ar2[ans.length-1-i];
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
		System.out.println("1st Cobination Of Marge Array "+Arrays.toString(merge));
	}
}
