import java.util.Scanner;
class BookDetails implements Comparable {
    /**
     * variable declaration name  .
     */
    private String name;
    /**
     * variable declaration author.
     */
    private String author;
    /**
     * variable declaration price.
     */
    private float price;
    /**
     * Constructs the object.
     *
     * @param      bookname    The bookname
     * @param      bookauthor  The bookauthor
     * @param      bookprice   The bookprice
     */
    BookDetails(final String bookname,
                final String bookauthor, final float bookprice) {
        this.name = bookname;
        this.author = bookauthor;
        this.price = bookprice;
    }
    /**
     * Gets the name.
     *
     * @return     The name.
     */
    public String getName() {
        return this.name;
    }
    /**
     * Gets the author.
     *
     * @return     The author.
     */
    public String getAuthor() {
        return this.author;
    }
    /**
     * Gets the price.
     *
     * @return     The price.
     */
    public float getPrice() {
        return this.price;
    }
    /**
     * compare to method that returns integer.
     *
     * @param      object  The object
     *
     * @return  integer.
     */
    public int compareTo(final Object object) {
        BookDetails that = (BookDetails) object;
        return this.name.compareTo(that.name);
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return getName() + ", " + getAuthor() + ", " + getPrice();
    }
}
class BinarySearchTree {
    /**
     * variable declaration.
     */
    private Node root;
    /**
     * Class for node.
     */
    private final class Node {
        /**
         * variable declaration key.
         */
        private BookDetails key;
        /**
         * variable declaration val.
         */
        private int val;
        /**
         * variable declaration left.
         */
        private Node left;
        /**
         * variable declaration right.
         */
        private Node right;
        /**
         * variable declaration size.
         */
        private int size;
        /**
         * Constructs the object.
         *
         * @param      key1   The key
         * @param      val1  The value
         * @param s int size
         */
        private Node(final BookDetails key1, final int val1, final int s) {
            this.key = key1;
            this.val = val1;
            this.size = s;
            left = null;
            right = null;
        }
    }
    /**
     * Constructs the object.
     */
    BinarySearchTree() {
        root = null;
    }
    /**
     * size method.
     *
     * @return size.
     */
    public int size() {
        return size(root);
    }
    /**
     * size overloaded method.
     *
     * @param      x Node
     *
     * @return size.
     */
    private int size(final Node x) {
        if (x == null) {
            return 0;
        } else {
            return x.size;
        }
    }
    /**
     * get method.
     *time complexity is O(logN)
     * @param      key   The key
     *
     * @return  integer.
     */
    public int get(final BookDetails key) {
        Node x = root;
        while (x != null) {
            int cmp = key.compareTo(x.key);
            if (cmp < 0) {
                x = x.left;
            } else if (cmp > 0) {
                x = x.right;
            } else if (cmp == 0) {
                return x.val;
            }
        }
        return -1;
    }
    /**
     * put method to insert the key, value.
     *time complexity is O(1)
     * @param      key   The key
     * @param      val   The value
     */
    public void put(final BookDetails key, final int val) {
        root = put(root, key, val);
    }
    /**
     * overloaded constructor.
     * time complexity is O(logN)
     * @param      x   root node.
     * @param      key   The key
     * @param      val   The value
     *
     * @return root
     */
    private Node put(final Node x, final BookDetails key, final int val) {
        if (x == null) {
            return new Node(key, val, 1);
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            x.left = put(x.left, key, val);
        } else if (cmp > 0) {
            x.right = put(x.right, key, val);
        } else if (cmp == 0) {
            x.val = val;
        }
        return x;
    }
    /**
     * min element.
     * time complexity is O(1)
     * @return minimum.
     */
    public BookDetails min() {
        return min(root).key;
    }
    /**
     * overloaded constructor.
     * time complexity is O(logN)
     * @param      x Node
     *
     * @return minimum.
     */
    private Node min(final Node x) {
        if (x.left == null) {
            return x;
        } else {
            return min(x.left);
        }
    }
    /**
     * maximum element.
     * time complexity is O(1)
     * @return maximum.
     */
    public BookDetails max() {
        return max(root).key;
    }
    /**
     * overloaded constructor.
     * time complexity is O(logN)
     * @param      x Node
     *
     * @return maximum.
     */
    private Node max(final Node x) {
        if (x.right == null) {
            return x;
        } else {
            return max(x.right);
        }
    }
    /**
     * floor method.
     * time complexity is O(1)
     * @param      key   The key
     *
     * @return  key
     */
    public BookDetails floor(final BookDetails key) {
        Node x = floor(root, key);
        if (x == null) {
            return null;
        } else {
            return x.key;
        }
    }
    /**
     *
     *overloaded constructor.
     *time complexity is O(logN)
     * @param      x Node
     * @param      key   The key
     *
     * @return floor.
     */
    private Node floor(final Node x, final BookDetails key) {
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.key);
        if (cmp == 0) {
            return x;
        }
        if (cmp <  0) {
            return floor(x.left, key);
        }
        Node t = floor(x.right, key);
        if (t != null) {
            return t;
        } else {
            return x;
        }
    }
    /**
     * ceiling method.
     * time complexity is O(1)
     * @param      key   The key
     *
     * @return key.
     */
    public BookDetails ceiling(final BookDetails key) {
        Node x = ceiling(root, key);
        if (x == null) {
            return null;
        } else {
            return x.key;
        }
    }
    /**
     * overloaded constructor.
     * time complexity is O(logN)
     * @param      x Node
     * @param      key   The key
     *
     * @return     { description_of_the_return_value }
     */
    private Node ceiling(final Node x, final BookDetails key) {
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.key);
        if (cmp == 0) {
            return x;
        }
        if (cmp < 0) {
            Node t = ceiling(x.left, key);
            if (t != null) {
                return t;
            } else {
                return x;
            }
        }
        return ceiling(x.right, key);
    }
    /**
     * {Select Method}.
     * Time complexity of this method is O(1).
     * @param      k     {Integer}
     *
     * @return     {BookDetails Object}
     */
    public BookDetails select(final int k) {
        Node x = select(root, k);
        return x.key;
    }
    /**
     * {Select method}
     * Time complexity of this method is O(log(N)).
     * @param      x     {Node}
     * @param      k     {Integer}
     *
     * @return     {Node}
     */
    private Node select(final Node x, final int k) {
        if (x == null) {
            return null;
        }
        int t = size(x.left);
        if (t > k) {
            return select(x.left,  k);
        } else if (t < k) {
            return select(x.right, k - t - 1);
        } else {
            return x;
        }
    }
    /**
     * {Rank}.
     * Time complexity of this method is O(1).
     * @param      key   The key
     *
     * @return     {Integer}
     */
    public int rank(final BookDetails key) {
        return rank(key, root);
    }
    /**
     * {Method of rank}.
     * Time complexity of this method is O(log(N)).
     * @param      key   The key
     * @param      x     {Node}
     *
     * @return     {Integer}
     */
    private int rank(final BookDetails key, final Node x) {
        if (x == null) {
            return 0;
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            return rank(key, x.left);
        } else if (cmp > 0) {
            return 1 + size(x.left) + rank(key, x.right);
        } else {
            return size(x.left);
        }
    }
    /**
     * delete minimum node.
     */
    public void deleteMin() {
        root = deleteMin(root);
    }
    /**
     * overloaded constructor of delete minimum method.
     *
     * @param      x  The Node.
     *
     * @return  Node
     */
    private Node deleteMin(final Node x) {
        if (x.left == null) {
            return x.right;
        }
        x.left = deleteMin(x.left);
        x.size = size(x.left) + size(x.right) + 1;
        return x;
    }
    /**
     * delete maximum node.
     */
    public void deleteMax() {
        root = deleteMax(root);
    }
    /**
     * overloaded constructor of delete maximum method.
     *
     * @param      x  The Node.
     *
     * @return   Node
     */
    private Node deleteMax(final Node x) {
        if (x.right == null) {
            return x.left;
        }
        x.right = deleteMax(x.right);
        x.size = size(x.left) + size(x.right) + 1;
        return x;
    }
    /**
     * delete node.
     *
     * @param      key   The key
     */
    public void delete(final BookDetails key) {
        root = delete(root, key);
    }
    /**
     * overloaded constructor of delete.
     *
     * @param      x  Node
     * @param      key   The key
     *
     * @return Node.
     */
    private Node delete(final Node x, final BookDetails key) {
        Node x1 = x;
        if (x1 == null) {
            return null;
        }

        int cmp = key.compareTo(x1.key);
        if      (cmp < 0) {
            x1.left  = delete(x1.left,  key);
        } else if (cmp > 0) {
            x1.right = delete(x1.right, key);
        } else {
            if (x1.right == null) {
                return x1.left;
            }
            if (x1.left  == null) {
                return x1.right;
            }
            Node t = x1;
            x1 = min(t.right);
            x1.right = deleteMin(t.right);
            x1.left = t.left;
        }
        x1.size = size(x1.left) + size(x1.right) + 1;
        return x1;
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
				BookDetails bobj = new BookDetails(tokens[1], tokens[2],
				                                   Float.parseFloat(tokens[3]));
				bstobj.put(bobj, Integer.parseInt(tokens[4]));
				break;
			case "get":
				bobj = new BookDetails(tokens[1], tokens[2],
				                       Float.parseFloat(tokens[3]));
				if (bstobj.get(bobj) == -1) {
					System.out.println("null");
				} else {
					System.out.println(bstobj.get(bobj));
				}
				break;
			case "max":
				System.out.println(bstobj.max());
				break;
			case "min":
				System.out.println(bstobj.min());
				break;
			case "select":
				System.out.println(bstobj.select(Integer.parseInt(tokens[1])));
				break;
			case "floor":
				bobj = new BookDetails(tokens[1],
				                       tokens[2], Float.parseFloat(tokens[3]));
				System.out.println(bstobj.floor(bobj));
				break;
			case "ceiling":
				bobj = new BookDetails(tokens[1],
				                        tokens[2], Float.parseFloat(tokens[3]));
				System.out.println(bstobj.ceiling(bobj));
				break;
			case "deleteMax":
				bstobj.deleteMax();
				break;
			case "deleteMin":
				bstobj.deleteMin();
				break;
			case "delete":
				bobj = new BookDetails(tokens[1],
				                        tokens[2], Float.parseFloat(tokens[3]));
				bstobj.delete(bobj);
			default:
				break;
			}
		}
	}
}