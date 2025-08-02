package assignmentProgram;

import java.util.Arrays;

public class ReverseArrayWithout2Variable {
	public static int[] reverseArrayOne(int arr[]) {
		
		for (int i = 0; i < arr.length/2; i++) {
			int j = arr.length-1-i;
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
		}
		return arr;
	}
	public static int[] reverseArrayTwo(int arr[]) {
		
		for (int i = 0; i < arr.length/2; i++) {
			int j = arr.length-1-i;
			
			arr[i] = arr[i]+arr[j];
			arr[j] = arr[i]-arr[j];
			arr[i] = arr[i]-arr[j];
			
		}
		return arr;
		
    }
	public static void main(String[] args) {
		int arr1[] = {10,9,8,7,6,5,4,3,2,1};
		int arr2[] = {20,19,18,17,16,15,14,13,12,11};
		
		System.out.println("Given ArrayOne "+Arrays.toString(arr1));
		System.out.println("Given ArrayOne "+Arrays.toString(arr2));
		System.out.println("1st Method For Reverse Array "+Arrays.toString(reverseArrayOne(arr1)));
		System.out.println("2nd Method For Reverse Array "+Arrays.toString(reverseArrayTwo(arr2)));
	}
	
}
