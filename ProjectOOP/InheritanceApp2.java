
class Cal2{
	int v1;
	int v2;
	//생성자
	Cal2(int v1, int v2){
		System.out.println("Cal init!!");
		this.v1 = v1;
		this.v2 = v2;
	}
	public int sum() {
		return this.v1+v2;
	}
}

class Cal4 extends Cal2 {

	Cal4(int v1, int v2) {
		super(v1, v2); //부모 클래스의 생성자를 만들어 반드시 호출해야 한다.
		System.out.println("Cal4 init!!");
	}
	public int minus() {
		return this.v1-v2;
	}
}

public class InheritanceApp2 {

	public static void main(String[] args) {
		Cal2 c2 = new Cal2(2,1);
		Cal4 c4 = new Cal4(3,4);
		System.out.println(c4.sum());  //7 => 위 코드에 3과 7을 넣었기 때문에
		System.out.println(c4.minus()); //-1 
	}
}
