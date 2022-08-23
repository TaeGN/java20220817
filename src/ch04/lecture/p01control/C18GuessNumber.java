package ch04.lecture.p01control;

// ctrl + shift + o : import 추가
import java.util.Scanner;

public class C18GuessNumber {

	public static void main(String[] args) {
		// 1~100
		// 사용자 입력과 비교
		Scanner scanner = new Scanner(System.in);
		
		int rn = (int) (Math.random()*100) + 1;
		System.out.print("숫자를 입력해 주세요(1~100) : ");
		int user = scanner.nextInt();
		
//		System.out.println("" + rn);
		while (!(rn == user)) {	
			
			if (rn > user) {
				System.out.print(user + "보다 더 큰 값을 입력해 주세요 : ");				
			} else {
				System.out.print(user + "보다 더 작은 값을 입력해 주세요 : ");
			}
			user = scanner.nextInt();
		}
		
		System.out.println("정답입니다 : " + user);
	}
}
