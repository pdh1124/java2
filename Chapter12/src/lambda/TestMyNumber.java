package lambda;

public class TestMyNumber {

	public static void main(String[] args) {
		
		MyMaxNumber max = (x, y) -> (x >= y)? x: y;
		//x,y라는 매개변수 2개가 넘어 오는데 MyMaxNumber라는 인터페이스 메소드가 호출되면
		//getMaxNumber을 어떻게 구현 하느냐, 그런데 함수 이름은 안씀(익명) =>그렇기 때문에 메소드가 하나밖에 없어야 함
		//MyMaxNumber에 max라는 이름으로 구현된 애는 2개 변수가 넘어왔을때 둘중에서 더 큰놈을 반환 해 주어라
		
		System.out.println(max.getMaxNumber(10, 20 ));
	}

}
