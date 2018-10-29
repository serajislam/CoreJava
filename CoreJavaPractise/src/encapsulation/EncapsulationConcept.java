package encapsulation;

public class EncapsulationConcept {

	
	
	private String empName;
	private int empSSN;
	private int empAge;
	
	
	public static void main(String[] args) {
		
		EncapsulationConcept emp=new EncapsulationConcept();
		emp.setEmpName("Seraj Islam");
		emp.setEmpSSN(123456789);
		emp.setEmpAge(30);
		
		System.out.println("Employee name is "+emp.getEmpName());
		System.out.println("Employee ssn no is "+emp.getEmpSSN());
		System.out.println("Employee age is "+emp.getEmpAge());
		
				
				
		

	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public int getEmpSSN() {
		return empSSN;
	}


	public void setEmpSSN(int empSSN) {
		this.empSSN = empSSN;
	}


	public int getEmpAge() {
		return empAge;
	}


	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

}
