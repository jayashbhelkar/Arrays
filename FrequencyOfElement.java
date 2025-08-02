package arrayProgram;

import java.util.Arrays;

public class FrequencyOfElement {
	public static int[] findFrequency(int[] a)
	{
		int count[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int ct = 0;
			if (count[i] != -1) {
				for (int j = i+1; j < a.length; j++) {
					if (a[i] == a[j]) {
						ct++;
						count[j] = -1;
					}
				}
				count[i] = ct;
			}
		}
		return count;
	}
	public static int[] removeReapets(int a[])
	{
		int count[] = findFrequency(a);
		int ct = 0;
		for (int i = 0; i < count.length; i++) {
			if (count[i]== -1) {
				ct++;
			}
		
		}
		int ans[] = new int[a.length - ct];
		for (int i = 0 , j=0; i < count.length; i++) {
			if (count[i]!=-1) {
				ans[j++] = a[i];
			}
		}
		return ans;
	}
	public static int[] retainDup(int a[])
	{
		int freq[] = findFrequency(a);
		int ct = 0;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i]>0) {
				ct++;
			}	
		}
		int ans[] = new int[ct];
		for (int i = 0 , j=0; i < a.length; i++) {
			if (freq[i]>0) {
				ans[j++] = a[i]; 
			}
		}
		return ans;
	}
	public static int[] nonReapets(int a[])
	{
		int freq[] = findFrequency(a);
		int ct = 0;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i]==0) {
				ct++;
			}	
		}
		int ans[] = new int[ct];
		for (int i = 0 , j = 0; i < a.length; i++) {
			if (freq[i] == 0) {
				ans[j++] = a[i];
			}
		}
		return ans;
	}
	public static int[] duplicatesOnly(int a[])
	{
		int freq[] = findFrequency(a);
		int ct = 0;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i]!=0) {
				ct++;
			}	
		}
		int ans[] = new int[ct];
		for (int i = 0 , j = 0; i < a.length; i++) {
			if (freq[i] != 0) {
				ans[j++] = a[i];
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int a[] = {10,-3,6,24,5,-3,10,8,6,4,8,6};
		System.out.println("Given Array Is "+Arrays.toString(a));
		int ct[] = findFrequency(a);
		for (int i = 0; i < ct.length; i++) {
			if (ct[i] != -1) {
				System.out.println(a[i]+" Is Occure "+(ct[i]+1)+" Times");
			}
		}
		System.out.println("Removed Duplcates"+Arrays.toString(removeReapets(a)));
		System.out.println("Retain Duplcates"+Arrays.toString(retainDup(a)));
		System.out.println("Non - Duplcates"+Arrays.toString(nonReapets(a)));
		System.out.println("Duplcates Only"+Arrays.toString(duplicatesOnly(a)));

	}
}
