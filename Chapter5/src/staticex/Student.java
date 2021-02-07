package staticex;

	
public class Student { 

	//�л��� �����ɶ����� �л��� id�� �ڵ����� ���� �ο��ϰ� �ʹ�.
	//���ذ��� �ʿ��ѵ� ex) 1000, 1001, 1002, 1003 ... ������ ���� ����
	//��� �ν��Ͻ��� �ϳ��� �޸𸮸� �ٶ� ���� ���� static�̶�� �Ѵ�.
	private static int serialNum = 1000; //��� �����ϴ� ��
	private int studentID; //���� �� �� �ϳ����� ������
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
		address = "�ּ� ����";
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

