package ch15.book.s150402;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<>();
		
		map.put("fesfse","324314");
		map.put("fesf2e", "123142");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디 & 비밀번호");
			System.out.print("id : ");
			String id = scanner.nextLine();
			
			System.out.print("password : ");
			String password = scanner.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("login");
					break;
				} else {
					System.out.println("password 불일치");
				}
			} else {
				System.out.println("id 불일치");
			}
			System.out.println("-----------------------");
		}
	}
}
