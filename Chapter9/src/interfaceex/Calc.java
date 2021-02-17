package interfaceex;

//class가 아니고 interface가 들어간다.
public interface Calc {
	
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2); 
	int substract(int num1, int num2); 
	int times(int num1, int num2);
	int divide(int num1, int num2);

	//메소드를 선언 할 수 있을때 반환값, 함수의 이름, 함수의 매개변수까지 선언하는것을 함수의 시그니처라고 한다.
	//함수의 요소를 선언할 수 있다는 것은 어떤 매개변수를 받아서 어떤 구현을 해서 어떤 반환을 해야할지 머리속에 있는것
	//그래서 설계가 중요한 이유
	//public String stringAdd( String s1, String s2);
}
