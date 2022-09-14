package ch12.book;

public class ThreadExample {
	public static void main(String[] args) {
		Thread thread1 = new MovieThread();
		
		Thread thread2 = new Thread(() ->  {
			for(int i = 0; i < 5; i++) {
				System.out.println("음악을 재생합니다.");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		thread1.start();
		thread2.start();
	}
}
