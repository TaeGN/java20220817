package p99codingbat.Array2;

public class sum67 {
	public static void main(String[] args) {
		System.out.println(sum67(new int[] {1, 2, 2}));
		n System.out.println(sum67(new int[] {1, 2, 2, 6, 99, 99, 7}));
		System.out.println(sum67(new int[] {1, 6, 2, 2, 7, 1, 6, 99, 99, 7}));
		
	}
	
	public static int sum67(int[] nums) {
		  int sum = 0;
		  for (int i = 0; i < nums.length; i++) {
		    if (nums[i] == 6) {
		      while (nums[i]!=7) {
		        i++;
		      }
		      sum -= 7;
		    }
		    sum += nums[i];
		  }
		  return sum;
		}

}
