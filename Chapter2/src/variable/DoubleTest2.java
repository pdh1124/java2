package variable;

public class DoubleTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//중복되는 연산
		double dNum = 1;
		
		for (int i = 0; i < 10000; i++) {
			
			dNum = dNum + 0.1;
			
		}
		
		System.out.println(dNum);
		//1001이라고 나오지 않는다. 부동소수점 오차범위
		
		
//		
//		var i = 10;
//		System.out.println(i);
	}

}
