package arrayProgram;

import java.util.Arrays;

public class ThirdMinimum {
	public static int findThirdMin(int arr[])
	{
		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		int thirdMin = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (min>arr[i]) {
				thirdMin = secondMin;
				secondMin = min;
				min = arr[i];
			}
			else if (secondMin>arr[i] && arr[i] != min) {
				thirdMin = secondMin;
				secondMin = arr[i];
			}
			else if (thirdMin>arr[i] && arr[i] != secondMin && arr[i] != min) {
				thirdMin = arr[i];
			}
		}
		System.out.println("Minimum "+min);
		System.out.println("Second Minimum "+secondMin);
		return thirdMin;
	}
	public static void main(String[] args) {
		int arr[] = {-12,-4,-1,0,1,3,8,4,8};
		System.out.println("Given Arrays Is "+Arrays.toString(arr));
		System.out.println("Third Minimum Element Is "+findThirdMin(arr));
	}
}
