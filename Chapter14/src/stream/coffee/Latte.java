package stream.coffee;

//extends Decorator�ϰ� �Ǹ� Ŀ�Ǹ� ������ �������� �ȴ�.
public class Latte extends Decorator {

	public Latte(Coffee coffee) {
		super(coffee);
		
	}

	
	//Ŀ�Ǹ� �������� �������̵��� ��
	public void brewing() {
		//���� Ŭ������ �����ϴ� ����� �ѹ� ���� ������ Ŀ�Ǹ� �����.
		super.brewing();
		System.out.print("Adding Milk ");
	}
}
