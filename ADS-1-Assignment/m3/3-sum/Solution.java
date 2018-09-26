import java.util.*;
class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int array = scan.nextInt();
		int[] threesum = new int[array];
		for (int i = 0; i < threesum.length; i++) {
			threesum[i] = scan.nextInt();
		}
		Arrays.sort(threesum);
		int count = 0;
		for (int i = 0; i < array - 2; i++) {
			int j = i + 1;
			int k = array - 1;
			while (j < k) {
				if (threesum[i] + threesum[j] 
					+ threesum[k] == 0) {
					count++;
					j++;
					k--;
				} else if (threesum[i] + threesum[j] 
					+ threesum[k] < 0){
					j++;
				} else {
					k--;
				}
			}
		}
		System.out.println(count);
	}
}