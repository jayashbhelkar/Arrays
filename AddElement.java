package arrayProgram;

import java.util.Arrays;

public class AddElement {
	public static int[] add(int[] arr , int element , int index)
	{
		int ans[] = new int[arr.length+1];
		if (index>=0 && index<=arr.length) {
			for (int i = 0; i < ans.length; i++) {
				if (index > i) {
					ans[i] = arr[i];
				}
				else if (i==index ) {
					ans[i] = element;
				}
				else if (i>index) {
					ans[i] = arr[i-1];
				}
			}
			return ans;
		} else {
			return arr;
		}	
	}
	public static void main(String[] args) {
		int arr[] = {5,3,6,7,8,2};
		int element = 4;
		int index = 3;
		System.out.println("Given Array "+Arrays.toString(arr));
		int[] newArr = add(arr , element , index);
		System.out.println("New Array "+Arrays.toString(newArr));
	}
}
