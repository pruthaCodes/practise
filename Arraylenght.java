package loop_practice;

public class Arraylenght {

	public static void main(String[] args) {
		
		int [] arry1= {1,2,3,4};
		
		int L=arry1.length;
		System.out.println("no of values in Array1:  " +L);
		
		int[] arry2 = new int[arry1.length];
		System.out.println("Done");
		
		
		for(int i=0;i<arry1.length;i++) {
			arry2[i]=arry1[i];
		}
 
		System.out.println("Done1");
		//print values of Array
				System.out.println("Values in Array1");
				for(int i=0;i<arry1.length;i++) {
					System.out.print(arry1[i] + " " );
					
				}
		//print values of Array2
		System.out.println("Values in Array2");
		for(int i=0;i<arry2.length;i++) {
			System.out.print(arry2[i]+ " ");
		
	}

   }
}	
