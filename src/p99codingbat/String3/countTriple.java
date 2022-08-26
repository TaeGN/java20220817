package p99codingbat.String3;

public class countTriple {
	public static void main(String[] args) {
		
	}
	
	public static int countTriple(String str) {
		  int count = 0;
		  if (str.length()>2) {
		    for (int i = 0; i < str.length()-2; i++) {
		      if (str.charAt(i) == str.charAt(i+1)) {
		        if (str.charAt(i) == str.charAt(i+2)) {
		          count++;
		        }
		      }
		    }
		  }
		  return count;
		}

}
