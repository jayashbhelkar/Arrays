package interviewQ;

public class CountOfZeroesInFactorial {
	public static void main(String[] args) {
		int num = 5;
		int fact = factorial(num);
		int count = countOfZero(fact);
		System.out.println("Factorial Of Num Is "+fact);
		System.out.println("Count Of Zeros "+count);	
	}
	public static int countOfZero(int fact)
	{
		int ct = 0;
		while (fact%10==0) {
			ct++;
			fact/=10;
		}
		return ct;
	}
	public static int factorial(int num)
	{
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact*=i;
		}
		return fact;
	}
}
