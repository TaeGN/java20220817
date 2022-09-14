package ch12.book;

public class BeepPrintExample4 {
	public static void main(String[] args) {
		Thread thread1 = new BeepThread1();
		Thread thread2 = new BeepThread2();
		
		thread1.start();
		thread2.start();
	}
}
