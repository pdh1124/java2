package array;

import java.util.ArrayList;

public class Student { //학생에 관한 클래스
	
	int studentID; //학생 ID
	String studentName; //학생 이름
	
	//10개 이상 다양 하니까. 과목을 일일이 선언하는게 아니라... 
	//	Subject kor;
	//	Subject eng;...
	
	//ArrayList라는 메소드를 사용해서 Subject라는 요소를 넣어서 관리를 한다.
	ArrayList<Subject> subjectList; //빨간불이 나면 import java.util.ArrayList;를 해주어야 함
	
	//subjectList는 그냥 쓰는게 아니고 생성을 해야 하는데 콘스트럭트(생성자)에서 많이 사용함
	public Student(int studentID, String studentName) {
		this.studentID = studentID; //매개변수로 학생 ID를 받고
		this.studentName = studentName; //매개변수로 학생이름을 받는다.
		
		//subjectList을 ArrayList<Subject>()로 생성한다.
		subjectList = new ArrayList<Subject>(); 
	} 
	
	//<Subject>객체는 바로 생성을 해줘야 한다.
	//학생이 한명한명이 생성이 되고 나서 이 학생이 어떤 과목을 수강할때마다 추가를 해줘야 함
	public void addSubject(String name, int score) {
		Subject subject =new Subject(name, score);
		
		subjectList.add(subject);
	}
	
	//정보 출력
	public void showStudentInfo() {
		
		int total = 0;
		
		for( Subject subject : subjectList) {
			total += subject.getScore();
			System.out.println(studentName + "학생의 " + subject.getName() + "과목의 성적은" + subject.getScore() + "점 입니다.");
		}
		System.out.println(studentName + "학생의 총점은" + total + "점 입니다.");
	}
}
