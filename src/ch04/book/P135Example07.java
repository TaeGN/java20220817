package ch04.book;

import java.util.Scanner;

public class P135Example07 {
	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		int money = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		a : while(run) {
			System.out.println("----------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------");
			System.out.print("선택>");
			balance = scanner.nextInt();
			
			switch(balance) {
			case 1:
				System.out.print("예금액>");
				money += scanner.nextInt();
				break;
			case 2:
				System.out.print("출금액>");
				money -= scanner.nextInt();
				break;
			case 3:
				System.out.println("잔고>" + money);
				break;
			case 4:			
				break a;
			default:
				System.out.println("다시 입력해 주세요");
				break;					
			}
			System.out.println();
		}
		System.out.print("\n프로그램 종료!!!");
	}
}
