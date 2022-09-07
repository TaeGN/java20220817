package p99leetcode;

import java.util.Arrays;

public class S1684 {
	public static void main(String[] args) {
		
//		String str = "aacceeaa";
//		System.out.println(str.replace("a", ""));
		
		
		String allowed = "ab";
		String[] words = {"a","b","c","ab","ac","bc","abc"};
		String[] arr = new String[words.length];
		String str = "";
		int count = 0;

		
//		System.out.println(words[0]);
//		words[0].replaceAll(String.valueOf(allowed.charAt(0)),"b");
//		System.out.println(words[0]);
//		System.out.println(Arrays.toString(words));
		
//		for(int i = 0; i < words.length; i++) {
//			words[i].replace(allowed, "z");
//			System.out.println(words[i]);
////		}
        for(int i = 0; i < allowed.length(); i++) {
            for(int j = 0; j < words.length; j++) {
            	str = String.valueOf(allowed.charAt(i));
            	arr[j] = words[j].replaceAll(str,"");
            	System.out.println(arr[j]);
            }
        }
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i].length() == 0) {
        		count++;
        	}
        }
        System.out.println(count);
		
	}
}
