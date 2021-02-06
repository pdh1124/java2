package cooperation;

public class TakeTransTest {

	public static void main(String[] args) {

		//학생을 만든다.
		
		//studentJ변수에 James라는 이름의 학생이 5000원을 소지하고 있다.
		Student studentJ = new Student("James", 5000);
		
		//studentT변수에 Tomas라는 이름의 학생이 10000원을 소지하고 있다.
		Student studentT = new Student("Tomas", 10000);
		
		//studentE변수에 Edward라는 이름의 학생이 15000원을 소지하고 있다.
		Student studentE = new Student("Edward", 15000);
		
		//버스를 생성
		//bus100이라는 변수에 Bus번호 100번을 만들었다.
		Bus bus100 = new Bus(100);
		
		//bus101이라는 변수에 Bus번호 101번을 만들었다.
		Bus bus101 = new Bus(101);
		
		//bus500이라는 변수에 Bus번호 500번을 만들었다.
		Bus bus500 = new Bus(500);
		
		//지하철 생성
		//subwayBlue이란 변수에 4번 라인의 지하철 생성(4호선-파란라인)
		Subway subwayBlue = new Subway(4);
		
		
		//subwayGreen이란 변수에 2번 라인의 지하철 생성(2호선-녹색라인)
		Subway subwayGreen = new Subway(2);
		
		
		//택시생성
		//일반택시 요금 10000원 생성
		Texi texiNormal = new Texi("일반");
		//모범택시 요금 20000원 생성
		Texi texiSpaical = new Texi("모범");
		
		
		//James는 100번 버스를 탔다.
		studentJ.takeBus(bus100);
		
		//Tomas는 지하철 2호선을 탔다.
		studentT.takeSubway(subwayGreen);
		
		//Edward는 일반 택시를 탓다.
		studentE.takeTexi(texiNormal);
		
		//James,Tomas 상황을 출력
		studentJ.showInfo();
		studentT.showInfo();
		studentE.showInfo();
		
		//버스상황 출력
		bus100.showBusInfo();
		bus101.showBusInfo();
		bus500.showBusInfo();
		
		//지하철 상황 출력
		subwayGreen.showSubwayInfo();
		subwayBlue.showSubwayInfo();
		
		//택시 상황 출력
		texiNormal.showTexiInfo();
		texiSpaical.showTexiInfo();
	}

}
