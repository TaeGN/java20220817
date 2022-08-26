package ch06.book.s060802;

public class Car {
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas부족");
			return false;
		}
		System.out.println("gas남음");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달림" + gas);
				gas -= 1;
			} else {
				System.out.println("멈춤" + gas);
				return;
			}
		}
	}
}
