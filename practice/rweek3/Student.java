class Student implements Comparable<Student>{
	private int roll;
	private String name;
	private double marks;
	private int size;
	private Student[] std;
	Student(){
		size = 0;
		std = new Student[200];
	}
	Student(int roll, String name, double marks){
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public void add(Student student1){
		std[size++] = student1;
	}

	public void sort(){
		Merge.sort(std, size);
	}

	public String getName(){
		return this.name;
	}

	public int getRoll(){
		return this.roll;
	}

	public double getMarks() {
		return this.marks;
	}


	public int compareTo(Student that){
		int x = this.name.compareTo(that.name);
		if (this.marks> that.marks) {
			return 1;
		} if (this.marks<that.marks) {
			return -1;
		} if (this.marks == that.marks) {
			if (x<0) {
				return 1;
			} if (x>0) {
				return -1;
			} if(x==0) {
				if (this.roll<that.roll) {
					return 1;
				} if (this.roll>that.roll) {
					return -1;
				}
			}
		}
		return 0;
	}

	public void display(double num){
		for (int i = 0;i<size ;i++ ) {
			if (std[i].getMarks() == num) {
				System.out.println(std[i].getRoll()+","+std[i].getName()+","+std[i].getMarks());
			}
		}
	}
}