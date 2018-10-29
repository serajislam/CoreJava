package polymophismConcept;

public class Cat extends Animal{

	public static void main(String[] args) {
		
		Cat cat=new Cat();
		cat.eat();
		cat.sleep();
		

	}
	
	public void eat()
	{
		super.eat();
		System.out.println("Cat eat milk");
	}
	
	public void sleep()
	{
		super.sleep();
		System.out.println("Cat sleeps more than other animal");
	}

}
