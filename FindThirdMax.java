package arrayProgram;

import java.util.Arrays;

public class FindThirdMax {
	public static int thirdMax(int arr[])
	{
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		int thirdMax = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				thirdMax = secondMax;
				secondMax = max;
				max = arr[i];
			}
			else if (secondMax < arr[i] && arr[i] != max) {
				thirdMax = secondMax;
				secondMax = arr[i];
			}
			else if (thirdMax < arr[i] && arr[i] != secondMax && arr[i] != max) {
				thirdMax = arr[i];
			}
		}
		return thirdMax;
	}
	public static void main(String[] args) {
		int arr[] = {-12,-4,-1,0,1,3,8,4,8};
		System.out.println("Given Arrays Is "+Arrays.toString(arr));
		System.out.println("Third Max Element Is "+thirdMax(arr));
	}
}
