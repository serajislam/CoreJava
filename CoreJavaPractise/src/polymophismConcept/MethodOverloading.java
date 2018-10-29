package polymophismConcept;

public class MethodOverloading {
	
	public static void main(String[] args) {
		
		
		MethodOverloading mol = new MethodOverloading();
		
		mol.name("Seraj", "Islam");
		
		mol.name("Bina", "Islam", 27);
		
	}
	
	public void name(String firstName,String lastName)
	{
		String fullName=firstName+" "+lastName;
		
		System.out.println("My full name is "+fullName);
	}
	
	public void name(String firstName,String lastName,int age)
	{
		String fullName=firstName+" "+lastName;
		
		System.out.println("My jan full name is "+fullName);
		System.out.println("My jan is "+ age +" "+"years old");
	}

}
