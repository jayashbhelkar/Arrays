package arrayProgram;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] a = {10,90,0,5,-8,6,-4,80,5,20};
		System.out.println(Arrays.toString(a));
		quickSort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
		
	}
	public static void quickSort(int[] a , int start , int end)
	{
		if (start<end) {
			int pivotIndex = partition(a, start, end);
			quickSort(a, start, pivotIndex-1);
			quickSort(a, pivotIndex+1, end);
 		}
	}
	public static int partition(int[] a , int start , int end)
	{
		int pivot = a[start];
		int i = start , j = end;
		while (i<j) {
			while (i<=end && a[i]<=pivot) {
				i++;
			}
			while (j>start && a[j]>=pivot) {
				j--;
			}
			if (i<j) {
				swap(a, i, j);
			}
		}
		swap(a, start, j);
//		System.out.println(Arrays.toString(a));
		return j;
	}
	public static void swap(int[] a , int i , int j)
	{
		if (i!=j) {
			a[i] = a[i]+a[j];
			a[j] = a[i]-a[j];
			a[i] = a[i]-a[j];
		}
	}
}
