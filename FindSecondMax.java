package arrayProgram;

import java.util.Arrays;

public class FindSecondMax {
	public static int secondMax(int arr[])
	{
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				secondMax = max ;
				max = arr[i];
			}
			else if (arr[i]>secondMax && arr[i] != max) {
				secondMax = arr[i];
			}
		}
		return secondMax;
	}
	public static void main(String[] args) {
		int arr[] = {-12,-4,-1,0,1,3,8,4,8};
		System.out.println("Given Arrays Is "+Arrays.toString(arr));
		System.out.println("Third Max Element Is "+secondMax(arr));
	}
}
