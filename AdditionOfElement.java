package arrayProgram;

import java.util.Arrays;

//Add All The Elements Of An Array
public class AdditionOfElement {
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50,60,70,80,90};
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Given Array Is : "+Arrays.toString(arr));
		System.out.print("Sum of Element Of The Array : "+sum);
	}
}
