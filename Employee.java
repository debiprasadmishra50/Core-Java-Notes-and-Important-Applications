class Employee extends Person
{	
	private int empId;
	private double salary;

	public int getEmpId()
	{
		return empId;
	}
	public void setEmpId(int empId)
	{
		this.empId = empId;
	}

	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}

	public void printInfo()
	{
		System.out.println("Employee Details \n ---------------------------------");
		System.out.println("Employee Id : "+getEmpId());
		System.out.println("Employee Salary : "+getSalary());
		System.out.println("Employee Name : "+getName());
		System.out.println("Employee Address : "+getAddress());
	}

}