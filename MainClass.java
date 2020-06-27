class MainClass 
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		Student s = new Student(); //Object Created Student Class

		System.out.println("Enter the roll :");
		s.setRoll(sc.nextInt());

		System.out.println("Enter the name :");
		s.setName(sc.next());

		System.out.println("Enter the cgpa :");
		s.setCgpa(sc.nextDouble());

		System.out.println("Enter the Address :");
		s.setAddress(sc.next());

		//Either write all this
		System.out.println("Student Details \n ---------------------------------");
		System.out.println("Roll : "+s.getRoll());
		System.out.println("Cgpa : "+s.getCgpa());
		System.out.println("Student Name : "+s.getName());
		System.out.println("Student Address : "+s.getAddress());

		//OR write this method and design this method in Student class
		s.printInfo();



		Employee e = new Employee(); //Object Created Employee Class

		System.out.println("Enter the Employee Id :");
		e.setEmpId(sc.nextInt());

		System.out.println("Enter the name :");
		e.setName(sc.next());

		System.out.println("Enter the Salary :");
		e.setSalary(sc.nextDouble());

		System.out.println("Enter the Address :");
		e.setAddress(sc.next());


		//Either write all this
		System.out.println("Employee Details \n ---------------------------------");
		System.out.println("Employee Id : "+e.getEmpId());
		System.out.println("Employee Salary : "+e.getSalary());
		System.out.println("Employee Name : "+e.getName());
		System.out.println("Employee Address : "+e.getAddress());


		//OR write this method and design this method in Employee class
		e.printInfo();
	}
}