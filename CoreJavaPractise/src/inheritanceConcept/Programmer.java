package inheritanceConcept;

public class Programmer extends Employee{

	
	int programmerId=102;
		
	String programmerName ="Afroze Ahmed";
	
	int programmerSalary= 15000;
	
	int programmerBonus=5000;
	
	
	public void does()
	
	
	{   
		super.does();
		
		System.out.println("Proggrammer does java programming");
		
		
	}

}
