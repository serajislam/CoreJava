package coreJava;

public class RelationalOperator {

	public static void main(String[] args) {
		
		int a=10;
		int b=15;
		
		if(a<b)
			System.out.println("a is less than b");
		
		else if(a>b)
		{
			System.out.println("a is greater than b");
		}
		
		
		else if(a==b)
		{
			System.out.println("a & b is equal");
		}
		
		else if(a!=b)
		{
			System.out.println("a &b is not equal");
		}
		
		else if(a<=b)
		{
			System.out.println("a is less than or equal to b");
		}
		
		else if(a>=b)
		{
			System.out.println("a is greater than or equal to b");
		}
		
		else
		{
			System.out.println("above all condition are wrong");
		}
	}

}
