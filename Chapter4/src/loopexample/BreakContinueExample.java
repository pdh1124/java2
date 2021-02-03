package loopexample;

public class BreakContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		for (num = 0; num <= 20; num++) {	
			
			if(num == 8) {
				System.out.println("스킵되었습니다.");
				continue;
			}
			
			if(num == 18) {
				System.out.println("중단되었습니다.");
				break;
			}
			System.out.println(num);
			
		}
		
		System.out.println("continue와 break 사용");
		
	}

}
