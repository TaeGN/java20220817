package p99codingbat.Array3;

import java.util.Arrays;

//fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
//fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
//fix34([3, 2, 2, 4]) → [3, 4, 2, 2]

public class fix34 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(arr(new int[] { 1, 3, 1, 4, 4, 3, 1 })));
	}
	
	public static int[] arr(int[] nums) {
		  int n1 = 0;
		  int n2 = 0;
		  
		  int[] val = new int[nums.length];
		  int[] pos = new int[nums.length];
		  for (int i = 0; i < nums.length; i++) {
		    if (nums[i] == 3) {
		      if (nums[i+1] != 4) {
		        val[n1] = nums[i+1];
		        n1++;
		      }
		      nums[i+1] = 4;
		    }
		    if (nums[i] == 4) {
		      if (i != 0 && nums[i-1] != 3) {
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
