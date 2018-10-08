import java.util.Scanner;
class PriorityQueue<E extends Comparable<E>> {
	private E[] arr;
	PriorityQueue(E[] array) {
		this.arr = array;
	}
	public boolean isminHeap() {
		for (int i = 0; i < arr.length - 1; i++ ) {
			if (less(i + 1, i)) {
				return false;
			}
		}
		return true;
	}

	public boolean less(int first, int second) {
		return arr[first].compareTo(arr[second]) < 0;
	}
}
public class Solution {
	private Solution() {

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String datatype = scan.nextLine();
		int numoftestcases = Integer.parseInt(scan.nextLine());
		switch (datatype) {
		case "String":
			int count = 0;
			while (count < numoftestcases) {
				String[] input = scan.nextLine().split(",");
				PriorityQueue<String> obj = new PriorityQueue<String>(input);
				System.out.println(obj.isminHeap());
				count++;
			}
			break;
		case "Integer":
			count = 0;
			while (count < numoftestcases) {
				String[] input = scan.nextLine().split(",");
				Integer[] intArray = new Integer[input.length];
				for (int i = 0; i < input.length; i++) {
					intArray[i] = Integer.parseInt(input[i]);
				}
				PriorityQueue<Integer> obj = new PriorityQueue<Integer>(intArray);
				System.out.println(obj.isminHeap());
				count++;
			}
			break;
		case "Double":
			count = 0;
			while (count < numoftestcases) {
				String[] input = scan.nextLine().split(",");
				Double[] doubleArray = new Double[input.length];
				for (int i = 0; i < input.length; i++) {
					doubleArray[i] = Double.parseDouble(input[i]);
				}
				PriorityQueue<Double> obj = new PriorityQueue<Double>(doubleArray);
				System.out.println(obj.isminHeap());
				count++;
			}
			break;
		case "Float":
			count = 0;
			while (count < numoftestcases) {
				String[] input = scan.nextLine().split(",");
				if (input.equals("")) {
					System.out.println(false);
					break;
				}
				Float[] floatArray = new Float[input.length];
				for (int i = 0; i < input.length; i++) {
					floatArray[i] = Float.parseFloat(input[i]);
				}
				PriorityQueue<Float> obj = new PriorityQueue<Float>(floatArray);
				System.out.println(obj.isminHeap());
				count++;
			}
		}
	}
}