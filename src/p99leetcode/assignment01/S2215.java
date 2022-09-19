package p99leetcode.assignment01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class S2215 {
	public static void main(String[] args) {
		
		int[] nums1 = {1,2,3};
		int[] nums2 = {2,4,6};

		List<List<Integer>> answer = findDifference(nums1,nums2);
		System.out.println(answer);
		}
	
	
	private static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
		List<List<Integer>> answer = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		int[] count1 = new int[2001];
		int[] count2 = new int[2001];
		for(int i = 0; i < nums1.length; i++) {
			count1[nums1[i]+1000]++;
		}
		for(int i = 0; i < nums2.length; i++) {
			count2[nums2[i]+1000]++;
		}
		for(int i = 0; i < 2001; i++) {
			if(count1[i] > 0 && count2[i] == 0) {
				list1.add(i-1000);
			}
			if(count2[i] > 0 && count1[i] == 0) {
				list2.add(i-1000);
			}
		}
		answer.add(list1);
		answer.add(list2);
		return answer;
	}


	// set 사용
	public static List<List<Integer>> findDifferenceSet(int[] nums1, int[] nums2) {	
		List<List<Integer>> answer = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		for(int num2 : nums2) {
			set2.add(num2);
		}
		set = set2;
		for(int num1 : nums1) {
			if(!set2.contains(num1)) {
				set1.add(num1);
			}
		}
		for(int num2 : nums2) {
			if(set.contains(num2)) {
				set2.remove(num2);
			}
		}
	
			
		List<Integer> list1 = new ArrayList<>(set1);
		List<Integer> list2 = new ArrayList<>(set2);
		answer.add(list1);
		answer.add(list2);
		return answer;
        
    }
}
