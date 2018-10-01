import java.util.Scanner;
/**
 *  client class.
 */
public final class Solution {
	/**.
	 * Constructs the object.
	 */
	private Solution() {
		//unused constructor.
	}
	/**
	 * { function_description }
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);
		Steque obj = new Steque();
		int values = Integer.parseInt(scan.nextLine());
		while (scan.hasNext()) {
			String line = scan.nextLine();
			String[] tokens = line.split(" ");
			if (line.length() == 0) {
				obj.setSize(0);
				System.out.println();
			} else {
				switch (tokens[0]) {
				case "push":
					obj.push(Integer.parseInt(
					             tokens[1]));
					obj.print();
					break;
				case "pop":
					obj.pop();
					obj.print();
					break;
				case "enqueue":
					obj.enqueue(Integer.parseInt(tokens[1]));
					obj.print();
					break;
				default:
					break;
				}
			}
		}
	}
}

