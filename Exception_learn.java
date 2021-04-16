package loop_practice;

public class Exception_learn {

	public static void main(String[] args) {
	
	subroutine();
	
		
		
	}
    public static void subroutine() {
    	
    	try {
    	int d=0;
		int a =42/d;
		System.out.println("Value is: "+a);
    	}
		catch(ArithmeticException e) {
		System.out.print("Value cannot divide by zero: Pls check  "+e);	
			
		}
			
			
			
		}
	}


