package p99codingbat.Array2;

public class has22 {
 public static void main(String[] args) {
	
}
 
 public boolean has22(int[] nums) {
	  boolean tf= false;
	  for(int i = 0; i < nums.length-1; i++) {
	    if (nums[i] == 2) {
	      if (nums[i+1] == 2) {
	        tf = true; 
	      }
	    }
	  }
	  return tf;
	}

}
