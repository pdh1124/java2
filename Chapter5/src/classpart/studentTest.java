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
		
		Student studentKim = new Student();
		studentKim.studentName = "������";
		studentKim.address = "����";
		studentKim.ShowStudentInfo();
		
		
		System.out.println(studentLee);
		System.out.println(studentKim);
		
		//��� : ����
		//��ü : ��ü ���� ���α׷��� ���, ������ �ν��Ͻ� 
		//Ŭ���� : ��ü�� ���α׷����ϱ� ���� �ڵ�� ���� ����, Ŭ������ �ϳ����� �ű⼭ �������� �ν��Ͻ��� ����� �� �� �ִ�.
		//�ν��Ͻ� : Ŭ������ �޸𸮿� ������ ����
		//��� ���� : Ŭ������ �Ӽ�, Ư��
		//�޼��� : ��� ������ �̿��Ͽ� Ŭ������ ����� ����
		//���� ���� : �޸𸮿� ������ �ν��Ͻ��� ����Ű�� ����
		//���� �� : ������ �ν��Ͻ��� �޸� �ּ� ��
	}
}