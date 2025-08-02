package assignmentProgram;

import java.util.Arrays;

public class AddArray {
	public static int[] addArray(int a[] , int b[] , int index)
	{
		if (index >= 0 && index <= a.length) {
			int ans[] = new int[a.length+b.length];
			for (int i = 0; i < ans.length; i++) {
				if (i<index) {
					ans[i] = a[i];
				}
				else if (i>=index && i < index + b.length) {
					ans[i] = b[i-index];
				}
				else {
					ans[i] = a[i-b.length];
				}
			}
			return ans;
		} else {
			return a;
		}
	}
	public static void main(String[] args) {
		int arr[] = {5,3,6,7,8,2};
		int arr2[]= {1,3,9,10};
		int index = 3;
		System.out.println("Given Array 1 "+Arrays.toString(arr));
		System.out.println("Given Array 2 "+Arrays.toString(arr2));

		int[] newArr = addArray(arr , arr2 , index);
		System.out.println("New Array "+Arrays.toString(newArr));
	}
}
