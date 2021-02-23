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
		
		//a.zip�� ������ copy.zip�� ����µ� �ɸ� �ð��� �����
		
		//�ð��� ������ؼ� �и��������� ������ ��
		long milliseconds = 0;
		
		
		//�󸶳� �ɸ����� üũ
		try(FileInputStream fis = new FileInputStream("a.zip");
				FileOutputStream fos = new FileOutputStream("copy.zip");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			
			milliseconds = System.currentTimeMillis(); //currentTimeMillis()�� �������� long ���̸�, 1/1000���� ���� �����Ѵ�. 
			
			int i;
			while((i = bis.read()) != -1) { //fis��� bis�� ����
				bos.write(i); //fos ��� bos�� ����
			}
			
			milliseconds = System.currentTimeMillis() - milliseconds;
			
			
		} catch(IOException e) {
			System.out.println(e);
		}
		
		/*
		//������Ʈ���� ��ݽ�Ʈ���� ���δ°� �ƴ϶� �Ǵٸ� ������Ʈ���� ���Ѵ�.
		//���� ������ ���ٰ� �ϸ�
		Socket socket = new Socket();
		//socket.getInputStream�ȿ� ä�ñ���� �������� �ѱ��� �־�� �ϴϱ� InputStreamReader�� ���ΰ� �� �ȿ�
		//���� �� ���۸� ��ɱ��� ���������� BufferedReader�� ���Ѵ�.
		//��������� ��ǲ��Ʈ�� ���¿��� Reader�� ���μ� �ѱ۷� ä���� �а� �ϰ� �ٽ� ���۸����� �ؼ� ���� ������ �а� �Ѵ�.
		BufferedReader isr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		//���� ��Ʈ���� ��� ���θ鼭 ����� �߰��ǰ� �ִ� => ���ڷ����� ����
		//�̰��� ������� �����ϸ� ������ ����������.
		*/
		
		System.out.println("�ð� : " + milliseconds);
		//404111��� ���� ��������� 404.111�ʰ� ����
		//Buffered input�� output�� �ְ� �ð��� �缭 344�� ���� 0.344�ʰ� �ɸ�
	}

}
