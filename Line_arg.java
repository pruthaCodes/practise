package loop_practice;

public class Line_arg {

	public static void main(String[] args) {
		
		if (args.length == 0) { 
			
			System.out.println("User has not given any arguments!");
			
		}
		else if(args.length > 3 || args.length < 3) {
			
			System.out.println("User has to mention exactly 3 arguments!");
			
		}
		else {
			
			switch(args[2]) {
				
			case "+": 
				add(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
				break;
			case "-": 
				substract(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
				break;
			case "*": 
				multiply(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
				break;
			case "/": 
				divide(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
				break;
			default:
				System.out.println("Invalid operator");
			
			}
			
		}
			

				 
				 
	}

			
	public static void add(int a,int b) { 
		int c= a+b;
		System.out.println("Addition Ans is " + c);
	}
	
	public static void divide (int a,int b) {
		int c= a/b;
		System.out.println("Division Ans is " + c);
	}
	
	public static void multiply (int a,int b) {
		int c= a*b;
		System.out.println("Multiply Ans is " + c);
	}
	
	public static void substract (int a,int b) {
		int c= a-b;
		System.out.println("Substact Ans is " + c);
	}
}
