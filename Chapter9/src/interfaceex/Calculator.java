package interfaceex;

//interface�� ����� �Ҷ� extends�� �ƴϰ� implements�� �ȴ�.
public abstract class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}
	
	/* �̰��� ������ ���� �ʰڴٰ� �ϸ� class �տ� abstract�� �־�� �Ѵ�.
	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}
	*/

}
