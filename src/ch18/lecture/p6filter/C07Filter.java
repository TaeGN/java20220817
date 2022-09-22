package ch18.lecture.p6filter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class C07Filter {
	public static void main(String[] args) {
		String inputName = "C:\\Users\\user\\Desktop\\output\\output12.txt";
		String outputName = "C:\\Users\\user\\Desktop\\output\\output13.txt";
		
		try(
		FileInputStream fis = new FileInputStream(inputName);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		FileOutputStream fos = new FileOutputStream(outputName);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		) {
		String line = null;
		int count = 0;
		
		while((line = br.readLine()) != null) {
			count++;
			bw.write(count + ". " + line + "\n");
		}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
//		fis.close();
//		isr.close();
//		br.close();
//		fos.close();
//		osw.close();
//		bw.close();
		

		
		
		
	}
}
