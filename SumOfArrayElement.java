package arrayProgram;

import java.util.Arrays;

//Design A Method Accepts int[] and return Sum Of them
public class SumOfArrayElement {
	
		public static int sumOfElement(int[] arr) {
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			return sum;
		}
		
		public static void main(String[] args) {
			int arr[] = {12,43,56,87,97,45};
			System.out.println("Given Array Is : "+Arrays.toString(arr));
			System.out.print("Sum of Element Of The Array : "+sumOfElement(arr));
	}
}
