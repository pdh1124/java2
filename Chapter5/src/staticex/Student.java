package staticex;

//static �޼���
//static ������ ���� ����� �����ϴ� static�޼���
//static �޼��忡���� �ν��Ͻ� ������ ����� �� ����
//Ŭ���� �̸����� �����Ͽ� ����ϴ� �޼���

//Student.getSerialNum();

//Ŭ���� �޼���, ���� �޼����� ��
	
public class Student { 

	//�л��� �����ɶ����� �л��� id�� �ڵ����� ���� �ο��ϰ� �ʹ�.
	//���ذ��� �ʿ��ѵ� ex) 1000, 1001, 1002, 1003 ... ������ ���� ����
	//��� �ν��Ͻ��� �ϳ��� �޸𸮸� �ٶ� ���� ���� static�̶�� �Ѵ�!!!!! => new�� ��� �����Ǿ �л���ȣ�� ��� �����ؾ� �Ǳ� ������ 
	private static int serialNum = 1000; //��� �����ϴ� ��
	private int studentID; //���� �� �� �ϳ����� ������
	public String studentName;
	public String address;

	//�ʱ�ȭ
	public Student(String name) { //�л��� 1�� ����� ��������
		studentName = name; //�̸��� ������ �ְ�
		serialNum++; //�ø��� �ѹ��� +1�� �Ѱ� �ش�.
		//��� �л��� ���� �޸𸮸� �ٶ󺸱� ������ ���� �й��� �Ǳ� ������
		studentID = serialNum;  //�Ź� �����Ǵ� �ø���ѹ��� �� �ν��Ͻ��� �й��� ��
	}
	
	//�ʱ�ȭ 2
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
	
	
	//�л� ������ ���ϸ� �ȵǱ� ������ setter�� ����� ���� �ʰ�
	//private���� ��ȣ �Ǳ� ������ getter�� ����Ѵ�.
	public String getStudentName() {
		return studentName;
	}
	
	public int getStudentID() {
		return studentID;
	}

	
	//getter, setter�� �����ϰ� �Ǹ� static �޼ҵ带 �����ϰ� ��
	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
}

