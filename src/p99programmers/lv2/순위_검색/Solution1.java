package p99programmers.lv2.순위_검색;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1 {
	public static void main(String[] args) {
		String[] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
		String[] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
		int[] answer = sol(info, query);
		System.out.println(Arrays.toString(answer));
	}

	private static int[] sol(String[] info, String[] query) {
		List<Test> list = new ArrayList<>();
		for(int i = 0; i < info.length; i++) {
			
		}
		return null;
	}
	
	public class Test{
		private String lang;
		private String type;
		private String career;
		private String food;
		
		public Test(String lang, String type, String career, String food) {
			super();
			this.lang = lang;
			this.type = type;
			this.career = career;
			this.food = food;
		}
		public String getLang() {
			return lang;
		}
		public void setLang(String lang) {
			this.lang = lang;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getCareer() {
			return career;
		}
		public void setCareer(String career) {
			this.career = career;
		}
		public String getFood() {
			return food;
		}
		public void setFood(String food) {
			this.food = food;
		}
	}
}
