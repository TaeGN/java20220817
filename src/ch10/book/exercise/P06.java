package ch10.book.exercise;

public class P06 {
	public static void main(String[] args) {
		String[] strArray = {"10", "2a"};
		int value = 0;
		for (int i = 0; i <= 2; i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				System.out.println("인덱스 초과");
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("숫자변환 불가");
			} finally {
				System.out.println(value);
			}
		}
	}
}
