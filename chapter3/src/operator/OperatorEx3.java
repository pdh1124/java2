package operator;

public class OperatorEx3 {

	public static void main(String[] args) {
		
		int score = 100;
		
		System.out.println(++score); //101
		//score = score +1;
		//score += 1;
		
		System.out.println(score++); //101
		
		System.out.println(score); //102 : score++은 연산 후 ++하기 때문에(-도 동일)
	}
}
