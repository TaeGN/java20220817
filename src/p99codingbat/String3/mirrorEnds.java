package p99codingbat.String3;

public class mirrorEnds {
	public static void main(String[] args) {
		String string = "abXYZba";
		String answer = "";
		String r = "";
		
		for(int i = 0; i <= string.length()/2; i++) {
			for(int j = string.substring(0,i).length()-1; j >= 0; j++) {
				r += string.substring(0,i).charAt(j);
			}
			if(string.substring(string.length()-i, string.length()).equals(r)) {
				answer = string.substring(0, i);
			}
		}
		
		System.out.println(answer);
	}

//	private static String MirrorEnds(String str) {
//		String r = "";
//		for(int i = str.length()-1; i >= 0; i--) {
//			r += str.charAt(i);
//		}
//		System.out.println(r);
//		return r;
//	}
}
