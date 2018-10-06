import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
class Student implements Comparable<Student> {
	private String name;
	private String dob;
	private int sub1;
	private int sub2;
	private int sub3;
	private int total;
	private String category;
	int day;
	int month;
	int year;
	Student(String name1, String dob, int sub1, int sub2, int sub3, int total1, String category1) {
		this.name = name1;
		String[] d = dob.split("-");
		this.day = Integer.parseInt(d[0]);
		this.month = Integer.parseInt(d[1]);
		this.year = Integer.parseInt(d[2]);
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.total = total1;
		this.category = category1;
	}
	public String getName() {
		return this.name;
	}

	public String getDob() {
		return this.dob;
	}

	public int getSub1() {
		return this.sub1;
	}

	public int getSub2() {
		return this.sub2;
	}

	public int getSub3() {
		return this.sub3;
	}

	public int getTotal() {
		return this.total;
	}

	public String getCategory() {
		return this.category;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public void setDob(String newDod) {
		this.dob = newDod;
	}

	public int compareTo(Student that) {
		if (this.total > that.total) return 1;
		if (this.total < that.total) return -1;
		if (this.sub3 > that.sub3) return 1;
		if (this.sub3 < that.sub3) return -1;
		if (this.sub2 > that.sub2) return 1;
		if (this.sub2 < that.sub2) return -1;
		if (this.day > that.day) return 1;
		if (this.day < that.day) return -1;
		if (this.month > that.month) return 1;
		if (this.month < that.month) return -1;
		if (this.year > that.year) return 1;
		if (this.year < that.year) return -1;
		return 0;
	}
}

// class SelectionSort {
// 	private Student[] studentnames;
// 	private int size;
// 	SelectionSort() {
// 		this.studentnames = new Student[10];
// 		this.size = 0;
// 	}

// 	public void sort() {
// 		for (int i = 0; i < size; i++) {
// 			for (int j = i; j > 0; j--) {
// 				if (studentnames[j].compareTo(studentnames[j - 1]) == -1) {
// 					exch(studentnames, j, j - 1);
// 				} else {
// 					break;
// 				}
// 			}
// 		}
// 	}
// 	public void exch(final Student[] ct, final int i, final int j) {
// 		Student swap = ct[i];
// 		ct[i] = ct[j];
// 		ct[j] = swap;
// 	}

// 	public void add(final Student names) {
// 		if (size == studentnames.length) {
// 			resize();
// 		}
// 		studentnames[size++] = names;
// 	}
// 	public void show() {
// 		int i = 0;
// 		for (i = 0; i < size - 1; i++) {
// 			System.out.print(studentnames[i].getName() + ",");
// 		}
// 		System.out.println(studentnames[i].getName());
// 	}
// 	public int getSize() {
// 		return this.size;
// 	}

// 	public void resize() {
// 		studentnames = Arrays.copyOf(studentnames, 2 * studentnames.length);
// 	}
// }
class Solution {
	Solution() {

	}
	static ArrayList<Student> student = new ArrayList<>();
	static ArrayList<Student> vacancyarr = new ArrayList<>();
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int vacancies = scan.nextInt();
		int unreserved = scan.nextInt();
		int bc = scan.nextInt();
		int sc = scan.nextInt();
		int st = scan.nextInt();
		while (scan.hasNext()) {
			String[] tokens = scan.next().split(",");
			//System.out.println(Arrays.toString(tokens));
			Student sobj = new Student(tokens[0], tokens[1], Integer.parseInt(tokens[2]),
			                           Integer.parseInt(tokens[3]), Integer.parseInt(tokens[4]),
			                           Integer.parseInt(tokens[5]), tokens[6]);
			sobj.add(sobj);
		}
		selectionSort1();
		for (int i = 0; i < sobj.size(); i++ ) {
			System.out.println(sobj.get(i).name + "," + sobj.get(i).total + "," + sobj.get(i).category);
		}
		System.out.println();
		vacancy(vac, open, bc, sc, st);
	}

	public void vacancy(int vac, int open, int bc, int sc, int st) {
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		for (int i = 0; i < sobj.size() ; i++ ) {
			if (a == open)break;
			vacancyarr.add(sobj(i));
			a++;
			e++;
		}
		for (int i =0;i<sobj ;i++ ) {
			if (b == bc) break;
			if (sobj.get(i).category.equals("BC")) {
				if (!vacancyarr.contains(sobj.get(i))) {
					vacancyarr.add(sobj.get(i));
					b++;
					e++;
				}
			}
		}
		for (int i =0;i<sobj ;i++ ) {
			if (c == sc) break;
			if (sobj.get(i).category.equals("SC")) {
				if (!vacancyarr.contains(sobj.get(i))) {
					vacancyarr.add(sobj.get(i));
					c++;
					e++;
				}
			}
		}
		for (int i =0;i<sobj ;i++ ) {
			if (d == st) break;
			if (sobj.get(i).category.equals("ST")) {
				if (!vacancyarr.contains(sobj.get(i))) {
					vacancyarr.add(sobj.get(i));
					d++;
					e++;
				}
			}
		}
		selectionSort2();
		for (int i = 0; i < sobj.size(); i++ ) {
			System.out.println(sobj.get(i).name + "," + sobj.get(i).total + "," + sobj.get(i).category);
		}
	}
	public static void selectionSort2() {
		for (int i = vacancyarr.size()-1; i >= 0; i--) {
			Student stud = vacancyarr.get(i);
			int index =-1;
			for (int j = i-1; j > 0; j--) {
				if (stud.compareTo(vacancyarr.get(i)==1)) {
					stud =vacancyarr.get(j);
					index = j;
				} 
		
			}
			Student temp = vacancyarr.get(i);
			vacancyarr.set(i, stud);
			if (index != -1) {
				vacancyarr.set(index, temp);
			}
		}
	}
}

