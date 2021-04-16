package loop_practice;


class ParentClass{
	
	public void display() {
		System.out.println("Parent Class");
	}
}

class Child extends ParentClass{
	public void dislay() {
		
		System.out.println("I am a Child");
		super.display();
	}
}


public class Overriding {

	public static void main(String[] args) {
		System.out.println("This is a test class");
		
		Child c=new Child();
		c.dislay();
	}
}
