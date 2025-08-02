package arraysIntroduction;

import java.util.Scanner;

public class ArrProgram4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] names = new String[4];
		
		for (int i = 0; i < names.length; i++) {
			System.out.print("Enter The "+i+" Student Name : ");
			names[i] = sc.next();
		}
		System.out.println();
		
		long phNo[] = new long[names.length];
		
		for (int i = 0; i < phNo.length; i++) {
			System.out.print("Enter The Mobile Number Of "+names[i]+" : ");
			phNo[i] = sc.nextLong();
		}
		System.out.println();
		
		for (int i = 0; i < phNo.length; i++) {
			System.out.print("Names : Mobile Number = ");
			System.out.println(names[i]+" : "+phNo[i]);
		}
		sc.close();
	}
}
