package arrayProgram;

import java.util.Arrays;

public class Occurrence {
	public static int[] removeOccurrence(int a[] , int element )
	{
		int ct = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == element) {
				ct++;
			}
		}
		if (ct>0) {
			int ans[] = new int[a.length-ct];
			for (int i = 0 , j =0; i < a.length; i++) {
				if (a[i] != element) {
					ans[j++] = a[i];
				}
			}
			return ans;
		}
		return a;
	}
	public static int[] retainOccurence(int a[] , int element)
	{
		int ct = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == element) {
				ct++;
			}
		}
		if (ct>0) {
			int ans[] = new int[ct];
			for (int i = 0 , j =0 ; i < a.length; i++) {
				if (a[i] == element) {
					ans[j++] = a[i];
				}
			}
			return ans;
		}
		return a;
		
	}
	public static void main(String[] args) {
		int a[] = {10,20,30,40,50,40,60,40,70,40,80};
		int ele = 40;
		System.out.println("Given Array "+Arrays.toString(a));
		System.out.println("Occurece Removed "+Arrays.toString(removeOccurrence(a, ele)));
		System.out.println("Occurece Retained "+Arrays.toString(retainOccurence(a, ele)));

	}
}
