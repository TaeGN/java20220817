package ch14.book.exercise.p06;

import java.util.function.ToIntFunction;

public class LambdaExample {
	private static Student[] students = {
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
	};
	
	public static void main(String[] args) {
		double englishAvg = avg( s -> s.getEnglishScore());
		System.out.println("영어 평균 점수: " + englishAvg);
		double mathAvg = avg( s -> s.getMathScore());
		System.out.println("수학 평균 점수: " + mathAvg);
	}


	
	private static double avg(ToIntFunction<ch07.book.s0703.Student> function) {
		// TODO Auto-generated method stub
		double sum = 0.0;
		for (Student student : students) {
			sum += function.applyAsInt(student);
		}
		return sum / students.length;
	}



	public static class Student {
		private String name;
		private int englishScore;
		private int mathScore;
		
		public Student(String name, int englishScore, int mathScore) {
			this.name = name;
			this.englishScore = englishScore;
			this.mathScore = mathScore;
		}
		
		public String getName() {return name;}

		public int getEnglishScore() {
			return englishScore;
		}

		public int getMathScore() {
			return mathScore;
		}

	}
}
