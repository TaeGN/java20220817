package ch18.book.s180502;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BufferedInputStreamExample {
	public static void main(String[] args) throws Exception {
		long start = 0;
		long end = 0;
		
		FileInputStream fis1 = new FileInputStream("C:\\Users\\user\\Desktop\\output\\output11.txt");
		start = System.currentTimeMillis();
		while(fis1.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("사용하지 않았을 때 : " + (end - start) + "ms");
		
		FileInputStream fis2 = new FileInputStream("C:\\Users\\user\\Desktop\\output\\output11.txt");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		while(bis.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("사용했을 때 : " + (end - start) + "ms");
		
		fis1.close();
		fis2.close();
		bis.close();
		
	}
}
