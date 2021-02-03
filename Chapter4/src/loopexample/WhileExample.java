package loopexample;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		int sum = 0;
		
		while(num <= 10) { // while(ture)라고 하면 무한 루프가 됨
			System.out.println(sum);
			System.out.println(num);
			sum += num;
			System.out.println(sum);
			System.out.println(num);
			num++;
			System.out.println(sum);
			System.out.println(num);
			System.out.println("----------");
		}
		
		Scanner scanner = new Scanner(System.in);
		int input;
		int sum_in = 0;
		input = scanner.nextInt();
		while (input != 0) {
			sum_in += input;
			input = scanner.nextInt();
		}
		
		System.out.println(sum);
	}
}