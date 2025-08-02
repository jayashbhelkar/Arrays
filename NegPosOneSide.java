package arrayProgram;

import java.util.Arrays;

public class NegPosOneSide {
	public static int[] pushElement(int arr[])
	{
		int i = 0 , j = arr.length-1;
		while (i<j) {
			while (arr[i] < 0) {
				i++;
			}
			while (arr[j] > 0) {
				j--;
			}
			if (i<j) {
				arr[i] = arr[i]+arr[j];
				arr[j] = arr[i]-arr[j];
				arr[i] = arr[i]-arr[j];
				i++;
				j--;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int []arr = {3,-2,1,10,8,-3,-9,0};
		System.out.println(Arrays.toString(arr));
		pushElement(arr);
		System.out.println(Arrays.toString(arr));

	}
}
