package coreJava;

public class PassingParameterAndReturningValue {

	public static void main(String[] args) {
		

		PassingParameterAndReturningValue obj = new PassingParameterAndReturningValue();
		
		int add=obj.add(20, 30);
		System.out.println("Addtion result is "+add);
		
		int sub=obj.sub(90, 30);
		System.out.println("Subtraction result is "+sub);
		
		String name=obj.name("Seraj", "Islam");
		System.out.println("Full name is "+name);
		
	}
	
	public int add(int a,int b)
	{
		int addResult =a+b;
		
		return addResult;
	}
	public int sub(int a,int b)
	{
		int subResult =a-b;
		return subResult;
	}
	
	public String name(String firstName ,String lastName)
	{
		String fullName =firstName+ " "+lastName;
		return fullName;
	}
	

}
