package cooperation;

public class Student {
	
	//1.변수 지정
	String studentName; // 학생이름
	int grade; //학년
	int money; //소지금
	
	//2.초기화
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	//12. 버스를 타는 메소드
	public void takeBus(Bus bus) { //어떤 버스를 탓는지 매개변수로 받는다.
		bus.take(1000); //돈을 지불함
		this.money -= 1000; //소지금이 감소됨
	}
	
	//13. 지하철을 타는 메소드
	public void takeSubway(Subway subway) { //어떤 지하철을 탓는지 매개변수로 받는다.
		subway.take(1200); //돈을 지불함
		this.money -= 1200; //소지금이 감소됨
	}
	
	//a5. 택시는 타는 메소드
	public void takeTaxi(Taxi taxi) { //어떤 택시를 탓는지 매개변수로 받는다.
		taxi.take(10000); //돈을 지불함
		this.money -= 10000; //소지금이 감소됨
	}
	
	//3.얼마가 남았는지 출력
	public void showInfo() {
		System.out.println(studentName +"님의 남은 돈은 " + money + "원 입니다");
	}
}
