package staticex;

	
public class Student { 

	//학생이 생성될때마다 학생의 id를 자동으로 새로 부여하고 싶다.
	//기준값이 필요한데 ex) 1000, 1001, 1002, 1003 ... 순으로 값이 증가
	//모든 인스턴스가 하나의 메모리를 바라 보는 것을 static이라고 한다.
	private static int serialNum = 1000; //계속 증가하는 것
	private int studentID; //증가 된 값 하나만을 가져감
	public String studentName;
	public String address;

	public Student(String name) {
		studentName = name;
		serialNum++;
		studentID = serialNum;
	}
	
	public Student(int id,String name) {
		studentID = id;
		studentName = name;
		address = "주소 없음";
		serialNum++;
		studentID = serialNum;
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public int getStudentID() {
		return studentID;
	}

	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
}

