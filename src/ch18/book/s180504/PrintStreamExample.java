package ch18.book.s180504;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
	public static void main(String[] args) {
		
		try (
				FileOutputStream fos = new FileOutputStream("C:\\Users\\user\\Desktop\\output\\file2.txt");
				PrintStream ps = new PrintStream(fos);){
			
			ps.println("[프린터 보조 스트림]");
			ps.print("마치 ");
			ps.print("프린터가 출력하는 것처럼 ");
			ps.println("데이터를 출력합니다.");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
