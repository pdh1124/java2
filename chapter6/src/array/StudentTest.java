package array;

public class StudentTest {

	public static void main(String[] args) {
		
		
		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("����", 100);
		studentLee.addSubject("����", 90);
		
		
		Student studentKim = new Student(1002, "Kim");
		studentKim.addSubject("����", 50);
		studentKim.addSubject("����", 60);
		studentKim.addSubject("����", 30);
		
		studentLee.showStudentInfo();
		
		studentKim.showStudentInfo();
	}
		
}
