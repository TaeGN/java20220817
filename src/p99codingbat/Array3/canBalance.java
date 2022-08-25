package p99codingbat.Array3;

public class canBalance {
	public static void main(String[] args) {
		
	}
	
	public static boolean canBalance(int[] nums) {
		  int sum = 0;
		  int half = 0;
		  boolean tf = false;
		  for (int i = 0; i < nums.length; i++) {
		    sum += nums[i];
		  }
		  if (sum % 2 == 0) {
		    int i = 0;
		    while(half < (sum/2)) {
		      half += nums[i];
		      i++;
		    }
		    if (half == (sum/2)) {
		      tf = true;
		    }
		  }
		  return tf;
		}

}
