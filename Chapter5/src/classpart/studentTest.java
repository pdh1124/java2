package classpart;

public class studentTest {
	
	public static void main(String[] args) {
		
		//Student.java�ȿ� Student��� Ŭ���� �̸����� ������ �ϳ� ���� ��
		//new�� ������ �Ѵٴ� ��, Student()�� �����ڷ� Ŭ���� �̸��� �����ϰ� ()��ȣ�� ���� �ݴ´�.
		//�޸𸮿� ������ ��
		Student studentLee = new Student();
		
		studentLee.studentName = "�̼���";
		studentLee.address = "����";
		
		//public void ShowStudentInfo() {}��� ����� �� �ִ� �޼ҵ�
		studentLee.ShowStudentInfo();
		
	}
}
