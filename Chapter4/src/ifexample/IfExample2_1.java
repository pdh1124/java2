package ifexample;

import java.util.Scanner;

public class IfExample2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int score = 75;
		
		String rank;
		
		if (score > 89) {
			rank = "A";
		}
		else if (score > 79) {
			rank = "B";
		}
		else if (score > 69) {
			rank = "C";
		}
		else if (score > 59) {
			rank = "D";
		}
		else {
			rank = "F";
		}
		
		System.out.println("점수 : " + score + "점");
		System.out.println("등급 : " + rank);
		
		
		int a = 20;
		int b = 10;
		
		int max;
		
		max = (a < b) ? a : b;
		System.out.println(max);
	}

}
