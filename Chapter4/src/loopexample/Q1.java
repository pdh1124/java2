package loopexample;

public class Q1 {

	public static void main(String[] args) {
		// 1. 다이아몬드를 출력하기
		int fullLine = 15;
		int line = fullLine/2 + 1;
		int star = 1;
		int line2 = line;
		
		for(int k =0; k < line; k++) {
			for(int i = 0; i < line2; i++) {
				System.out.print(" ");
			}
			for(int j = 0; j < star; j++) {
				System.out.print("*");
			}
			line2--;
			star+=2;
			System.out.println();
		}
		for(int k = 0; k < line-1; k++) {
			for(int i = line2 + 2; i > 0; i--) {
				System.out.print(" ");
			}
			for(int j = star - 4; j > 0; j--) {
				System.out.print("*");
			}
			line2++;
			star-=2;
			System.out.println();
		}
	}
}
