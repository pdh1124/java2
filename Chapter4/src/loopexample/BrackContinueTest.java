package loopexample;

public class BrackContinueTest {

	public static void main(String[] args) {
		// 짝수 단과, 단과 곱수가 넘지 않도록 계산하기
		int dan;
		int count;
		
		for(dan = 2; dan <= 20; dan++) {
			if ((dan % 2) != 0) {
				continue;
			}
			for(count = 1; count <= 20; count++) {
				if(count > dan) {
					break;
				}
				System.out.println(dan + "X" + count + " = " + dan*count);	
			}
			System.out.println("----------");
		}
	}

}
