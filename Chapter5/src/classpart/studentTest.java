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
		
		//용어 : 설명
		//객체 : 객체 지향 프로그램의 대상, 생성된 인스턴스 
		//클래스 : 객체를 프로그래밍하기 위해 코드로 만든 상태, 클래스는 하나지만 거기서 여러개의 인스턴스가 만들어 질 수 있다.
		//인스턴스 : 클래스가 메모리에 생성된 상태
		//멤버 변수 : 클래스의 속성, 특성
		//메서드 : 멤버 변수를 이용하여 클래스의 기능을 구현
		//참조 변수 : 메모리에 생성된 인스턴스를 가리키는 변수
		//참조 값 : 생성된 인스턴스의 메모리 주소 값
	}
}
