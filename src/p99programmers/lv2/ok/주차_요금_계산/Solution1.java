package p99programmers.lv2.ok.주차_요금_계산;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Solution1 {
	public static void main(String[] args) {
		int[] fees = {180, 5000, 10, 600};
		String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
		int[] answer =  sol(fees, records);
		System.out.println(Arrays.toString(answer));
	}

	private static int[] sol(int[] fees, String[] records) {
		Map<String, String> park = new HashMap<>();
		Map<String, Integer> parkFee = new HashMap<>();
		int carIn = 0;
		int carOut = 0;
		int pTime = 0;
		int fee = 0;
		for(String record : records) {
			String time = record.substring(0,5);
			if(time.equals("23:59")) {
				continue;
			}
			String carNum = record.substring(6,10);
			if(park.containsKey(carNum)) {
				carIn = 
						Integer.parseInt(park.get(carNum).substring(0, 2)) * 60
						+ Integer.parseInt(park.get(carNum).substring(3, 5));
				carOut = 
						Integer.parseInt(record.substring(0, 2)) * 60
						+ Integer.parseInt(record.substring(3, 5));
				pTime = carOut - carIn;
				System.out.println(carNum + ":" + pTime);
				fee = Fee(pTime, fees);
				if(parkFee.containsKey(carNum)) {
					parkFee.replace(carNum, parkFee.get(carNum) + fee);
				} else {
					parkFee.put(carNum, fee);
				}
				park.remove(carNum);
			} else {
				park.put(carNum, time);
			}
		}
		for(Map.Entry<String, String> entry : park.entrySet()) {
			carIn = 
					Integer.parseInt(entry.getValue().substring(0, 2)) * 60
					+ Integer.parseInt(entry.getValue().substring(3, 5));
			pTime = 1439 - carIn;
			fee = Fee(pTime, fees);
			if(parkFee.containsKey(entry.getKey())) {
				parkFee.replace(entry.getKey(), parkFee.get(entry.getKey()) + fee);
			} else {
				parkFee.put(entry.getKey(), fee);
			}
 		}
		System.out.println(parkFee);
		return null;
	}

	private static int Fee(int pTime, int[] fees) {
		int count = 0;
		
		if(pTime <= fees[0]) {
			return fees[1];
		} else {
			count = (pTime - fees[0]) / fees[2];
			if((pTime - fees[0]) % fees[2] != 0) {
				count++;
			}
		}
		return count * fees[3] + 5000;
	}
}
