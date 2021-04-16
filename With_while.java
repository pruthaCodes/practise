package loop_practice;

public class With_while {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("This is begining");
		
		int j=1;
		while(j<=2)
		{
			int i=1;
			while(i<=20)
			{
				
				if(i<10) {
				System.out.println("This is "+i+ " second");
				Thread.sleep(1000);
				}
				
				else {
					System.out.println("This is "+i+ " seconds");
					Thread.sleep(1000);
				}
			i++;
			}
		System.out.println("This is "+j+ " minute");
		j++;
		
		}

	}

}
