package array;

import java.util.ArrayList;

public class Student { //�л��� ���� Ŭ����
	
	int studentID; //�л� ID
	String studentName; //�л� �̸�
	
	//10�� �̻� �پ� �ϴϱ�. ������ ������ �����ϴ°� �ƴ϶�... 
	//	Subject kor;
	//	Subject eng;...
	
	//ArrayList��� �޼ҵ带 ����ؼ� Subject��� ��Ҹ� �־ ������ �Ѵ�.
	ArrayList<Subject> subjectList; //�������� ���� import java.util.ArrayList;�� ���־�� ��
	
	//subjectList�� �׳� ���°� �ƴϰ� ������ �ؾ� �ϴµ� �ܽ�Ʈ��Ʈ(������)���� ���� �����
	public Student(int studentID, String studentName) {
		this.studentID = studentID; //�Ű������� �л� ID�� �ް�
		this.studentName = studentName; //�Ű������� �л��̸��� �޴´�.
		
		//subjectList�� ArrayList<Subject>()�� �����Ѵ�.
		subjectList = new ArrayList<Subject>(); 
	} 
	
	//<Subject>��ü�� �ٷ� ������ ����� �Ѵ�.
	//�л��� �Ѹ��Ѹ��� ������ �ǰ� ���� �� �л��� � ������ �����Ҷ����� �߰��� ����� ��
	public void addSubject(String name, int score) {
		Subject subject =new Subject(name, score);
		
		subjectList.add(subject);
	}
	
	//���� ���
	public void showStudentInfo() {
		
		int total = 0;
		
		for( Subject subject : subjectList) {
			total += subject.getScore();
			System.out.println(studentName + "�л��� " + subject.getName() + "������ ������" + subject.getScore() + "�� �Դϴ�.");
		}
		System.out.println(studentName + "�л��� ������" + total + "�� �Դϴ�.");
	}
}
