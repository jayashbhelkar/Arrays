package assignmentProgram;

import java.util.Arrays;

//Perform Half Reverse Of An Array
public class HalfReverse {
	public static int[] halfReverseMethodOne(int[] arr)
	{
		int reverse[] = new int[arr.length];
		for (int i = 0; i < arr.length/2; i++) {
			reverse[i] = arr[i];
		}
		for (int i = arr.length-1 , j = arr.length/2 ; i>=arr.length/2  ;i-- , j++) {
			reverse[j] = arr[i];
		}
		return reverse;
	}
	public static int[] halfReverseMethodTwo(int[] arr)
	{
		int rev[] = new int[arr.length];
		for (int i = 0 , j = arr.length-1; i < arr.length; i++) {
			if (i < arr.length/2) {
				rev[i] = arr[i];
			}
			else {
				rev[j] = arr[i];
				j--;
			}
		}
		return rev;
	}
	public static void main(String [] args) {
		int [] arr = {12,45,17,42,89,65,87,24};
		System.out.println("Given Array Is "+Arrays.toString(arr));
		System.out.println("By Method One , Half Reverse Format Of Given Array Is "+Arrays.toString(halfReverseMethodOne(arr)));
		System.out.println("By Method Two , Half Reverse Format Of Given Array Is "+Arrays.toString(halfReverseMethodTwo(arr)));

	}
}
