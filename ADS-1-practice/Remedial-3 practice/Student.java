class Student implements Comparable<Student> {
	private int rollno;
	private String name;
	private double marks;
	private int size;
	Student[] std;
	Student() {
		std = new Student[100];
		size = 0;
	}
	Student(int rollno, String name, double marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	public void add(Student student1) {
		std[size++] = student1;
	}

	public int getRollno(){
		return this.rollno;
	}

	public String getName() {
		return this.name;
	}

	public double  getMarks(){
		return this.marks;
	}
	public int getSize(){
		return this.size;
	}

	public void sort(){
		Merge.sort(std , size);
	}

	public void display(double query){
		int flag = 1;
		for (int i = 0;i<size ;i++ ) {
			if (std[i].getMarks() == query ){
			 	System.out.println(std[i].getRollno()+","+std[i].getName()+","+std[i].getMarks());
			 	flag= 0;
			}
		}
		if (flag == 1) {
			System.out.println("This marks are not awarded to any student");
		}
	}

	public int compareTo(Student that){
		int x = this.name.compareTo(that.name);
		if (x>0) {
			return 1;
		} if (x<0) {
			return -1;
		} if (x== 0) {
			if (this.rollno > that.rollno) {
				return 1;
			} if (this.rollno < that.rollno) {
				return -1;
			}
		}
		return 0;
	}
}