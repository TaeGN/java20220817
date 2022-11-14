package p99programmers.lv2.ok.택배상자;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
	public static void main(String[] args) {
		int[] order = {4, 3, 1, 2, 5};
		int answer = Sol1(order);
		System.out.println(answer);
	}

	private static int Sol1(int[] order) {
		List<Integer> sub = new ArrayList<>();
		int i = 0;
		int main = 1;
		int count = 0;
		while(main <= order.length || sub.size() != 0) {
			if(sub.size() > 0 && sub.get(sub.size() - 1) == order[i]) {
				sub.remove(sub.size() - 1);
				count++;
				i++;
			} else if(main == order[i]) {
				main++;
				count++;
				i++;
			} else {
				if(main > order.length) {
					break;
				}
				sub.add(main++);
			}
		}
		return count;
	}
}
