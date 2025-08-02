package assignmentProgram;
//Find Sum Of Even And Odd Element Of an Array And Check If Both The Sum
public class SumOfEvenOddElement {
	public static int evenSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		return sum;
	}
	public static int oddSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				sum += arr[i];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		int arr[] = {22,34,65,25,24};
		int evenSum = evenSum(arr);
		int oddsum = oddSum(arr);
		System.out.println("Even Element Sum Is : "+evenSum);
		System.out.println("Odd Element Sum Is : "+oddsum);
		System.out.println(evenSum == oddsum ? "Both Sum Are Same ":" Both Are Not Same");
	}
}
