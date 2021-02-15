package array;

public class Subject { //과목을 따로 만든 클래스
	
	private String name; //과목명
	private int score; //점수
	
	
	public Subject(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	//getter와 setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
}
