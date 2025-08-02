package arrayProgram;

import java.util.Arrays;

//Create A Method which accepts the int[] And Return Reverse Of It
public class ReverseArray {
	public static int[] reverseElement(int[] arr) {
		int[] rev = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			rev[arr.length-1-i]= arr[i];
		}
		return rev;
	}
	public static int[] reverseElementTwo(int[] arr) {
		int[] rev = new int[arr.length];
		for (int i = 0 , j = arr.length-1; i < arr.length; i++ , j--) {
			rev[j] = arr[i];
		}
		return rev;
	}
	public static void main(String[] args) {
		int[] arr = {12,43,56,45,88,97,66};
		int[] ans = reverseElement(arr);
		System.out.println("Given Array Is : "+Arrays.toString(arr));
		System.out.println("Reverse Of An Given Array "+Arrays.toString(ans));
		System.out.println(Arrays.toString(reverseElementTwo(arr)));
	}
}
