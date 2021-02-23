package stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		
		//a.zip을 복사해 copy.zip을 만드는데 걸린 시간을 출력함
		
		//시간을 재기위해서 밀리세컨즈라는 변수를 둠
		long milliseconds = 0;
		
		
		//얼마나 걸리는지 체크
		try(FileInputStream fis = new FileInputStream("a.zip");
				FileOutputStream fos = new FileOutputStream("copy.zip");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			
			milliseconds = System.currentTimeMillis(); //currentTimeMillis()의 리턴형은 long 값이며, 1/1000초의 값을 리턴한다. 
			
			int i;
			while((i = bis.read()) != -1) { //fis대신 bis를 넣음
				bos.write(i); //fos 대신 bos를 넣음
			}
			
			milliseconds = System.currentTimeMillis() - milliseconds;
			
			
		} catch(IOException e) {
			System.out.println(e);
		}
		
		/*
		//보조스트림은 기반스트림만 감싸는게 아니라 또다른 보조스트림도 감싼다.
		//가령 소켓을 썻다고 하면
		Socket socket = new Socket();
		//socket.getInputStream안에 채팅기능을 넣으려면 한글을 넣어야 하니까 InputStreamReader를 감싸고 그 안에
		//읽을 때 버퍼링 기능까지 가져오도록 BufferedReader로 감싼다.
		//결론적으로 인풋스트림 상태에서 Reader로 감싸서 한글로 채팅을 읽게 하고 다시 버퍼링으로 해서 좀더 빠르게 읽게 한다.
		BufferedReader isr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		//보조 스트림이 계속 감싸면서 기능이 추가되고 있다 => 데코레이터 패턴
		//이것을 상속으로 구현하면 굉장히 복잡해진다.
		*/
		
		System.out.println("시간 : " + milliseconds);
		//404111라고 나옴 결론적으로 404.111초가 나옴
		//Buffered input과 output을 넣고 시간을 재서 344가 나옴 0.344초가 걸림
	}

}
