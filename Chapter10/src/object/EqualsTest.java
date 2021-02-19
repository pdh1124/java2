package object;

class Student {
	int studentNum; //�й�
	String studentName; //�л� �̸�
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}

	
	//���� �й��̸� ���� ������ ���ϼ��� Ȯ����
	@Override
	public boolean equals(Object obj) {
		//return super.equals(obj);
		if( obj instanceof Student) { //�Ű������� �޴� obj�� student�ΰ� Ȯ���ϱ�
			Student std = (Student)obj;
			//return (this.studentNum == std.studentNum);
			
			if(this.studentNum == std.studentNum) {
				return true;
			}
			else {
				return false;
			}
		}
		return false; //�Ű������� �޴� obj�� student�� �ƴ϶�� ������ false
	}

	
	//equals�� hashCode�� ���� ������ ������
	//equals�� �� ���� ����ϸ� ��
	@Override
	public int hashCode() {
		return studentNum;
	}
	
	
	
	
}

public class EqualsTest {

	public static void main(String[] args) {
		
		Student Lee = new Student(100, "�̼���");
		Student Lee2 = Lee;
		Student Shin = new Student(100, "�̼���");
		
		System.out.println(Lee == Lee2); //true : �翬�� ���� ��
		System.out.println(Lee == Shin); //false  : �ν��Ͻ� �ּҰ� �ٸ��� ����
		
		System.out.println(Lee.equals(Shin));
		
		System.out.println("======================");
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		// == ��ȣ�� 2�� ���ΰ��� �޸��ּҰ� ���� ���� ����� ��
		System.out.println(str1 == str2);
		
		// �ΰ��� ���ڿ��� �������� ���Ѵ�.
		System.out.println(str1.equals(str2));
		
		
		System.out.println("======================");
	
		//hashCode() �޼ҵ�
		System.out.println(Lee);
		System.out.println(Lee.hashCode());
		System.out.println(Lee2.hashCode());
		System.out.println(Shin.hashCode());
		
		
		System.out.println("======================");
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);

		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		
		//���� �޸� Ȯ�ι�
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
		
	}

}
