package arrayProgram;

import java.util.Arrays;

public class RemoveElement {
	public static int[] removeEl(int arr[] , int element)
	{
		int i ;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				break;
			}
		}
		if (i<arr.length) {
			int ans[] = new int[arr.length-1];
			for (int j = 0; j < arr.length; j++) {
				if (j<i) {
					ans[j] = arr[j];
				}
				else if (j>i) {
					ans[j-1] = arr[j];
				}
			}
			return ans;
		} else {
			return arr;
		}
	}
	public static void main(String[] args) {
		int arr[] = {5,3,6,7,8,2};
		int element = 7;
		System.out.println("Given Array "+Arrays.toString(arr));
		int[] newArr = removeEl(arr , element);
		System.out.println("New Array "+Arrays.toString(newArr));
	}
}
