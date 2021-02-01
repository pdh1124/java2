package variable;

public class ExplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1000;
		byte bNum = (byte)i; //명시적 형 변환 => 데이터의 유실이 발생 할 수 있음
		
		System.out.println(bNum); //-24로 나옴 억지로 넣으면 데이터의 유실이 나옴
		
		double dNum1 = 1.2;
		float fNum = 0.9f;
		
		int iNum1 = (int)dNum1 + (int)fNum;
		int iNum2 = (int)(dNum1 + fNum);
		
		System.out.println(iNum1); //1 소수점 이하의 부분이 생략되서 1+0이 1
		System.out.println(iNum2); //2 더한 후 소수점 이하를 없애서 2.1이 2가 됨
	}

}
