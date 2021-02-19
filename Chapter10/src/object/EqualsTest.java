package object;

class Student {
	int studentNum; //학번
	String studentName; //학생 이름
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}

	
	//같은 학번이면 같은 논리적인 동일성을 확인함
	@Override
	public boolean equals(Object obj) {
		//return super.equals(obj);
		if( obj instanceof Student) { //매개변수로 받는 obj가 student인가 확인하기
			Student std = (Student)obj;
			//return (this.studentNum == std.studentNum);
			
			if(this.studentNum == std.studentNum) {
				return true;
			}
			else {
				return false;
			}
		}
		return false; //매개변수로 받는 obj가 student가 아니라면 무조건 false
	}

	
	//equals와 hashCode를 같이 쓸때가 많은데
	//equals에 쓴 것을 사용하면 됨
	@Override
	public int hashCode() {
		return studentNum;
	}
	
	
	
	
}

public class EqualsTest {

	public static void main(String[] args) {
		
		Student Lee = new Student(100, "이순신");
		Student Lee2 = Lee;
		Student Shin = new Student(100, "이순신");
		
		System.out.println(Lee == Lee2); //true : 당연히 같은 것
		System.out.println(Lee == Shin); //false  : 인스턴스 주소가 다르기 때문
		
		System.out.println(Lee.equals(Shin));
		
		System.out.println("======================");
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		// == 등호가 2개 쓰인것은 메모리주소가 같은 가를 물어보는 것
		System.out.println(str1 == str2);
		
		// 두개의 문자열을 같은가를 비교한다.
		System.out.println(str1.equals(str2));
		
		
		System.out.println("======================");
	
		//hashCode() 메소드
		System.out.println(Lee);
		System.out.println(Lee.hashCode());
		System.out.println(Lee2.hashCode());
		System.out.println(Shin.hashCode());
		
		
		System.out.println("======================");
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);

		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		
		//실제 메모리 확인법
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
		
	}

}
