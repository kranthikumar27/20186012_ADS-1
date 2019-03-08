class Student implements Comparable<Student> {
	Student() {

	}
	private String name;
	private int roll;
	private double marks;
	private String branch;
	public Student(final int roll,final  String name,final String branch,final double marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.branch = branch;
	}
	public String getName() {
		return this.name;
	}
	public int getRoll() {
		return this.roll;
	}
	public double getMarks() {
		return this.marks;
	}
	public String getbranch() {
		return this.branch;
	}
	public String toString() {
		return this.roll + "," + this.name + "," + this.branch + "," + this.marks;	
	}
	public int compareTo(Student other) {
		// if (this.name.compareTo(other.name) < 0) {
		// 		return 1;
		// }
		// if (this.name.compareTo(other.name) > 0) {
		// 		return 0;
		// }
		if (this.marks > other.marks) {
			return 1;
		} else if (this.marks < other.marks) {
			return -1;			
			}
			else if (this.roll > other.roll) {
				return -1;
			} else if (this.roll < other.roll) {
				return 1;
			}
	// 			if (this.name.compareTo(other.name) > 0) {
	// 				return 1;
	// 			}
	// 			if (this.name.compareTo(other.name) < 0) {
	// 				return -1;
	// 			}
	// 			if(this.name.compareTo(other.name) == 0)
	// 			{if (this.roll > other.roll) {
 // 					return 1;
 // 				} else if (this.roll < other.roll) {
 // 					return -1;
 // 				}} 
	// 		}
		
		// return 0;
       
       return 0;
	}
}