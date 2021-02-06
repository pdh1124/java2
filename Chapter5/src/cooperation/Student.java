package cooperation;

public class Student {
	
	//학생 클래스를 만듦
	String studentName; //이름
	int grade; //학년
	int money; //가진 돈
	

	//초기화 하기 위해서 Constructor(생성자)를 만든다.
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
		//지금은 딱히 grade는 쓸 필요가 없어서 안씀
	}
	
	
	//학생이 버스를 타는 상황이 있을 수 있고, 지하철을 사용할 상황이 있을 수 있다.
	//(객체의 협업부분 시작)
	
	//버스를 타면
	public void takeBus(Bus bus/*어떤 버스를 탈지 매개변수로 받음*/) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	//지하철을 타면
	public void takeSubway(Subway subway/*어떤 지하철을 탈지 매개변수로 받음*/) {
		subway.take(1200);
		this.money -= 1200;
	}
	
	//택시를 타면
	public void takeTexi(Texi texi) {
		texi.take(10000);
		this.money -= 10000;
	}
	//(객체의 협업 부분 끝)
	
	
	
	//돈이 얼마나 남았는지 출력
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "원이 남았습니다.");
	}
	
}
