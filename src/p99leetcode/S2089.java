package p99leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S2089 {
	public static void main(String[] args) {
		int[] nums = {1,2,5,2,3};
		int target = 2;
		List<Integer> list = new ArrayList<Integer>();
		int i = 0;
		
		Arrays.sort(nums);
		
		 while(nums[i] <= target) {
	            if(nums[i] == target) {
	                list.add(i);
	            }
	            i++;
	        }
//		for(int i = 0; i < nums.length; i++) {
//			if(nums[i] == target) {
//				list.add(i);
//			}
//			if(nums[i] > target) {
//				break;
//			}
//		}
		 System.out.println(list);
	}
}
