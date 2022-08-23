package p99codingbat.String3;

public class countYZ {
	public static void main(String[] args) {
		int a = countYZ("fez day");
		System.out.println(a);
	}
	
	public static int countYZ(String str) {
		  int count = 0;
		  char alp = 0;
		 for (int i = 0; i < str.length(); i++) {
		   alp = str.charAt(i); 
		   switch(alp) {
		    case 'y':
		    case 'Y':
		    case 'z':
		    case 'Z':
		      if (i == str.length()-1) {
		        count++;
		        break;
		      } else if (!Character.isLetter(str.charAt(i+1))) {
		        count++;
		        break;
		      }
		    default:
		      break;
		      
		   }
		 }
		 return count;
		}
}
