package ifexample;

import java.util.Scanner;

public class SwitchCaseEx_1 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in); //입출력 받는 방식
		
		int mon = scanner.nextInt();
		int day;
		
		
		switch(mon) {
			case 1: day = 31;
				break;
			case 2: day = 28;
				break;
			case 3: day = 31;
				break;
			case 4: day = 30;
				break;
			case 5: day = 31;
				break;
			case 6: day = 30;
				break;
			case 7: day = 31;
				break;
			case 8: day = 31;
				break;
			case 9: day = 30;
				break;
			case 10: day = 31;
				break;
			case 11: day = 30;
				break;
			case 12: day = 31;
				break;
			default: 
				System.out.println("Error");
				day = 0;
		}
		
		System.out.println(mon + "월은 " + day + "일까지 있습니다.");
		
		
		
		
	}

}
