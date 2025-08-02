package assignmentProgram;

import java.util.Arrays;

//Find The Missing Element Of Given Array....
public class MissingElement {
	public static int findMissingElement(int[] arr)
	{
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		int naturalSum = max*(max+1)/2;
		int missValue = naturalSum - sum;
		return missValue;
	}
	public static void main(String[]args)
	{
		int arr[] = {1,2,3,5,6,7};
		System.out.println("Given Array "+Arrays.toString(arr));
		//int arr2[] = {40,36,32,28,24,20,12,8,4};
		System.out.println("Missing Element Of Given Array "+findMissingElement(arr));
		//System.out.println("Missing Element Of Given Array "+findMissingElement(arr2));

	}
}
