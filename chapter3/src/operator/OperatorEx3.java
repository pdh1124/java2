package operator;

public class OperatorEx3 {

	public static void main(String[] args) {
		
		int score = 100;
		
		System.out.println(++score); //101
		//score = score +1;
		//score += 1;
		
		System.out.println(score++); //101
		
		System.out.println(score); //102 : score++은 연산 후 ++하기 때문에(-도 동일)
		
		int num3 = 10;
		int i = 2;
		
		boolean value = ( (num3 = num3 + 10) < 10 ) && ((i = i+2) < 10);
		
		System.out.println(num3); //20
		System.out.println(i); //2 : 왜 4가 아닌 이유는 : 앞에 연산자가 20임으로 10보다 작은게 아니기 때문에 뒤에 연산을 할 필요가 없기 때문이다.
		
		System.out.println(value);
		
		int num4 = 10;
		int j = 2;
		
		boolean value2 = ( (num4 = num4 + 10) < 10 ) || ((j = j+2) < 10);
		
		System.out.println(num4); //20
		System.out.println(j); //4 : or연산자 임으로 num4연산이 아니여도 j연산을 하게 된다.
		
		System.out.println(value2);
		
		int num_1 = 10;
		int num_2 = 20;
		
		int max = (num_1 > num_2)? num_1:num_2; //둘중에 큰수를 가져오겠다.
		
		System.out.println(max);
		
		
	}
}
