import java.util.Scanner;
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
		int inputs = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < inputs; i++) {
			String[] tokens = scan.nextLine().split(",");
			String str = tokens[1] + "," + tokens[2];
			obj.put(Integer.parseInt(tokens[0]), str);
		}
		int values = Integer.parseInt(scan.nextLine());
		for (int j = 0; j < values; j++) {
			String[] tokens1 = scan.nextLine().split(" ");
			String str1 = obj.get(Integer.parseInt(tokens1[1]));
			if (str1 != null) {
				String[] tokens2 = str1.split(",");
				if (Integer.parseInt(tokens1[2]) == 1) {
					System.out.println(tokens2[0]);
				} else {
					System.out.println(Double.parseDouble(tokens2[1]));
				}
			} else {
				System.out.println("Student doesn't exists...");
			}
		}
	}
}