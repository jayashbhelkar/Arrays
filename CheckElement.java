package assignmentProgram;
//check if a element present in a array
public class CheckElement {
	public static boolean checkElement(int[] arr , int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				System.out.println(i);
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[] = {12,34,24,33,56,78,45,65};
		int num =24;
		System.out.println(checkElement(arr, num));
	}
}
