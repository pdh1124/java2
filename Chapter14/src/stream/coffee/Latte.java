package stream.coffee;

//extends Decorator하게 되면 커피를 무조건 가져오게 된다.
public class Latte extends Decorator {

	public Latte(Coffee coffee) {
		super(coffee);
		
	}

	
	//커피를 뽑을때는 오버라이딩을 함
	public void brewing() {
		//상위 클래스에 제조하는 방법을 한번 뽑은 다음에 커피를 만든다.
		super.brewing();
		System.out.print("Adding Milk ");
	}
}
