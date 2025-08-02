package assignmentProgram;
//Give Me count of prime numbers in an Array
public class CountOfPrimeNumber {
	public static boolean isPrime(int num) {
		if (num<2) {
			return false;
		}
		int den = 2;
		while(num>den) {
			if (num % den == 0) {
				return false;
			}
			den++;
		}
		return true;
	}
	public static int countOfPrime(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i])) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		 int arr[] = {22,17,7,5,12,11,15};
		 int primeCount = countOfPrime(arr);
		 System.out.println("Count Of Prime Elements In Array Is : "+primeCount);
	}
}
