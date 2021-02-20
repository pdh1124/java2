package generic; //generic = 일반적으로

public class Powder extends Meterial { //Powder = 파우더
	
	public String toString() {
		return "재료는 파우더(Powder)입니다.";
	}

	@Override
	public void doPrinting() {
		
		System.out.println("Powder로 프린팅 합니다.");
		
	}
	
	
}
