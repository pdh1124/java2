package staticex;

//static 메서드
//static 변수를 위한 기능을 제공하는 static메서드
//static 메서드에서는 인스턴스 변수를 사용할 수 없음
//클래스 이름으로 참조하여 사용하는 메서드

//Student.getSerialNum();

//클래스 메서드, 정적 메서드라고도 함
	
public class Student { 

	//학생이 생성될때마다 학생의 id를 자동으로 새로 부여하고 싶다.
	//기준값이 필요한데 ex) 1000, 1001, 1002, 1003 ... 순으로 값이 증가
	//모든 인스턴스가 하나의 메모리를 바라 보는 것을 static이라고 한다!!!!! => new가 계속 생성되어도 학생번호는 계속 증가해야 되기 때문에 
	private static int serialNum = 1000; //계속 증가하는 것
	private int studentID; //증가 된 값 하나만을 가져감
	public String studentName;
	public String address;

	//초기화
	public Student(String name) { //학생이 1명 만들어 질때마다
		studentName = name; //이름을 지정해 주고
		serialNum++; //시리얼 넘버를 +1씩 넘겨 준다.
		//모든 학생이 같은 메모리를 바라보기 때문에 같은 학번이 되기 때문에
		studentID = serialNum;  //매번 증가되는 시리얼넘버가 각 인스턴스의 학번이 됨
	}
	
	//초기화 2
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
	
	
	//학생 정보는 변하면 안되기 때문에 setter는 만들어 주지 않고
	//private으로 보호 되기 때문에 getter를 사용한다.
	public String getStudentName() {
		return studentName;
	}
	
	public int getStudentID() {
		return studentID;
	}

	
	//getter, setter를 생성하게 되면 static 메소드를 생성하게 됨
	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
}

