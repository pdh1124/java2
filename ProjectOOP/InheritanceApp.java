//예를들어 클래스 Cal이 수정할 수 없는 상태가 됨
//1. 많은 사람들이 쓰고 있거나
//2. 내가만든 클래스가 아니거나
//3. 자바 가지고 있는 내장되어 있는 클래스이거나

class Cal{
	public int sum(int v1,int v2) {
		return v1+v2;
	}
	//Overloading(세이브 파일명이 전부 똑같은 이름으로 되어있는 상태이지만 실제로는 세이브된 내용은 다름)
	public int sum(int v1,int v2, int v3) {
		return v1+v2+v3;
	}
}

//class Cal에 마이너스 기능을 넣고 싶다면 상속받은 클래스를 만들어 주면 됨
//Cal 클래스를 확장해서 Cal클래스가 가지고 있는 모든 메소드와 변수를 상속받게 되는 클래스 Cal3가 된다.
class Cal3 extends Cal {
	//어떻게 하면 자식 클래스가 부모클래스 가지고 있는 기능에 추가하거나 덮어쓰기 위해 사용
	//마이너스 기능 추가
	public int minus(int v1,int v2) {
		return v1-v2;
	}
	//Cal이 가지고 있는 sum이라는 기능인 sum을 수정할 수 있다. (오버라이딩(Overriding)이라고 함)
	//똑같은 형태의 메소드를 추가하고 수정함
	public int sum(int v1,int v2) {
		System.out.println("Cal3"); //구분을 위해
		return v1+v2;
	}
}

public class InheritanceApp {

	public static void main(String[] args) {
		Cal c = new Cal();
		System.out.println(c.sum(2, 1));
		System.out.println(c.sum(2, 1, 5));
		
		//클래스 Cal3에 상속받고 있는 클래스Cal있는 sum이라는 메소드를 사용할 수 있음
		Cal3 c3 = new Cal3();
		System.out.println(c3.sum(2,3));
		System.out.println(c3.minus(5,3));
		System.out.println(c3.sum(2,1));
	}
}
