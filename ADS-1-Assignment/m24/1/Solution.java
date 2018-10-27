import java.util.Scanner;
// /*/**
//  * Class for student.
//  */
// class Student {
// 	private int roll_number;
// 	private String name;
// 	private double totalMarks;
// 	/**
// 	 * Constructs the object.
// 	 */
// 	student() {

// 	}
// 	/**
// 	 * Constructs the object.
// 	 *
// 	 * @param      roll_num    The roll number
// 	 * @param      namee       The namee
// 	 * @param      totalmarks  The totalmarks
// 	 */
// 	Student(final int roll_num, final String namee, final double totalmarks) {
// 		this.roll_number = roll_num;
// 		this.name = namee;
// 		this.totalMarks = totalmarks;
// 	}

// }
// /**
//  * Class for solution.
//  */
class Solution {
	/**
	 * Constructs the object.
	 */
	Solution() {

	}
	/**
	 * main function.
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		LinearProbingHashST<Integer, String> obj =
		    new LinearProbingHashST<Integer, String>();
		Scanner scan = new Scanner(System.in);
		int inputs = scan.nextInt();
		for (int i = 0; i < inputs; i++) {
			String[] tokens = scan.nextLine().split(",");
			String str = tokens[1] + "," + tokens[2];
		}
		int values = Integer.parseInt(scan.nextLine());
		for (int j = 0; j < values; j++) {
			String[] tokens1 = scan.nextLine().split(" ");
			String str1 = obj.get(Integer.parseInt(tokens1[1]));
			if (str1 != null) {
				String[] tokens2 = str1.split(",");
				if (Integer.parseInt(tokens1[2]) == 1) {
					System.out.println(tokens2[0]);
				}
			}
		}
	}
}