package CodingTestExample;

public class C02 {
	public static void main(String[] args) {
		int x = 2;
		int n = 5;
		long[] answer = {};
		for (int i = 0; i < n; i++) {
			answer[i] = x*(i+1);
		}
		System.out.println(answer);
	}

}
