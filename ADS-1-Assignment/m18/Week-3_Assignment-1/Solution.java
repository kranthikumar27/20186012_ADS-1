import java.util.Scanner;
/**
 * Class for stock exchange.
 */
class StockExchange implements Comparable<StockExchange> {
	private String companyname;
	private Double percentagechange;
	StockExchange(String companyname1, Double pc1) {
		this.companyname = companyname1;
		this.percentagechange = pc1;
	}
	/**
	 * Gets the company name.
	 *
	 * @return     The company name.
	 */
	public String getCompanyName() {
		return companyname;
	}
	/**
	 * Gets the percentage change.
	 *
	 * @return     The percentage change.
	 */
	public Double getPercentageChange() {
		return percentagechange;
	}
	/**
	 * Returns a string representation of the object.
	 *
	 * @return     String representation of the object.
	 */
	public String toString() {
		return companyname + " " + percentagechange;
	}
	/**
	 * { function_description }
	 *
	 * @param      that  The that
	 *
	 * @return     { description_of_the_return_value }
	 */
	public int compareTo(StockExchange that) {
		if (this.percentagechange > that.getPercentageChange()) {
			return 1;
		}
		if (this.percentagechange < that.getPercentageChange()) {
			return -1;
		}
		if (this.companyname.compareTo(that.getCompanyName()) > 0) {
			return 1;
		}
		if (this.companyname.compareTo(that.getCompanyName()) < 0) {
			return -1;
		} else {
			return 0;
		}
	}
}
public class Solution {
	Solution() {

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inputs = Integer.parseInt(scan.nextLine());
		MinPQ<StockExchange> minobj1 = new MinPQ<StockExchange>();
		MaxPQ<StockExchange> maxobj1 = new MaxPQ<StockExchange>();
		for (int i = 0; i < inputs-1; i++) {
			String[] tokens = scan.next().split(",");
			StockExchange temp = new StockExchange(tokens[0],
			                                       Double.parseDouble(tokens[1]));
			//System.out.println(Arrays.toString(tokens));

			maxobj1.insert(temp);
			minobj1.insert(temp);
		}
		for (int j = 0;j<=5 ;j++ ) {
			System.out.println(maxobj1.delMax());
		}
		System.out.println();
		for (int i=0;i<=5 ;i++ ) {
			System.out.println(minobj1.delMin());
		}
		System.out.println();
		MinPQ<StockExchange> minobj2 = new MinPQ<StockExchange>();
		MaxPQ<StockExchange> maxobj2 = new MaxPQ<StockExchange>();
		for (int i = 0; i < inputs; i++) {
			String[] tokens = scan.next().split(",");
			StockExchange temp = new StockExchange(tokens[0],
			                                       Double.parseDouble(tokens[1]));
			//System.out.println(Arrays.toString(tokens));

			maxobj2.insert(temp);
			minobj2.insert(temp);
		}
		for (int j = 0;j<=5 ;j++ ) {
			System.out.println(maxobj2.delMax());
		}
		System.out.println();
		for (int i=0;i<=5 ;i++ ) {
			System.out.println(minobj2.delMin());
		}
		System.out.println();
		//int count = 0;
		// for (int j = 0; j < 6 * inputs; j++) {
		// 	if (count++ < 5) {
		// 		System.out.println(minobj.delMin());
		// 	}
		// 	if (count++ <= inputs - 1) {
		// 		minobj.delMin();
		// 	} else {
		// 		count = 0;
		// 	}
		// }
		MinPQ<StockExchange> minobj3 = new MinPQ<StockExchange>();
		MaxPQ<StockExchange> maxobj3 = new MaxPQ<StockExchange>();
		for (int i = 0; i < inputs; i++) {
			String[] tokens = scan.next().split(",");
			StockExchange temp = new StockExchange(tokens[0],
			                                       Double.parseDouble(tokens[1]));
			//System.out.println(Arrays.toString(tokens));

			maxobj3.insert(temp);
			minobj3.insert(temp);
		}
		for (int j = 0;j<=5 ;j++ ) {
			System.out.println(maxobj3.delMax());
		}
		System.out.println();
		for (int i=0;i<=5 ;i++ ) {
			System.out.println(minobj3.delMin());
		}
		System.out.println();

		MinPQ<StockExchange> minobj4 = new MinPQ<StockExchange>();
		MaxPQ<StockExchange> maxobj4 = new MaxPQ<StockExchange>();
		for (int i = 0; i < inputs; i++) {
			String[] tokens = scan.next().split(",");
			StockExchange temp = new StockExchange(tokens[0],
			                                       Double.parseDouble(tokens[1]));

			maxobj4.insert(temp);
			minobj4.insert(temp);
		}
		for (int j = 0;j<=5 ;j++ ) {
			System.out.println(maxobj4.delMax());
		}
		System.out.println();
		for (int i=0;i<=5 ;i++ ) {
			System.out.println(minobj4.delMin());
		}
		System.out.println();

		MinPQ<StockExchange> minobj5 = new MinPQ<StockExchange>();
		MaxPQ<StockExchange> maxobj5 = new MaxPQ<StockExchange>();
		for (int i = 0; i < inputs; i++) {
			String[] tokens = scan.next().split(",");
			StockExchange temp = new StockExchange(tokens[0],
			                                       Double.parseDouble(tokens[1]));

			maxobj5.insert(temp);
			minobj5.insert(temp);
		}
		for (int j = 0;j<=5 ;j++ ) {
			System.out.println(maxobj5.delMax());
		}
		System.out.println();
		for (int i=0;i<=5 ;i++ ) {
			System.out.println(minobj5.delMin());
		}
		System.out.println();

		MinPQ<StockExchange> minobj6 = new MinPQ<StockExchange>();
		MaxPQ<StockExchange> maxobj6 = new MaxPQ<StockExchange>();
		for (int i = 0; i < inputs; i++) {
			String[] tokens = scan.next().split(",");
			StockExchange temp = new StockExchange(tokens[0],
			                                       Double.parseDouble(tokens[1]));

			maxobj6.insert(temp);
			minobj6.insert(temp);
		}
		for (int j = 0;j<=5 ;j++) {
			System.out.println(maxobj6.delMax());
		}
		System.out.println();
		for (int i=0;i<=5 ;i++) {
			System.out.println(minobj6.delMin());
		}
		System.out.println();
	}
}