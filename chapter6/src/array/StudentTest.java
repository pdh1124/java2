package array;

public class StudentTest {

	public static void main(String[] args) {
		
		
		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 90);
		
		
		Student studentKim = new Student(1002, "Kim");
		studentKim.addSubject("국어", 50);
		studentKim.addSubject("수학", 60);
		studentKim.addSubject("영어", 30);
		
		studentLee.showStudentInfo();
		
		studentKim.showStudentInfo();
	}
		
}
