package arraysIntroduction;

import java.util.Scanner;

public class ArrProgram3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number Of Element : ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter The Element Of Index "+i+" : ");
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Element Of Index "+i+" Is "+arr[i]);
		}
		sc.close();
		
		
	}
}
