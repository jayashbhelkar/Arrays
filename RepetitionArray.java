package assignmentProgram;
//Give Me A Count Of Repetition Of the element in a array
public class RepetitionArray {
	public static int repetationCount(int[] arr,int num)
	{
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int arr[] = {12,34,4,2,4,24,4,24,12,5};
		int num = 4;
		System.out.println("Occurence Of "+num+" In Array Is "+repetationCount(arr, num)+" Times");
	}
}
