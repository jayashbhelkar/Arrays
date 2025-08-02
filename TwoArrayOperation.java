package arrayProgram;

import java.util.Arrays;

//Remove element from one array which is same in second array
//Retain element from one Array which is same in second array
public class TwoArrayOperation {
	public static int[] unionOfElementTwo(int a[] , int b[]) {
		int temp[] = new int[a.length+b.length];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			boolean freq = false;
			for (int j = 0; j < k; j++) {
				if (a[i] == temp[j]) {
					freq = true;
					break;
				}
			}
			if (!freq) {
				temp[k++] = a[i];
			}
		}
		
		for (int i = 0; i < b.length; i++) {
			boolean freq = false;
			for (int j = 0; j < a.length; j++) {
				if (b[i] == a[j]) {
					freq = true;
					break;
				}
			}
			if (!freq) {
				temp[k++] = b[i];
			}
		}
		int []ans =new int[k];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = temp[i];
		}
		return ans;
	}
	public static int[] unionOfElement(int a[] , int b[])
	{
		int ct = 0;
		boolean freq[] = new boolean[a.length];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (b[i] == a[j] && !freq[j]) {
					ct++;
					freq[j] = true;
					break;
				}
			}
		}
		if (ct>0) {
			int ans[] = new int[(a.length -ct)+b.length];
			int i = 0 , j = 0 , k = 0;
			while (i < a.length) {
				if (!freq[i]) {
					ans[k++] = a[i];
				}
				i++;
			}
			while (j < b.length) {
				ans[k++] = b[j++];
			}
			return ans;
		}
		return a;
	}
	public static int[] intersectionOfArray(int a[] , int b[])
	{
		int ct = 0;
		boolean freq[] = new boolean[b.length];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (b[i] == a[j] && !freq[i]) {
					ct++;
					freq[i] = true;
					break;
				}
			}
		}
		int ans[] = new int[ct];
		for (int i = 0 , j = 0; i < b.length; i++) {
			if (freq[i]) {
				 ans[j++] = b[i];
			}
		}
		return ans;
	}
	public static int[] removeSameElement(int []a , int b[])
	{
		boolean freq[] = new boolean[a.length];
		int ct = 0;
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (b[i] == a[j] && !freq[j]) {
					ct++;
					freq[j] = true;
					break;
				}
			}
		}
		if (ct>0) {
			int ans[] = new int[a.length-ct];
			for (int i = 0 , j = 0; i < a.length; i++) {
				if (!freq[i]) {
					ans[j++] = a[i];
				}
			}
			return ans;
		}
		return a;	
	}
	public static int[] retainSameElement(int a[] , int b[])
	{
		boolean frq[] = new boolean[a.length];
		int ct = 0;
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (b[i] == a[j] && !frq[j]) {
					ct++;
					frq[j] = true;
					break;
				}
			}
		}
		if (ct>0) {
			int ans[] = new int[ct];
			for (int i = 0 , j = 0; i < a.length; i++) {
				if (frq[i]) {
					ans[j++] = a[i];
				}
			}
			return ans;
		}
		return a;
	}
//	public static int[] removeElement(int a[] , int b[])
//	{
//		int ct = 0;
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < b.length; j++) {
//				if (a[i] == b[j]) {
//					ct++;
//				}
//			}
//		}
//		int ans[] = new int[a.length - ct];
//		int k =0;
//		for (int i = 0 ; i < a.length; i++) {
//			boolean flag = true;
//			for (int j = 0; j < b.length; j++) {
//
//				if (a[i] == b[j] ) {
//					 
//					flag = false;
//			 		break;
//				}
//			}
//			if (flag) {
//				ans[k++] = a[i];
//			}
//		}
//		return ans;
//	
//}
//	
//	public static int[] retainElement(int a[] , int b[])
//	{
//		int ct = 0;
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < b.length; j++) {
//				if (a[i] == b[j]) {
//					ct++;
//				}
//			}
//		}
//		int ans[] = new int[ct];
//		int k = 0;
//		for (int i = 0; i < a.length; i++) {
//			boolean flag = false;
//			for (int j = 0; j < b.length; j++) {
//				if (a[i] == b[j]) {
//					flag = true;
//					break;
//				}
//			}
//			if (flag) {
//				ans[k++] = a[i];
//			}
//		}
//		return ans;
//	}
	
	public static void main(String[] args) {
		int a[] = {10,7,5,4,11,24,3,10,8,6};
		int b[] = {8,2,3,4,8};
//		int[] a = {1, 2, 3};
//		int[] b = {3, 4, 5};

		System.out.println("Given one"+Arrays.toString(a));
		System.out.println("Given two"+Arrays.toString(b));
//		System.out.println("Logic One Removed Modified Array "+Arrays.toString(removeElement(a, b)));
		System.out.println("Logic Two Removed Modified Array "+Arrays.toString(removeSameElement(a, b)));
        System.out.println();
//		System.out.println("Logic One Retained Modified Array "+Arrays.toString(retainElement(a, b)));
		System.out.println("Logic Two Retained Modified Array "+Arrays.toString(retainSameElement(a, b)));
		System.out.println();
		System.out.println("1st Logic Union Of Two Arrays "+Arrays.toString(unionOfElement(a, b)));
		System.out.println("2nd Logic Union Of Two Arrays "+Arrays.toString(unionOfElementTwo(a, b)));
        System.out.println();
		System.out.println("Intersection Of Two Arrays "+Arrays.toString(intersectionOfArray(a, b)));

	}
}
