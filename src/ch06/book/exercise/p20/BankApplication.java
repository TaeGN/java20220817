package ch06.book.exercise.p20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int num = 0;
	
	public static void main(String[] args) {
				
		boolean run = true;
		
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			switch(selectNo) {
				case 1:
					createAccount();
					break;
				case 2:
					accountList();
					break;
				case 3:
					deposit();
					break;
				case 4:
					withdraw();
					break;
				case 5:
					run = false;
					break;
				default:
					System.out.println("숫자를 다시 입력해 주세요");
					System.out.println();
					break;					
			}
			
		}	
		System.out.println("프로그램 종료");
	}
	
	private static void withdraw() {
		String ano;
		int balance;
		// TODO Auto-generated method stub
		System.out.println("-----------");
		System.out.println("출금");
		System.out.println("-----------");
		System.out.print("계좌번호 : ");
		ano = scanner.next();
		System.out.print("출금액 : ");
		balance = scanner.nextInt();
		if((findAccount(ano).getBalance() - balance) < 0) {
			System.out.println("잔액부족 : 출금이 실패하였습니다.");
			System.out.println("현재잔액 : " + findAccount(ano).getBalance());	
			return;
		}
		findAccount(ano).setBalance(findAccount(ano).getBalance() - balance);
		System.out.println("결과 : 출금이 성공되었습니다.");
		
	}

	private static void deposit() {
		String ano;
		int balance;
		// TODO Auto-generated method stub
		System.out.println("-----------");
		System.out.println("예금");
		System.out.println("-----------");
		System.out.print("계좌번호 : ");
		ano = scanner.next();
		System.out.print("예금액 : ");
		balance = scanner.nextInt();
		findAccount(ano).setBalance(findAccount(ano).getBalance() + balance);
		System.out.println("결과 : 예금이 성공되었습니다.");
	}

	private static void accountList() {
		// TODO Auto-generated method stub
		System.out.println("-----------");
		System.out.println("계좌목록");
		System.out.println("-----------");
		for(int i = 0; i < num; i++) {
			System.out.println(accountArray[i].getAno() + "   " + accountArray[i].getOwner() + "   " + accountArray[i].getBalance());
		}
		
	}

	private static void createAccount() {		
		String ano;
		String owner;
		int balance;
		
		System.out.println("-----------");
		System.out.println("계좌생성");
		System.out.println("-----------");
		System.out.print("계좌번호 : ");
		ano = scanner.next();
		
		System.out.print("계좌주 : ");
		owner = scanner.next();
		
		System.out.print("초기입금액 : ");
		balance = scanner.nextInt();
		
		accountArray[num] = new Account(ano, owner, balance); 
		System.out.println("결과 : 계좌가 생성되었습니다.");
		num++;
		
	}
	
	private static Account findAccount(String ano) {
		Account temp = null;
		for(int i = 0; i < num; i++) {
			if(accountArray[i].getAno().equals(ano)) {
				temp = accountArray[i];
			} else {
				System.out.println("계좌번호가 존재하지 않습니다.");
			}
		}
		return temp;
	}
	
	
}
