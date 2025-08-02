package assignmentProgram;

import java.util.Arrays;

//we have 2 arrays , we have to merge it in zig-zag form
//for achieving this design we required both the arrays with same length
public class ZigZagMerge {
	public static int[] zigZag1(int ar1[] , int ar2[])
	{
		int ans[] = new int[ar1.length+ar2.length];
		int memmory = 0;
		if (ar1.length > ar2.length) {
			int i;
			for (i = 0; i < ar2.length; i++ , memmory+=2) {
				ans[memmory] = ar1[i];
				ans[memmory+1] = ar2[i];
			}
			while (i < ar1.length) {
				ans[memmory] = ar1[i];
				i++;
				memmory++;
			}
		}
		else if (ar1.length < ar2.length) {
			int i;
			for (i = 0; i < ar1.length; i++ , memmory+=2) {
				ans[memmory] = ar1[i];
				ans[memmory+1] = ar2[i];
			}
			while (i < ar2.length) {
				ans[memmory] = ar2[i];
				i++;
				memmory++;
			}
		}
		else {
			int i;
			for (i = 0; i < ar1.length; i++ , memmory+=2) {
				ans[memmory] = ar1[i];
				ans[memmory+1] = ar2[i];
			}
		}
		return ans;
	}
	public static int[] zigZag2(int[] ar1 , int[] ar2)
	{
		int ans[] = new int[ar1.length+ar2.length];
		int i=0 , j=0 , k=0;
		while (i<ar1.length && j<ar2.length) {
			ans[k++] = ar1[i++];
			ans[k++] = ar2[j++];
		}
		while (i<ar1.length) {
			ans[k++] = ar1[i++];
		}
		while (j<ar2.length) {
			ans[k++] = ar2[j++];
		}
		return ans;
	}
	public static int[] zigZag3(int[] ar1 , int[] ar2)
	{
		int ans[] = new int[ar1.length+ar2.length];
		int ct = 0;
		for (int i = 0; i < (ar1.length>ar2.length?ar1.length:ar2.length); i++) {
			if (i<ar1.length) {
				ans[ct++] = ar1[i];
			}
			if (i<ar2.length) {
				ans[ct++] = ar2[i];
			}
		}
		return ans;
	}
	public static int[] zigZag4(int[] ar1 , int[] ar2)
	{
		int ans[] = new int[ar1.length+ar2.length];
		int mem = 0;
		if (ar1.length>ar2.length) {
			for (int i = 0; mem < ans.length; i++) {
				if (i<ar2.length) {
					ans[mem] = ar1[i];
					ans[mem+1] = ar2[i];
					mem+=2;
				} else {
					ans[mem] = ar1[i];
					mem++;
				}
			}
		}
		else if (ar1.length<ar2.length) {
			for (int i = 0; mem < ans.length; i++) {
				if (i<ar1.length) {
					ans[mem] = ar1[i];
					ans[mem+1] = ar2[i];
					mem+=2;
				} else {
					ans[mem] = ar2[i];
					mem++;
				}
			}
		}
		else {
			for (int i = 0; mem < ans.length; i++) {
					ans[mem] = ar1[i];
					ans[mem+1] = ar2[i];
					mem+=2;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int ar1[]= {12,24,36,48,60,72,120};
		int ar2[]= {4,12,16,20,24,48,56,78,201,204,224,424};
		int result[]= zigZag1(ar1, ar2);
		System.out.println("Array1 "+Arrays.toString(ar1));
		System.out.println("Array2 "+Arrays.toString(ar2));
		System.out.println("Zig-Zag 1st Combination of Merged Array "+Arrays.toString(result));
		System.out.println("Zig-Zag 2nd Combination of Merged Array "+Arrays.toString(zigZag2(ar1, ar2)));
		System.out.println("Zig-Zag 3rd Combination of Merged Array "+Arrays.toString(zigZag3(ar1, ar2)));
		System.out.println("Zig-Zag 4th Combination of Merged Array "+Arrays.toString(zigZag4(ar1, ar2)));


	}
}
