package ch16.book.s161103;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import ch16.book.s161101.Student;

public class GroupingByExample {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("홍길동", 10, Student.Sex.MALE, Student.City.Seoul),
				new Student("김수애", 6, Student.Sex.FEMALE, Student.City.Pusan),
				new Student("신용권", 10, Student.Sex.MALE, Student.City.Pusan),
				new Student("박수미", 6, Student.Sex.FEMALE, Student.City.Seoul)
				);
		
		Map<Student.Sex, List<Student>> mapBySex = totalList.stream()
				.collect(Collectors.groupingBy(Student :: getSex)); 
		
		
	}
}
