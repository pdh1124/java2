package interfaceex;

//interface는 상속을 할때 extends가 아니고 implements가 된다.
public abstract class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}
	
	/* 이곳은 구현을 하지 않겠다고 하면 class 앞에 abstract를 넣어야 한다.
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
