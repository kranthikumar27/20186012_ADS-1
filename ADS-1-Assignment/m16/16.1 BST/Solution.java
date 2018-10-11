import java.util.Scanner;
class Node {
	public Book key;
	public int value;
	public Node left, right;
	public Node(Book key1, int value1) {
		this.key = key1;
		this.value = value1;
		left = null;
		right = null; 
	}
}

class BinarySearchTree {
	private Node root;
	BinarySearchTree() {
		root = null;
	}
	public Node root() {
		return root;
	}
	public int get(Book key) {
		Node x = root;
		while (x != null) {
			int cmp = key.compareTo(x.key);
			if (cmp < 0) {
				x = x.left;
			} else if (cmp > 0) {
				x = x.right;
			} else if (cmp == 0) {
				return x.value;
			}
		}
		return -1;
	}
	public void put(Book key, int val) {
		root = put(root, key, val);
	}
	private Node put(Node x, Book key, int val) {
		if (x == null) {
			return new Node(key, val);
		}
		int cmp = key.compareTo(x.key);
		//System.out.println(cmp);
		if (cmp < 0) {
			x.left = put(x.left, key, val);
		} else if (cmp > 0) {
			x.right = put(x.right, key, val);
		} else if (cmp == 0) {
			x.value = val;
		}
		return x;
	}
}

class Book implements Comparable {
	
	private String name;
	
	private String author;
	
	private double price;
	
	Book(final String name1, final String author1, final double amount1) {
		this.name = name1;
		this.author = author1;
		this.price = amount1;
	}


	public int compareTo(Object object) {
		Book other = (Book) object;
		return this.name.compareTo(other.name);
	}


}
class Solution {
	Solution() {

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BinarySearchTree bstobj = new BinarySearchTree();
		while (scan.hasNext()) {
			String[] tokens = scan.nextLine().split(",");
			switch (tokens[0]) {
			case "put":
				Book obj = new Book(tokens[1], tokens[2],
				                    Double.parseDouble(tokens[3]));
				bstobj.put(obj, Integer.parseInt(tokens[3]));
			case "get":
				obj = new Book(tokens[1], tokens[2], Double.parseDouble(tokens[3]));
				if (bstobj.get(obj) == -1) {
					System.out.println("null");
				} else {
					System.out.println(bstobj.get(obj));
				}
				break;
				default:
				break;
			}
		}
	}
}