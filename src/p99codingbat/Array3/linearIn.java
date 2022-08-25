package p99codingbat.Array3;

public class linearIn {
	public static void main(String[] args) {
		
	}
	
	public boolean linearIn(int[] outer, int[] inner) {
		  int j = 0;
		  for (int i = 0; i < inner.length; i++) {
		    j = 0;
		    while (outer[j] < inner[i] && j < (outer.length-1)) {
		        j++;
		      }
		      if (outer[j] != inner[i]) {
		        return false;
		      }
		  }
		  return true;
		}

}
