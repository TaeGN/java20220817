package p99codingbat.Array3;

public class fix45 {
	public static void main(String[] args) {
		
	}
	
	public int[] fix45(int[] nums) {
		  int n1 = 0;
		  int n2 = 0;
		  int[] val = new int[nums.length];
		  int[] pos = new int[nums.length];
		  for (int i = 0; i < nums.length; i++) {
		    if (nums[i] == 4) {
		      if (nums[i+1] != 5) {
		        val[n1] = nums[i+1];
		        nums[i+1] = 5;
		        n1++;
		      }
		    }
		    if (nums[i] == 5) {
		        if (i == 0 || nums[i-1] != 4) {
		          pos[n2] = i;
		          n2++;
		        }
		      }
		  }
		  for (int i = 0; i < n1; i++) {
		    nums[pos[i]] = val[i];
		  }
		  return nums;
		}

}
