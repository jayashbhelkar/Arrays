package arrayProgram;

import java.util.Arrays;

public class MergeSort {
	public static void mergeSort(int a[] , int start , int end) {
		if (start<end) {
			int mid = (start+end)/2;
			mergeSort(a, start, mid);
			mergeSort(a, mid+1, end);
			mergeSameArray(a, start, mid, end);
		}
	}
	public static void mergeSameArray(int a[] , int start , int mid , int end)
	{
		int ans[] = new int[a.length];
		int i = start;
		int j = mid+1;
		int k = start;
		while (i<=mid && j<=end) {
			if (a[i] <= a[j]) {
				ans[k++] = a[i++];
			}
			else if (a[i] > a[j]) {
				ans[k++] = a[j++];
			}
		}
		while (i<=mid) {
			ans[k++] = a[i++];
		}
		while (j<=end) {
			ans[k++] = a[j++];
		}
		for (int k2 = start; k2 <= end; k2++) {
			a[k2] = ans[k2];
		}
	}
	public static int[] twoPointerMerge(int a[] , int b[])
	{
		int ans[] = new int[a.length+b.length];
		int i = 0 , j = 0 , k = 0;
		while (i < a.length && j < b.length) {
			if (a[i]<=b[j]) {
				ans[k++] = a[i++];
			}
			else if (a[i]>b[j]) {
				ans[k++] = b[j++];
			}
		}
		while (i<a.length) {
			ans[k++] = a[i++];
		}
		while (j<b.length) {
			ans[k++] = b[j++];
		}
		return ans;
	}
	public static void main(String[] args) {
		int ar[] = {-8,3,6,4,-2,1,9,5,30,0,1};
		System.out.println("Given Array "+Arrays.toString(ar));
		mergeSort(ar, 0, ar.length-1);
		System.out.println("Merge Sort "+Arrays.toString(ar));
		
//		int a[] = {5,15,18,20,55,56};
//		int b[] = {2,3,8,12,19,25,32,50,63};
//		int c[] = {3,5,9,16,18,20,8,12,17,19,21,25};
//		System.out.println(Arrays.toString(mergeSameArray(c)));
//		System.out.println(Arrays.toString(twoPointerMerge(a, b)));
	}
}
