package ch03.book;

public class P85InputDataCheckNaNExample {
	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance1 = 10000.0;
		
		currentBalance1 += val;
		
		System.out.println(currentBalance1);
		
		if (Double.isNaN(val)) {
			System.out.println("NaN이 입력되어 처리할 수 없음");
			val = 0.0;
		}
		
		double currentBalance2 = 10000.0;
		
		currentBalance2 += val;
		System.out.println(currentBalance2);
	}
}
