import java.util.*;
class Solution{
	Solution() {

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		int inputs = Integer.parseInt(sc.nextLine());
		for (int i = 0;i< inputs ;i++ ) {
			String[] tokens = sc.nextLine().split(",");
			Student std = new Student(Integer.parseInt(tokens[0]), tokens[1], Double.parseDouble(tokens[2]));
			student.add(std);
		}
		student.sort();
		int output = Integer.parseInt(sc.nextLine());
		for (int  i = 0;i<output ;i++ ) {
			double num = Double.parseDouble(sc.nextLine());
			student.display(num);
		}
	}
}