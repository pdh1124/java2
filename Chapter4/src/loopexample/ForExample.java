package loopexample;

public class ForExample {

	public static void main(String[] args) {
		int count;
		int sum = 0;
		
		for(count = 1; count <= 10; count++) { // for(;;)가 무한 루프 = while(ture)	
			sum += count;			
		}
		
		System.out.println(sum);
		
		int num =1;
		int total = 0;
		
		while (num <= 10) {
			total += num;
			num++;
		}
		
		System.out.println(total);
	}
	
	/*
	while문
	수행 : 조건이 참인 동안 반복 수행 조건이 맞지 않으면 수행되는 부분이 없음
	쓰임 : 조건식의 결과나 변수가 true,false ㅏㄱㅄ인 경우 주로 사용
	
	do-while문
	수행 : 조건이 참인 동안 반복 수행, 수행문을 먼저 수행하고 조건 체크
	쓰임 : 조건식의 결과나 변수가 true,false값인 경우 주로 사용
	
	for문
	수행 : 초기화, 조건체크, 증감 순으로 수행
	쓰임 : 특정 수의 범위, 횟수와 관련하여 반복되는 경우 주로 사용, 배열과 함께 많이 사용됨
	
	 
	 
	 */
	
	
}
