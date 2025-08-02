package assignmentProgram;

import java.util.Arrays;

//Make The Entire Array into Even Array and Make entire array into positive Array
public class MakeEvenAndPositiveArray {
	public static int[] makeEven(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2!=0) {
				arr[i]++;
			}
		}
		return arr;
	}
	public static int[] makePositive(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<0) {
				arr[i]*=(-1);
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = {12,-11,9,8,7,-6,-5,4,-2,1};
		System.out.println("Given Array Is "+Arrays.toString(arr));


		int[] positiveArray = makePositive(arr);
		System.out.println("Even and Positive Array : "+Arrays.toString(positiveArray));
		
		int[] evenArray = makeEven(positiveArray);
		System.out.println("Even Array : "+Arrays.toString(evenArray));
	}
}
