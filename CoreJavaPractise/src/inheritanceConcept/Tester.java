package inheritanceConcept;

public class Tester extends Programmer{

	public static void main(String[] args) {
		
		Tester tester=new Tester();
		
		System.out.println("Employe name is "+tester.employeeName);
		System.out.println("Employee id is "+tester.employeeId);
		System.out.println("Employee salary is "+tester.employeeSalary);
		
		
		tester.does();
		System.out.println("Programmer name is "+tester.programmerName);
		System.out.println("Programmer id is "+tester.programmerId);
		System.out.println("Programmer salary is "+tester.programmerSalary);
		System.out.println("Programmer bonus is "+tester.programmerBonus);
		
		
		
		
	}

}
