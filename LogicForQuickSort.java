package arrayProgram;

import java.util.Arrays;

public class LogicForQuickSort {
//	public static int[] quickSort(int a[] , int start , int end)
//	{
//		if (start<end) {
//			quickSort(a , 0 , )
//		}
//	}
	public static int[] findJ(int a[])
	{
		int ref = a[0];
		int i = 0 , j = a.length-1;
		while (i<j) {
			if (ref > a[i]) {
				i++;
			}
			else if (ref < a[j]) {
				j--;
			}
			else if (a[i] > a[j]) {
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
		}
		System.out.println(" i : "+i+" j :  "+j);
		return a;
		
	}
	public static void main(String[] args) {
		int ar[] = {-8,3,6,4,-2,1,9,5,30,0,1};
//		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(findJ(ar)));
	}
}
