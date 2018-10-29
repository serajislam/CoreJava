package coreJava;

public class DataTypeAndVariable {
	
	
	
	public static void main(String[] args) {
		
		DataTypeAndVariable dataTypeObj = new DataTypeAndVariable();
		System.out.println("____________calling instance method________________ ");
		dataTypeObj.dataType();
		
		
		//Local variable
		System.out.println("____________calling local variable ________________ ");
		byte bt = 10;
		short sh = 15;
		long ln = 20;
		int in = 25;
		float fl = 30.99f;
		double dl = 35.87;
		char ch ='A';
		boolean bl = true;
		
		System.out.println("byte value is "+bt);
		System.out.println("short value is "+sh);
		System.out.println("long value is "+ln);
		System.out.println("int value is "+in);
		System.out.println("float value is "+fl);
		System.out.println("double value is "+dl);
		System.out.println("char value is "+ch);
		System.out.println("boolean value is "+bl);
		
		System.out.println("____________calling instance variable________________ ");
		
		System.out.println("byte value is "+dataTypeObj.bt);
		System.out.println("short value is "+dataTypeObj.sh);
		System.out.println("long value is "+dataTypeObj.ln);
		System.out.println("int value is "+dataTypeObj.in);
		System.out.println("float value is "+dataTypeObj.fl);
		System.out.println("double value is "+dataTypeObj.dl);
		System.out.println("char value is "+dataTypeObj.ch);
		System.out.println("boolean value is "+dataTypeObj.bl);
	}
	

	//instance variable 
	byte bt = 15;
	short sh = 25;
	long ln = 30;
	int in = 45;
	float fl = 50.99f;
	double dl = 55.87;
	char ch ='b';
	boolean bl = false;
	
	//instance method 
	public void dataType()
	{
		byte bt = 25;
		short sh = 35;
		long ln = 40;
		int in = 55;
		float fl = 60.99f;
		double dl = 75.87;
		char ch ='c';
		boolean bl = false;
		
		System.out.println("byte value is "+bt);
		System.out.println("short value is "+sh);
		System.out.println("long value is "+ln);
		System.out.println("int value is "+in);
		System.out.println("float value is "+fl);
		System.out.println("double value is "+dl);
		System.out.println("char value is "+ch);
		System.out.println("boolean value is "+bl);
	}

}
