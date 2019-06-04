import java.util.*;
class Solution{
	Solution() {

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Players playerObject = new Players();
		while (scan.hasNext()) {
			String[] tokens = scan.nextLine().split(",");
			// playerObject.add(new Players();
			// p.add(playerObject);
			Players players = new Players(tokens[0], Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]));
			playerObject.add(players);
			
		}
		playerObject.sort();
		playerObject.show();
	}
}