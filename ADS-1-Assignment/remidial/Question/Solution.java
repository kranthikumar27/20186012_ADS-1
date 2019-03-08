import java.util.*;
class Solution {
	Solution(){

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student;
		MaxPQ<Student> maxobj = new MaxPQ<>();
		int n = Integer.parseInt(sc.nextLine());
		while (sc.hasNext()) {
			String[] tokens = sc.nextLine().split(" ");
			// System.out.println(Arrays.toString(tokens));
			// tokens[0].split("Apply")
			// String tokens1 = tokens.split(",")
			switch (tokens[0]) {
				case "Apply":
				String[] tokens1 = tokens[1].split(",");
				student = new Student(Integer.parseInt(tokens1[0]), tokens1[1] , tokens1[2], Double.parseDouble(tokens1[3]));
				maxobj.insert(student);
				break;
				case "Recruit_Top_Candidate":
				System.out.println(maxobj.delMax());
				break;
				case "Ranking":
				System.out.println();
				int size = maxobj.size();
				for (int i = 0; i < size ; i++ ) {
					System.out.println(i+1 +":"+" "+ maxobj.delMax());
				}
				break;
			}
		}
	}
}
