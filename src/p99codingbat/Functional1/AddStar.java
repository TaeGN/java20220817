package p99codingbat.Functional1;

import java.util.Arrays;
import java.util.List;

public class AddStar {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("a", "bb", "ccc")
	}
	
	public static List<String> addStar(List<String> strings) {
		  return strings.stream()
		    .map(e -> e + "*")
		    .collect(Collectors.toList());
		}

}
