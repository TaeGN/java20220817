package ch05.book.exercise;

public class Exercise07 {
	public static void main(String[] args) {
		int max1 = 0;
		int max2 = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max1) {
				max1 = array[i];
			}
		}
		
		// 향상된 for문
		for (int arr : array) {
			if (max2 < arr) {
				max2 = arr;
			}
		}
		
		System.out.println("max1 : " + max1);
		System.out.println("max2 : " + max2);
	}
}
