package loopexample;

public class BrackContinueTest {

	public static void main(String[] args) {
		// ¦�� �ܰ�, �ܰ� ������ ���� �ʵ��� ����ϱ�
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
