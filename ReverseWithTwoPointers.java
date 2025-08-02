package arrayProgram;

import java.util.Arrays;

public class ReverseWithTwoPointers {
	public static int[] reverse(int arr[])
	{
		int i = 0 , j = arr.length-1;
		int rev[] = new int[arr.length];
		while (i<=j) {
			rev[i] = arr[j];
			rev[j] = arr[i];
			i++;
			j--;
		}
		return rev;
	}
	public static void main(String[] args) {
		int arr[] = {10,9,8,7,6,5,4,3,2,1};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(reverse(arr)));
	}
}
