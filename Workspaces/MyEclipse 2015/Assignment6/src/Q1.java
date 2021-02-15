class Student{
	String name;
	int roll_no;
}

public class Q1 {

	public static void main(String[] args) {
		Student joe = new Student();
		joe.name = "John";
		joe.roll_no = 2;
		
		System.out.println("My Name is "+joe.name+" and my roll number is "+joe.roll_no);
		
	}

}
