package p99codingbat.String3;

public class sumDigits {
	public static void main(String[] args) {
		System.out.println(a("aa1bc2d3"));
	}
	
	public static int a(String str) {
		  int sum = 0;
		  for (int i = 0; i < str.length(); i++) {
		    if (Character.isDigit(str.charAt(i))) {
		      sum += Character.getNumericValue(str.charAt(i));
		    }
		  }
		  return sum;
		}

}
