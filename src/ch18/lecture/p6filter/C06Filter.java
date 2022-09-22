package ch18.lecture.p6filter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class C06Filter {
	public static void main(String[] args) throws Exception {
		String name = "C:\\Users\\user\\Desktop\\output\\output12.txt";
		FileInputStream fis = new FileInputStream(name);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
//		int len = 0;
//		char[] a = new char[100];
		
//		while((len = br.read(a)) != -1) {
//			System.out.print(a);
//		}
		
		String line = "";
		int count = 0;
		
		while((line = br.readLine()) != null) {
			count++;
			System.out.println(count + ". " + line);
		}
		
		
		
		fis.close();
		isr.close();
		br.close();
	}
}
