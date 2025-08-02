package assignmentProgram;
//Give Me Count Of Even & Odd Elements In Array
public class CountOfEvenOdd {
	public static void countEvenOdd(int[] arr)
	{
		int evenCount = 0;
		int oddCount = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		System.out.println("Count Of Even Elements In Array Is "+evenCount);
		System.out.println("Count Of Odd Elements In Array Is "+oddCount);
	}
	public static void main(String[] args) {
		int arr[] = {12,34,22,55,77,66,45,46,89,90};
		countEvenOdd(arr);
	}
}
