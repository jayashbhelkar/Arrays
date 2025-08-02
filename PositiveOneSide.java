package assignmentProgram;

import java.util.Arrays;

//we Have Array with positive and Negative Element , we have to push all negative element one side and all positive element one side 
public class PositiveOneSide {
	public static int[] pushElement(int arr[])
	{
		int ans[] = new int[arr.length];
		int negative = 0;
		int positive = arr.length-1;
		for (int i = 0; i < ans.length; i++) {
			if (arr[i]<0) {
				ans[negative++] = arr[i];
			}
			else {
				ans[positive--] = arr[i];
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int arr[] = {3,5,-1,4,-3,2,-2,-4,1};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(pushElement(arr)));
	}
}
