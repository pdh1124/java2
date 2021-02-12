import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] args) throws IOException {
		
		//class : System, Math, FileWriter
		//instance : f1이 가르키고 있는값, f2가 가르키고 있는 값
		
		System.out.println(Math.PI);
		//Math라는 클래스를 바로 사용하고
		System.out.println(Math.floor(1.75)); //내림
		System.out.println(Math.ceil(1.42)); //올림
		//Math.PI나 Math.floor 같은 클래스는 내부적으로 어떤 상태를 계속 유지할 필요가 없다.
		//그냥 필요할때마다 쓰는 1회용 같은 클래스
		//이렇게 1회용으로 쓰는 클래스는 클래스는 있는 그대로 사용하면 됨 
		
		
		
		//어떤 정보를 파일에 기록할때 쓰는 클래스
		FileWriter f1 = new FileWriter("data.txt");
		//fileWriter는 new를 붙여서 f1이라는 변수에 담기는 복제본을 만들어서 
		f1.write("Hello");
		f1.write(" Java");
		
		FileWriter f2 = new FileWriter("data2.txt");
		f2.write("Hello");
		f2.write(" Java2");
		f2.close();
		
		f1.write("!!!");
		f1.close(); //close 
		
		//FileWriter라는 클래스는 작업했던거 처럼 f1.write("Hello"); 이나	f1.write(" Java"); 처럼 여러번 작업을 하기 위해
		//FileWriter f1 = new FileWriter("data.txt");로 인스턴스로 만들어 사용
		//클래스를 직접 사용하는게 아니라 복재본을 만들어서 제어한다.
	}

}
