package p99boj.s10816;

//import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		scanner.nextLine();
//		String n1 = scanner.nextLine();
		String[] n = scanner.nextLine().split(" ");
		
		int M = scanner.nextInt();
		scanner.nextLine();
		String[] m = scanner.nextLine().split(" ");
		
//		System.out.println(n1);
//		System.out.println(Arrays.toString(m));
		
//		int count = 0;
		int[] arr = new int[20_000_001];
		for(int i = 0; i < N; i++) {
			arr[Integer.parseInt(n[i]) + 10_000_000]++;
		}
		
		for(int i = 0; i < M; i++) {
			System.out.print(arr[Integer.parseInt(m[i]) + 10_000_000] + " ");						
		}
		
	}
}
