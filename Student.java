package arraysIntroduction;

public class Student {

	String name;
	String college;
	int age;
	int id;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String college, int age, int id) {
		super();
		this.name = name;
		this.college = college;
		this.age = age;
		this.id = id;
	}
	@Override
	public String toString() {
		return "[ Name : "+name+" , Collage : "+college+" , Age : "+age+" , Id : "+id+" ]";
	}
	
}
