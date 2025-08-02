package arraysIntroduction;

public class StudentDB {

	public static void main(String[] args) {
		
		Student [] dataBase = new Student[4];
		
		dataBase[0] = new Student("Jayash Bhelkar", "JIT", 22, 2004);
		dataBase[1] = new Student("Piyush Wattakhare", "Raisoni", 21, 2005);
		dataBase[2] = new Student("Pachu", "Taiwade", 22, 2006);
		dataBase[3] = new Student("Pratik", "Saraswati", 24, 2008);
		
		for (int i = 0; i < dataBase.length; i++) {
			System.out.println(dataBase[i]);
		}
	}
}
