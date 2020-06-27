class Student extends Person
{	
	private int roll;
	private double cgpa;

	public int getRoll()
	{
		return roll;
	}
	public void setRoll(int roll)
	{
		this.roll = roll;
	}

	public double getCgpa()
	{
		return cgpa;
	}
	public void setCgpa(double cgpa)
	{
		this.cgpa = cgpa;
	}

	public void printInfo()
	{
		System.out.println("Student Details \n ---------------------------------");
		System.out.println("Roll : "+getRoll());
		System.out.println("Cgpa : "+getCgpa());
		System.out.println("Student Name : "+getName());
		System.out.println("Student Address : "+getAddress());
	}

}