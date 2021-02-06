package reference;

public class Student {
	
	int studentID;
	String studentName;
	
	Subject korea;
	Subject math;
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		
		korea = new Subject();
		math = new Subject();
		
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void ShowStudentScore() {
		int total = korea.score + math.score;
		System.out.println(studentName + " �л��� ������ " + total + "�� �Դϴ�.");
	} 
	/*
	 * ���� �߰��Ҷ����� ������ ������ �ؼ� ���� ����� �ƴ�
	 * �׷��� class�� �ϳ� ����� ���� �۾���(Subject.java)
	int koreaScore;
	int mathScore;
	int engScore;
	
	String koreaName;
	String mathName;
	String engName;
	*/
}

