import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for cricket tour.
 */
class CricketTour implements Comparable<CricketTour> {
    /**
     * String Variable.
     */
    private String teamName;
    /**
     * Integer Variable.
     */
    private int wins;
    /**
     * Integer Variable.
     */
    private int losses;
    /**
     * Integer Variable.
     */
    private int draws;
    /**
     * Constructs the object.
     */
    CricketTour() {
        //default constructor is not used.
    }
    
    CricketTour(final String teamname1, final int wins1,
     final int losses1, final int draws1) {
        this.teamName = teamname1;
        this.wins = wins1;
        this.losses = losses1;
        this.draws = draws1;
    }
    
    public String getTeamName() {
        return this.teamName;
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
    
    public int compareTo(final CricketTour that) {
        if (this.getWins() < that.getWins()) {
            return 1;
        } else if (this.getWins() > that.getWins()) {
            return -1;
        } else {
            if (this.getLosses() > that.getLosses()) {
                return 1;
            } else if (this.getLosses() < that.getLosses()) {
                return -1;
            } else {
                if (this.getDraws() < that.getDraws()) {
                    return 1;
                } else if (this.getDraws() > that.getDraws()) {
                    return -1;
                }
            }
        }
        return 0;
    }

}
/**
 * Class for selection sort.
 */
class SelectionSort {
    /**
     * Array of team names.
     */
    private CricketTour[] teamnames;
    
    private int size;
    
    SelectionSort() {
        this.teamnames = new CricketTour[10];
        this.size = 0;
    }
    
    public void sort() {
        for (int i = 0; i < size; i++) {
            for (int j = i; j > 0; j--) {
                if (teamnames[j].compareTo(teamnames[j - 1]) == -1) {
                    exch(teamnames, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }
    
    public void exch(final CricketTour[] ct, final int i, final int j) {
        CricketTour swap = ct[i];
        ct[i] = ct[j];
        ct[j] = swap;
    }
    
    public void add(final CricketTour teams) {
        if (size == teamnames.length) {
            resize();
        }
        teamnames[size++] = teams;
    }
    
    public void show() {
        int i = 0;
        for (i = 0; i < size - 1; i++) {
            System.out.print(teamnames[i].getTeamName());
        }
        System.out.println(teamnames[i].getTeamName());
    }
    
    public int getSize() {
        return this.size;
    }
    
    public void resize() {
        teamnames = Arrays.copyOf(teamnames, 2 * teamnames.length);
    }
}

public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //default constructor is not used.
    }
    /**
     * main function of Selection Sort.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        SelectionSort select = new SelectionSort();
        
        while (scan.hasNext()) {
            String[] tokens = scan.nextLine().split(",");
            select.add(new CricketTour(tokens[0], Integer.parseInt(tokens[1]),
                Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3])));
        }
        select.sort();
        select.show();
    }
}