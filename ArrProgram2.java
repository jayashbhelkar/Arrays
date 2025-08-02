package arraysIntroduction;
//Storing and Printing The value
public class ArrProgram2 {
	public static void main(String[] args) {
		int [] arr = new int[4];
		
		arr[0] = 24;
		arr[1] = 44;
		arr[2] = 59;
		arr[3] = 84;
		//arr[4] = 66; //IndexOutOfBoundException
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Element Of Index "+i+" Is "+arr[i]);
		}
	}
}
