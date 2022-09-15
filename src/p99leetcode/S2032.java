package p99leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S2032 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		int[] nums1 = {1,1,3,2};
		int[] nums2 = {2,3};
		int[] nums3 = {3};
		list = twoOutOfThree(nums1, nums2, nums3);
		System.out.println(list);
	}
	
	public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
		List<Integer> answer = new ArrayList<Integer>();
		
		for(int i = 0; i < nums1.length; i++) {
			if(Arrays.asList(nums2).contains(nums1[i]) && Arrays.asList(nums3).contains(nums1[i])) {
				answer.add(nums1[i]);
			}
		}
		
		
//		if(nums1.length >= nums2.length) {
//			for(int i = 0; i < nums2.length; i++) {
//				if(Arrays.asList(nums1).contains(nums2[i])) {
//					list.add(nums2[i]);
//				}
//			}
//		} else {
//			for(int i = 0; i < nums1.length; i++) {
//				if(Arrays.asList(nums2).contains(nums1[i])) {
//					list.add(nums1[i]);
//				}
//			}
//		}
//		
		
		return answer;
    }
}
