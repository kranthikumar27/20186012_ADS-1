import java.util.Scanner;
import java.util.Arrays;
class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		int[] array = new int[size];
		for (int i = 0;i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		Arrays.sort(array);
		NoOfPairs objtp = new NoOfPairs();
		System.out.println(objtp.twopairs(array));
	}	
}
class NoOfPairs {
	public int twopairs(int[] array) {
		int count = 0;
		int j;
		int totalcount = 0;
		for (int i = 0;i < array.length - 1; i++) {
			j = i + 1;
			if (array[i] == array[j]) {
				count++;
			}
			if (i == array.length - 2|| array[i] != array[j]) {
				totalcount += (count + 1) * (count)/2;
				count =0;
			}
		}
		return totalcount;
	}
}