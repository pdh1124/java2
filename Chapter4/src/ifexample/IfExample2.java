package ifexample;

import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in); //입출력 받는 방식
		
		int age = scanner.nextInt();
		
		int charge = 0;
		
		if (age < 8) {
			charge = 1000;
		}
		else if (age < 14) {
			charge = 1500;
		}
		else if (age < 20) {
			charge = 2000;
		}
		else {
			charge = 3000;
		}
		
		System.out.println("나이 : " + age + " 세");
		System.out.println("요즘 : " + charge + " 원");
		
		
	}
	
	

}
