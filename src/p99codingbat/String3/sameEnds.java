package p99codingbat.String3;

public class sameEnds {
	public static void main(String[] args) {
		String string = "abXYab";
		String answer = "";
		int len = string.length();
		  for(int i = 1; i <= len/2; i++){
		    if (string.substring(0,i).equals(string.substring(len-i, len))) {
		      answer = string.substring(0,i);
		      System.out.println(string.substring(0,i));
		      System.out.println(answer);
		    }
		  }
		  System.out.println(answer);
	}
}
