package assignmentProgram;

import java.util.Arrays;

public class RangeOfArray {
	public static int[] removeRange(int a[] , int startIndex , int endIndex)
	{
		if (startIndex>=0 && startIndex <= endIndex && endIndex < a.length) {
			int ans[] = new int[a.length - (endIndex-startIndex)];
			for (int i = 0; i < a.length;) {
				if (i<startIndex) {
					ans[i] = a[i];
					i++;
				}
				else if (i == startIndex) {
					i += (endIndex - startIndex);
				}
				else if (i>= endIndex) {
					ans[i-(endIndex-startIndex)] = a[i];
					i++;
				}
				
			}
			return ans;
		} else {
			return a;
		}
	}
	public static int[] retainRenge(int a[] , int start , int end )
	{
		if (start>=0 && end<a.length && start<=end) {
			int ans[] = new int[(end - start)+1];
			for (int i = start , j =0; i <=end; i++) {
				ans[j++] = a[i];
			}
			return ans;
		} else {
			return a;
		}
	}
	public static int[] removeRange(int a[] , int startIndex , int endIndex , boolean inc) {
		if (inc) {
			return removeRange(a , startIndex , endIndex+1);
		}
		return removeRange(a , startIndex , endIndex);

	}
//	public static int[] retainRenge(int a[] , int start , int end , boolean inc)
//	{
//		if (inc) {
//			return  retainRenge(a, start, end+1);
//		}
//		return  retainRenge(a, start, end);
//
//	}

	public static void main(String[] args) {
		int arr[] = {5,3,6,7,8,2,9,10,11,12};
		int startIndex = 2;
		int endIndex = 5;
		System.out.println("Given Array "+Arrays.toString(arr));
		int[] newArr = removeRange(arr , startIndex , endIndex , true);
		System.out.println("After Removing Specific Range Array "+Arrays.toString(newArr));
		int[] newArr2 = retainRenge(arr, startIndex, endIndex);
		System.out.println("After Retaining Specific Range "+Arrays.toString(newArr2));
	}
}
