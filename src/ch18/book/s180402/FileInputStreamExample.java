package ch18.book.s180402;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamExample {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
					"src/ch18/book/s180402/FileInputStreamExample.java");
			// 한글
			int data;
			while((data = fis.read()) != -1) {
				System.out.write(data);
			}
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
