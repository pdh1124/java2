package classpart;

	//class �� ����ڷ� �����ϸ� ����
	//package�� �ҹ��ڷ� �ϴ°� ����
	//����,�޼���� �ҹ��ڷ� �����ؼ� �߰��ܾ �ٲ� �빮�ڷ� (��Ÿ�� ��(ī������̼�)


public class Student { //public�� �� Ŭ������ �ڹ����� �ϳ��� �ϳ��ۿ� �� �� ����.

		
	public int studentID;
	public String studentName;
	public String address;


	public void ShowStudentInfo(/*�Ű� ����*/) {
		System.out.println(studentName +"," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
}

class ABCD { //���ο� Ŭ������ ���� �� ������ public�� ���� �� ����.
	
}