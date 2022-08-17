package ch02.book;

public class P37VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2 = v1 - 10;
		}
//		int v3 = v1 + v2 + 5; // 컴파일 에러 발생 (v2)
	}
}
