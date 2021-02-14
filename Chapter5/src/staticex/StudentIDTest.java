package staticex;

public class StudentIDTest {

	public static void main(String[] args) {
		
		
		//Lee 학생 생성
		Student studentLee = new Student("Lee");
		System.out.println(Student.getSerialNum());
		
		//Kim 학생 생성
		Student studentKim = new Student("Kim");
		System.out.println(Student.getSerialNum());
		
		//Park 학생 생성
		Student studentPark = new Student("Park");
		System.out.println(Student.getSerialNum());
		System.out.println(studentKim.getStudentID()); //같은 메모리를 바라보고 있다.
		
		System.out.println(studentLee.getStudentID());
		System.out.println(studentKim.getStudentID());
		System.out.println(studentPark.getStudentID());
	}
	

}
