package arrayProgram;

import java.util.Arrays;

public class BubbleSort {
	public static void bubbleSort(int a[])
	{
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if (a[j]>a[j+1]) {
					a[j] = a[j]+a[j+1];
					a[j+1] = a[j]-a[j+1];
					a[j] = a[j]-a[j+1];
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {100,20,3,56,43,23,24,18,1,-8};
		System.out.println("Given Array "+Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("Sorted Array "+Arrays.toString(arr));
	}

}
