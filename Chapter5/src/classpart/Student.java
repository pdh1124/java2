package classpart;

public class Student { //public이 들어간 클래스는 자바파일 하나당 하나밖에 들어갈 수 없다.

		
	public int studentID;
	public String studentName;
	public String address;


	public void ShowStudentInfo(/*매개 변수*/) {
		System.out.println(studentName +"," + address);
	}
}

class ABCD { //새로운 클래스를 만들 수 있지만 public을 넣을 순 없다.
	
}