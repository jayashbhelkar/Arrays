package arrayProgram;

import java.util.Arrays;

//To Check If A Given Array Is A Palindrome Array Or Not
public class PalandromicArray {
	//My Method
	public static boolean isPalindromOne(int[] arr) {
		for (int i = 0 , j= arr.length-1; i<j; i++ , j--) {
			if (arr[i] != arr[j]) {
				return false;
			}
		}
		return true;
	}
	//Tejus Sir
	public static boolean isPalindromTwo(int[] arr) {
		int i= 0 , j= arr.length-1;
		while (i<j) {
			if (arr[i] == arr[j]) {
				i++;
				j--;
			}
			else {
				break;
			}
		}
		return i>=j;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,3,2,1};
		if (isPalindromTwo(arr)) {
			System.out.println(Arrays.toString(arr)+" Is Palindromic Array");
		}
		else {
			System.out.println(Arrays.toString(arr)+" Is Not Palindromic Array");
		}
	}
}
