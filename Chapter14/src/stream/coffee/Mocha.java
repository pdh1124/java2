package stream.coffee;

public class Mocha extends Decorator {

	public Mocha(Coffee coffee) {
		super(coffee);
		
	}
	
	public void brewing() {
		//상위 클래스에 제조하는 방법을 한번 뽑은 다음에 커피를 만든다.
		super.brewing();
		System.out.print("Adding Mocha Syrup ");
	}
}
