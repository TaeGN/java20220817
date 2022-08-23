package p99codingbat.String3;

public class withoutString {
	public static void main(String[] args) {
		System.out.println(withoutString("Hello there", "llo"));
	}
	
	public static String withoutString(String base, String remove) {
		  String newb = "";
		  newb = base.replace(remove,"");
		  newb = newb.replace(remove.toLowerCase(),"");
		  newb = newb.replace(remove.toUpperCase(),"");
		  return newb;
	}
}
