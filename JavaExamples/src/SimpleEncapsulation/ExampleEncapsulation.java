package SimpleEncapsulation;
//Encapsulation -> binding data in Methods
 class Student{
	private int rollno;
	private String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}


public class ExampleEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.setRollno(10);
		s1.setName("vinod");
	
		System.out.println(s1.getRollno() + " " + s1.getName());
	}

}
