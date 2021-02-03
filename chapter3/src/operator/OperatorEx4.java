package operator;

public class OperatorEx4 {

	public static void main(String[] args) {
		
		// 비트연산자 : 실행속도가 빠르다.
		
		// 연산자 : 설명 : 예시
		
		// ~ : 비트의 반전 (1의 보수) : a = ~a;
		// & : 비트 단위 AND : 1&1 1반환 그 외는 0
		// | : 비트 단위 OR : 0|0 0반환 그 외는 1
		// ^ : 비트 단위XOR : 두개의 비트가 서로 다른 경우에 1을 반환
		// << : 왼쪽 shift : a<<2 변수 a를 2비트 만큼 왼쪽으로 이동
		// >> : 오른쪽 shift : a>>2 변수 a를 2비트 만큼 오른쪽으로 이동
		// >>> : 오른쪽 shift : >>동일한 연산 - 채워지는 비트가 부호와 상관 없이 0임
		
		int num1 = 0B00001010; //10
		int num2 = 0B00000101; //5
		
		System.out.println(num1 & num2);
		System.out.println(num1 | num2);
		System.out.println(num1 ^ num2);
		
		System.out.println(num2 << 3); //이진법 00000101을 1을 왼쪽으로 3칸 민다. => 00101000
		System.out.println(num2 >> 2); //이진법 00000101을 1을 우측으로 2칸 민다. 앞에 경우 밖으로 밀리게 되면 제외됨 => 00000001 
	}
}
