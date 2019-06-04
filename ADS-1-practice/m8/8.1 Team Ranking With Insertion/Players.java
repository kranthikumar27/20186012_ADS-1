import java.util.*;
class Players implements Comparable<Players> {
	private String team;
	private int wins;
	private int losses;
	private int draws;
	private int size;
	Players[] ply;
	Players() {
		ply = new Players[10];
		size = 0;
	}
	Players(String team, int wins, int losses, int draws) {
		this.team = team;
		this.wins = wins;
		this.losses = losses;
		this.draws = draws;
	}

	public String getTeam() {
		return this.team;
	}

	public int getWins() {
		return this.wins;
	}

	public int getLosses() {
		return this.losses;
	}

	public int getDraws() {
		return this.draws;
	}



	public int compareTo(Players that) {
		if (this.wins > that.wins) {
			return 1;
		} else if (this.wins < that.wins) {
			return -1;
		} else {
			if (this.losses > that.losses) {
				return 1;
			} else if (this.losses < that.losses) {
				return -1;
			} else {
				if (this.draws > that.draws) {
					return 1;
				} else if (this.draws < that.draws) {
					return -1;
				}
			}
		}
		return 0;
	}


	public void add(Players teamNames1) {
		// if (size == ply.length) {
		//     resize();
		// }
		ply[size++] = teamNames1;
	}

	public void resize() {
		ply = Arrays.copyOf(ply, 2 * ply.length);
	}


	public void sort() {
		Insertion.sort(ply);
	}

	// private boolean less(Comparable v, Comparable w) {
	//     return v.compareTo(w) < 0;
	// }

	private void exch(Object[] a, int i, int j) {
		Object swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}

	public void show() {
		String str = "";
		int i;
		for (i = 0;i<size-1 ; i++) {
			str += ply[i].getTeam() + ",";
		}
		str += ply[i].getTeam();
		System.out.println(str);
	}
}