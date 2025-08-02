package arrayProgram;

import java.util.Arrays;

public class SecondMinimum {
	public static int findSecMin(int arr[])
	{
		int min = Integer.MAX_VALUE;
		int secMin = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<min) {
				secMin = min;
				min = arr[i];
			}
			else if (arr[i]<secMin && arr[i]!=min) {
				secMin = arr[i];
			}
		}
		System.out.println("Minimum Element Is "+min);
		return secMin;
	}
	public static void main(String[] args) {
		int arr[] = {-12,-4,-1,0,1,3,8,4,8};
		System.out.println("Given Arrays Is "+Arrays.toString(arr));
		System.out.println("Second Minimum Element Is "+findSecMin(arr));
	}
}
