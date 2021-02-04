package classpart;

	//class 는 대분자로 시작하면 좋고
	//package는 소문자로 하는게 좋고
	//변수,메서드는 소문자로 시작해서 중간단어가 바뀔때 대문자로 (낙타의 등(카멜로테이션)


public class Student { //public이 들어간 클래스는 자바파일 하나당 하나밖에 들어갈 수 없다.

		
	public int studentID;
	public String studentName;
	public String address;


	public void ShowStudentInfo(/*매개 변수*/) {
		System.out.println(studentName +"," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
}

class ABCD { //새로운 클래스를 만들 수 있지만 public을 넣을 순 없다.
	
}