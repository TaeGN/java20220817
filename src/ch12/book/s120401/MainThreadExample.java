package ch12.book.s120401;

public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.setPriority(1);
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.setPriority(10);
		
		user1.start();
		user2.start();
	}
}
