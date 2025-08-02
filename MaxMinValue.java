package assignmentProgram;

public class MaxMinValue {
	public static void main(String[] args) {
		
		int arr[] = {-1,-4,1,3,4,5,6};
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]>max) {
				max = arr[i];
			}
			if (arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
	}
}
