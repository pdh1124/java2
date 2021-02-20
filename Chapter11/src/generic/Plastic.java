package generic; //generic = 일반적으로

public class Plastic extends Meterial { //Plastic = 플라스틱

	public String toString() {
		return "재료는 플라스틱(Plastic)입니다.";
	}

	@Override
	public void doPrinting() {
		
		System.out.println("Plastic로 프린팅 합니다.");
		
	}
	
	
}
