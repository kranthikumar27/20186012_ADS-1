import java.util.*;
class Solution {
	Solution(){

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student std = new Student();
		int inputs = Integer.parseInt(sc.nextLine());
		for (int i = 0;i<inputs ;i++ ) {
			// String lines = sc.nextLine();
			String[] tokens = sc.nextLine().split(",");
			// System.out.println(Arrays.toString(tokens));
			Student student = new Student(Integer.parseInt(tokens[0]), tokens[1], Double.parseDouble(tokens[2]));
			std.add(student);
		}
		std.sort();

		int input1 = Integer.parseInt(sc.nextLine());
		for (int i = 0;i<input1 ;i++ ) {
			double num = Double.parseDouble(sc.nextLine());
			std.display(num);
		}
	}
}