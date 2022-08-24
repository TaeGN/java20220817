package p99codingbat.Array2;

public class maxSpan {
	public static void main(String[] args) {
		maxSpan(new int[] {1, 2, 1, 1, 3});

	}
	
	public static void maxSpan(int[] nums) {
		  int[] arr = new int[10];
		  for (int i = 0; i < nums.length; i++) {
			  arr[nums[i]]++;
		  }
		  System.out.println(arr[1]);
		}

}
