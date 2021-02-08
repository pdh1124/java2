package staticex;

public class Company {
	
	//유일한 객체로 싱글턴 패턴으로
	//예를 들어 학교라는 곳에 학생은 많지만 학교라는 것은 하나일때
	//회사에서 직원은 많지만 회사자체는 하나일때
	
	private static Company instance = new Company();
	
	private Company() {}
	
	public static Company getInstance() {
		
		if( instance == null) {
			instance =new Company();
			
		}
		return instance;
	}
}
