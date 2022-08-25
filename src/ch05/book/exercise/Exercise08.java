package ch05.book.exercise;

public class Exercise08 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83 ,92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int len = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				len++;
			}
		}
		
		int sum2 = 0;
		for (int[] arr : array) {
			for (int ar : arr) {
				sum2 += ar;
			}
		}
		
		avg = (double) sum / len; 
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		System.out.println("sum2 : " + sum2);
	}
}
