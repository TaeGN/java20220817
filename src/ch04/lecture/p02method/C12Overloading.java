package ch04.lecture.p02method;

public class C12Overloading {
	public static void main(String[] args) {
		double a = half(5.0); // 2.5
		System.out.println(a);
		
		double b = half(5);
		System.out.println(b);
	}
	
	public static double half(double x) {
		return x/2;
	}
	
	public static double half(int y) {
		return y/2;
	}
}
