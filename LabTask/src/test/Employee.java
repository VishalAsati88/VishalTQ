package test;

public class Employee {
	
	int empId;
	String name;
	Department d;
	
	public Employee()
	{
		
	}

	public Employee(int empId, String name, Department d) {
		this.empId = empId;
		this.name = name;
		this.d = d;
	}
	



	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getD() {
		return d;
	}

	public void setD(Department d) {
		this.d = d;
	}
	
	

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", d=" + d + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
