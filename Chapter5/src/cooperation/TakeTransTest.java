package cooperation;

public class TakeTransTest {

	public static void main(String[] args) {
		//14. 학생 생성
		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas", 10000);
		
		//15. 임의의 버스와 지하철을 만듦
		Bus bus100 = new Bus(100); //100번 버스
		Bus bus500 = new Bus(500); //500번 버스
		Subway subwayGreen = new Subway(2); //2호선 라인의 지하철
		Subway subwayBlue = new Subway(4); //4호선 라인의 지하철
		
		
		//16. 학생이 대중 교통을 탑승함
		studentJ.takeBus(bus100); //James는 100번 버스를 탑승
		studentT.takeSubway(subwayGreen); //Tomas는 2호선 라인의 지하철을 탑승
		
		//17. 학생에 대한 상황 출력
		studentJ.showInfo();
		studentT.showInfo();
		
		//18. 대중교통에 대한 상황 출력
		bus100.showBusInfo();
		bus500.showBusInfo();
		
		subwayGreen.showSubwayInfo();
		subwayBlue.showSubwayInfo();
		
		System.out.println("------------------ \n직접 해보기");
		
		
		//a6. 에드워드라는 학생을 만듦
		Student studentE = new Student("Edward", 20000);
		//a7. 택시 생성
		Taxi wellTaxi = new Taxi("일반"); //일반 택시
		Taxi specialTaxi = new Taxi("모범"); //모범 택시
		
		//a8. 에드워드가 택시에 탑승함
		studentE.takeTaxi(wellTaxi); //에드워드가 일반 택시에 탑승함
		
		//a9. 에드워드의 상황 출력
		studentE.showInfo();
		
		//a10. 택시의 상황 출력
		wellTaxi.showTaxInfo();
		specialTaxi.showTaxInfo();
	}

}
