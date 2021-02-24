package stream.coffee;

//new�ؼ� �������� ���̶� abstract�� ����.
public abstract class Decorator extends Coffee {
	
	//���ڷ����ʹ� ȥ�� ���ư� �� ����.
	//�����ڿ��� �׻� �Ǵٸ� Ŀ�Ǹ� ������ ����
	//�� ������ �ִ� Ŀ�Ƕ�� ���� Ŭ���� ��ü�� ������ �ִ�.
	
	Coffee coffee;
	public Decorator(Coffee coffee) {
		this.coffee = coffee;
	} 
	
	@Override
	public void brewing() {
		coffee.brewing();
	}
	
}
