package ch15.book.exercise.p10;

public class Student implements Comparable<Student>{
	public String id;
	public int score;
	
	public Student(String id, int score) {
		super();
		this.id = id;
		this.score = score;
	}
	
	@Override
	public int compareTo(Student o) {

		return this.score - o.score;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + score;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (score != other.score)
			return false;
		return true;
	}
	
	
}
