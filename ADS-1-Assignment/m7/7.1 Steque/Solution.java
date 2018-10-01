import java.util.Scanner;
public final class Solution {
	private Solution() {

	}
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
					break;
				case "enqueue":
					obj.enqueue(Integer.parseInt(tokens[1]));
					break;
				default:
					break;
				}
			}
		}
	}
}

class Node {
	int data;
	Node address;
	Node() {

	}
	Node(int data1) {
		this.data = data1;
	}
	public int getData() {
		return this.data;
	}
	public Node getAddress() {
		return this.address;
	}
	public void setAddress(Node address1) {
		this.address = address1;
	}
}

class Steque {
	Node head;
	Node tail;
	int size = 0;
	Steque() {

	}
	public void setSize(int value) {
		this.size = value;
	}

	public void enqueue(int item) {
		if (size == 0) {
			head = new Node(item);
			tail = head;
			head.address = null;
			size++;
			return;
		}
		Node temp = new Node(item);
		temp.address = null;
		tail.address = temp;
		tail = temp;
		size++;
	}

	public void pop() {
		if (head == null) return;
		if (size == 1) {
			head = null;
			size = 0;
			return;
		}
		head = head.address;
	}
	public void push(int item) {
		if (size == 0) {
			head = new Node(item);
			head.address = null;
			tail = head;
			size++;
		} else {
			Node temp = new Node(item);
			temp.address = head;
			head = temp;
			size++;
		}
	}
	public void print() {
		Node obj = head;
		if (head == null) {
			System.out.println("Steque is empty.");
			return;
		}
		while (obj.getAddress() != null) {
			System.out.print(obj.data + ",");
			obj = obj.getAddress();
		} System.out.print(obj.data);
		System.out.println();
	}
}