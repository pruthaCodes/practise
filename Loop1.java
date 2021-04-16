package loop_practice;

public class Loop1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("This is begining");
		
		//Thread.sleep(2000);
		
		//System.out.println("after 2 seconds");
		
		for(int j=1; j<=60;j++) {
			
			int a=10;
			
			for(int i=1; i<=5;i++) {
			
				System.out.println("Accesing from inner loop "+a);
				if(i>=10) {
					System.out.println("this is " +i+" seconds");
					Thread.sleep(1000);
				  		  }
				else { 
					System.out.println("this is " +i+" second");
					Thread.sleep(1000);
					 }
				
			}

		System.out.println("This is " +j+ " minute");
		/*if(j>=1) {
			System.out.println("Exiting from main loop");
			break;
			continue;
		}
		*/
		
		
		

		}
	
 }
}
