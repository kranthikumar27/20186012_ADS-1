class Student implements Comparable<Student>{
	Student(){

	}
	private int rollno;
	private String name;
	private  String branch;
	private double marks;
	public Student(int rollno, String name, String branch, double marks){
		this.rollno = rollno;
		this.name = name;
		this.branch= branch;
		this.marks = marks;
	}
	public int getRollno() {
		return this.rollno;
	}
	public String getName() {
		return this.name;
	}
	public String getBranch() {
		return this.branch;
	}
	public double getMarks() {
		return this.marks;
	}
	public String toString() {
		return this.rollno + "," + this.name + "," + this.branch + "," + this.marks;
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
			else if (this.rollno > other.rollno) {
				return -1;
			} else if (this.rollno < other.rollno) {
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