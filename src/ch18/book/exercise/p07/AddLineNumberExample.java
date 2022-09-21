package ch18.book.exercise.p07;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		String filepath = "src/ch18/book/exercise/p07/AddLineNumberExample.java";
		
		FileReader fr = new FileReader(filepath);
		BufferedReader br = new BufferedReader(fr);
		
		String line = "";
		int count = 0;
		
		while((line = br.readLine()) != null) {
			count++;
			System.out.println(count + ". " + line);
			
		}

		
		fr.close();
		br.close();
	}
}
