package staticex;

public class StudentIDTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student("Lee");
		System.out.println(Student.getSerialNum());
		
		Student studentKim = new Student("Kim");
		System.out.println(Student.getSerialNum());
		
		Student studentPark = new Student("Park");
		System.out.println(Student.getSerialNum());
		System.out.println(studentKim.getStudentID()); //���� �޸𸮸� �ٶ󺸰� �ִ�.
		
		System.out.println(studentLee.getStudentID());
		System.out.println(studentKim.getStudentID());
		System.out.println(studentPark.getStudentID());
	}

}
