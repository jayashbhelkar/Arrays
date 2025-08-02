package interviewQ;

public class FindTotalPower {
	public static void main(String[] args) {
		int initialPow = 5;
		int rateOfChange = 3;
		int time = 3;
		int totalPower = totalPow(initialPow, rateOfChange, time);
		System.out.println(totalPower);
	}
	public static int totalPow(int inPow , int rate , int time)
	{
		int totalPow = inPow;
		for (int i = 0; i < time-1; i++) {
			inPow+=rate;
			totalPow+=inPow;
		}
		return totalPow;
	}
}
