package p99programmers.lv2.ok.주식가격;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1 {
	public static void main(String[] args) {
		int[] prices = {1, 2, 3, 2, 3};
		int[] answer = Sol1(prices);
		System.out.println(Arrays.toString(answer));
	}

	private static int[] Sol1(int[] prices) {
		List<Integer[]> list = new ArrayList<Integer[]>();
		int[] answer = new int[prices.length];
		
		//초기값 넣기 list<int[price, position]>
		list.add(new Integer[] {prices[0], 0});
		
		// list에 prices배열의 원소 차례로 넣기
		for(int i = 1; i < prices.length; i++) {
			int j = list.size() - 1;
			while(j >= 0 && list.get(j)[0] > prices[i]) {
				answer[list.get(j)[1]] = i - list.get(j)[1];
				list.remove(j);
				j--;
			}
			list.add(new Integer[] {prices[i],i});
		}
		for(Integer[] arr : list) {
			answer[arr[1]] = prices.length - 1 - arr[1];
		}
		return answer;
	}
}
