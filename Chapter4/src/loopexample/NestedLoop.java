package loopexample;

public class NestedLoop {

	public static void main(String[] args) {
		int dan;
		int count;
		
		System.out.println("if¹®");
		
		for (dan = 2; dan <= 9; dan++) {	
			for(count = 1; count <= 9; count++) {	
				System.out.println(dan + "X" + count + " = " + dan*count);	
			}
			System.out.println("----------");
		}
		
		System.out.println("while¹®");
		
		int dan_w;
		int count_w;
		
		dan_w = 2;
		
		while (dan_w <= 9 ) {
			
			count_w = 1;
			while(count_w <= 9) {
				System.out.println(dan_w + "X" + count_w + " = " + dan_w*count_w);	
				count_w++;
			}
			dan_w++;
			System.out.println("----------");
		}
	}
}
