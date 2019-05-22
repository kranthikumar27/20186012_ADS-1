import java.util.*;
public class Solution1 {
	Solution1() {

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student stdobj;
		MaxPQ<Student> objmax = new MaxPQ<>();
		while (sc.hasNext()) {
			String[] tokens = sc.nextLine().split(" ");
			// System.out.println(Arrays.toString(tokens));
			switch (tokens[0]) {
				case "Apply":
				String[] data = tokens[1].split(",");
				// System.out.println(Arrays.toString(data));
				stdobj = new Student(Integer.parseInt(data[0]), data[1], data[2], Double.parseDouble(data[3]));
				objmax.insert(stdobj);
				break;
				case "Recruit_Top_Candidate":
				System.out.println(objmax.delMax());
				break;
				case "Ranking":
				System.out.println();
				int size = objmax.size();
				for (int i = 0;i<size ;i++ ) {
					System.out.println(i+1 +": "+ objmax.delMax());
				}
			}
		}
	}
}