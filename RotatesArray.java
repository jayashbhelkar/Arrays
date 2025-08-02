package arrayProgram;

import java.util.Arrays;

public class RotatesArray {
	public static int[] rotatesLeft(int a[] , int times)
	{
		for (int j = 0; j < times; j++) {
			int temp = a[a.length-1];
			for (int i = a.length-1 ; i>0 ; i--) {
				a[i]=a[i-1];
			}
			a[0] = temp;
		}
		return a;
		
	}
	public static int[] rotatesRight(int []a , int times)
	{
		for (int j = 0; j < times; j++) {
			int temp = a[0];
			for (int i = 0; i < a.length-1; i++) {
				a[i]=a[i+1];
			}
			a[a.length-1] = temp;

		}		
		return a;
	}
	public static void main(String[] args) {
		int a[] = {10,20,30,40,50,60,70,80,90};
		int b[] = {1,2,3,4,5,6,7,8,9};
		int times = 1;
		System.out.println("Given "+Arrays.toString(a));
		System.out.println("Roatates left"+Arrays.toString(rotatesLeft(a , times)));
		System.out.println("Given "+Arrays.toString(b));
		System.out.println("Roatates right"+Arrays.toString(rotatesRight(b , times)));
	}
}
