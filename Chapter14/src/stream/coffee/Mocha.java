package stream.coffee;

public class Mocha extends Decorator {

	public Mocha(Coffee coffee) {
		super(coffee);
		
	}
	
	public void brewing() {
		//���� Ŭ������ �����ϴ� ����� �ѹ� ���� ������ Ŀ�Ǹ� �����.
		super.brewing();
		System.out.print("Adding Mocha Syrup ");
	}
}
