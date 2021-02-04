package classpart;

public class studentTest {
	
	public static void main(String[] args) {
		
		//Student.java안에 Student라는 클래스 이름으로 변수를 하나 선언 후
		//new는 생성을 한다는 뜻, Student()는 생성자로 클래스 이름과 동일하고 ()괄호를 열고 닫는다.
		//메모리에 생성이 됨
		Student studentLee = new Student();
		
		studentLee.studentName = "이순신";
		studentLee.address = "서울";
		
		//public void ShowStudentInfo() {}라는 사용할 수 있는 메소드
		studentLee.ShowStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.address = "경주";
		studentKim.ShowStudentInfo();
		
		
		System.out.println(studentLee);
		System.out.println(studentKim);
	}
}
