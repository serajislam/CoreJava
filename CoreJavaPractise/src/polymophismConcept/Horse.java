package polymophismConcept;

public class Horse extends Cat {

	public static void main(String[] args) {
		

		Horse horse = new Horse();
		horse.eat();
		horse.sleep();
	}
	
	public void eat()
	{
		super.eat();
		System.out.println("Horse eat grass");
	}
	
	public void sleep()
	{
		super.sleep();
		System.out.println("Horse sleep by standing");
	}

}
