package loop_practice;

public class Pyramid 
{

	public static void main(String[] args) 
	{
		
		int i,j;
		
		for (i=1; i<6; i++) //outer loop for number of rows(n) { for (int j=n-i; j>1; j--) //inner loop for spaces
        { 
            System.out.print(" "); 
            
         for (j=6-i; j>1; j--)   
         {
        	 System.out.print(" "); 
         }
        for (j=1; j<=i; j++ ) //inner loop for number of columns
          { 
            System.out.print("* "); //print star
          } 

        System.out.println(); //ending line after each row
        } 

	}
}

