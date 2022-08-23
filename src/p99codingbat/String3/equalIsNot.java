package p99codingbat.String3;

public class equalIsNot {
	public static void main(String[] args) {
		System.out.println(equalIsNot("This is not"));
	}

	public static boolean equalIsNot(String str) {
		int countIs = 0;
		int countNot = 0;

		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 2).equals("is") || str.substring(str.length() - 2, str.length()).equals("is")) {
				countIs++;
			}
			if (str.substring(i, i + 3).equals("not")) {
				countNot++;
			}
		}
		System.out.println(countIs);
		System.out.println(countNot);
		return countIs == countNot;
	}
}
