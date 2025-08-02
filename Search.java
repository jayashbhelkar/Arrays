package arrayProgram;

import java.util.Arrays;

public class Search {
	public static int binarySearch(int a[] , int element)
	{
		BubbleSort.bubbleSort(a);
		int start = 0 , end = a.length-1 , mid = (start+end)/2;
		while (start<=end) {
			if (element == a[mid]) {
				return mid;
			}
			else if (element > a[mid]) {
				start = mid+1;
			}
			else if (element < a[mid]) {
				end = mid - 1;
			}
			mid = (start+end)/2;
		}
		return -1;
	}
	public static void main(String[] args) {
		int a[] = {100,34,24,78,3,657,23,676,43,22,565,7};
		System.out.println(Arrays.toString(a));
		int ele = 24;
		int index = binarySearch(a, ele);
		BubbleSort.bubbleSort(a);
		System.out.println(Arrays.toString(a));

		if (index >= 0) {
			System.out.println("Element "+ele+" Is Present In Index "+index);
		} else {
			System.err.println("Element"+ele+" Is Present In Array");
		}
	}
}
