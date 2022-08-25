package ch05.book.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		int max = 0;
		int min = 0;
		int sum = 0;
		double avg = 0.0;
		
		while(run) {
			System.out.println("------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			switch(selectNo) {
			case 1:
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				break;
				
			case 2:
				System.out.println("점수입력> ");
				scores = new int[studentNum];			
				for (int i = 0; i < studentNum; i++) {
					System.out.print("scores["+ i + "]>");
					scores[i] = scanner.nextInt(); 
				}
				break;
				
			case 3:
				System.out.println("점수리스트> ");
				for (int i = 0; i < studentNum; i++) {
					System.out.println("scores[" + i + "] : " + scores[i]);
				}
//				System.out.println(Arrays.toString(scores));
				break;
				
			case 4:
				System.out.println("분석> ");
				min = scores[0];
				for (int i = 0; i < studentNum; i++) {
					if (scores[i] > max) {
						max = scores[i];
					}
					
					if (scores[i] < min) {
						min = scores[i];
					}
					sum += scores[i]; 
				}
				avg = sum / studentNum;
				System.out.println("최고 점수 : " + max);
				System.out.println("최저 점수 : " + min);
				System.out.println("평균 점수 : " + avg);
				break;
				
			case 5:
				run = false;
				break;
				
			default:
				System.out.println("다시 입력해주세요");
				break;
			}
			
			System.out.println();
				
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
}
