package p99programmers.lv2.ok.오픈채팅방;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution1 {
	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		String[] answer = Sol1(record);
		System.out.println(Arrays.toString(answer));
	}

	private static String[] Sol1(String[] record) {
		Map<String, String> name = new HashMap<String, String>();
		List<String[]> message = new ArrayList<>();
		
		for(String s : record) {
			String[] arr = s.split(" ");
			switch(arr[0]) {
			case "Enter":
				name.compute(arr[1], (k,v) -> v == null ? arr[2] : arr[2]);
				message.add(new String[] {arr[1],"님이 들어왔습니다."});
				break;
			case "Leave":
				message.add(new String[] {arr[1],"님이 나갔습니다."});
				break;
			case "Change":
				name.compute(arr[1], (k,v) -> v == null ? arr[2] : arr[2]);
				break;
			}
		}
		
		String[] answer = new String[message.size()];
		int i = 0;
		for(String[] mArr : message) {
			answer[i++] = name.get(mArr[0]) + mArr[1];
		}
		
		
		return answer;
	}
}
