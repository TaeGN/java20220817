package ch18.book.exercise.p11;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientExample {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 5001);
		OutputStream os = socket.getOutputStream();
		
		String filePath = "C:\\Users\\user\\Desktop\\output\\moon.jpg";
		File file = new File(filePath);
		
		String fileName = file.getName();
		os.write(fileName.getBytes());
		
		byte[] bytes = new byte[1000];
		
		System.out.println("[파일 보내기 시작] " + fileName);
		FileInputStream fis = new FileInputStream(filePath);
		int len = 0;
		while((len = fis.read(bytes)) != -1) {
			os.write(bytes, 0, len);
		}
		
		os.flush();
		System.out.println("[파일 보내기 완료]");
		
		fis.close();
		os.close();
		socket.close();
	}
}
