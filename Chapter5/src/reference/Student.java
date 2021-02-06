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
		System.out.println(studentName + " 학생의 총점은 " + total + "점 입니다.");
	} 
	/*
	 * 과목 추가할때마다 변수르 만들어야 해서 좋은 방법은 아님
	 * 그래서 class를 하나 만들어 따로 작업함(Subject.java)
	int koreaScore;
	int mathScore;
	int engScore;
	
	String koreaName;
	String mathName;
	String engName;
	*/
}

