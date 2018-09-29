import java.util.Scanner;
class LinkedList {
	int data;
	Node node;
	LinkedList(int data1) {
		this.data = data1;

	}
	LinkedList() {

	}
	public int getData() {
		return this.data;
	}
	public Node getNode() {
		return this.node;
	}
	public void setAddress(Node node1) {
		this.node = node1;
	}
}
class AddLargeNumbers {

	AddLargeNumbers() {

	}
	public static LinkedList numberToDigits(String number) {
		int size = 0;
		LinkedList head;
		LinkedList tail;
		if (size == 0) {
			head = new LinkedList(number);
			head.address = null;
			tail = head;
			size++;
		} else {
			LinkedList temp = new LinkedList(number);
			temp.address = head;
			head = temp;
			size++;
		}
		return head;
	}


	public static String digitsToNumber(LinkedList list) {
		int size = 0;
		LinkedList head;
		LinkedList tail;
		if (size == 0) {
			head = new LinkedList(list);
			head.address = null;
			tail = head;
			size++;
		} else {
			LinkedList temp = new LinkedList(list);
			temp.address = head;
			head = temp;
			size++;
		}
		return head;
	}
	

	public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
		int l1 = p.length();
		int l2 = q.length();
		for (int i = l1; i >= 0; i--) {
			pDigits.add(p.charAt(i) - '0');
		}
		for (int i = l2; i >= 0; i-- ) {
			qDigits.add(q.charAt(i) - '0');
		}
		int len = l1 > l2 ? l1 : l2;
		int carry = 0;
		for (int i = 0; i < len ; i++ ) {
			int d1 = 0;
			int d2 = 0;
			try {
				d1 = pDigits.get(i);
			} catch (Exception e) {}
			try {
				d2 = qDigits.get(i);
			} catch (Exception e) {}
			int x = d1 + d2 + carry;
			result.add(x % 10);
			carry = x / 10;
		}
		while (carry != 0) {
			result.add(carry % 10);
			carry /= 10;
		}
		return result;
	}
}

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String p = sc.nextLine();
		String q = sc.nextLine();
		switch (input) {
		case "numberToDigits":
			LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
			LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
			System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
			System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
			break;

		case "addLargeNumbers":
			pDigits = AddLargeNumbers.numberToDigits(p);
			qDigits = AddLargeNumbers.numberToDigits(q);
			LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
			System.out.println(AddLargeNumbers.digitsToNumber(result));
			break;
		}
	}
}
