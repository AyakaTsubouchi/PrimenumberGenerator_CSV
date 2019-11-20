package primeNumberGenerator;
import java.util.ArrayList;
import java.util.Scanner;


public class PrimeNumber {

	public ArrayList<Integer> primeNumber(){    
		  int i =0;
	       int num =0;
	       //Empty String
	       ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
	       Scanner myobj = new Scanner(System.in);  // Create a Scanner object
	       System.out.println("Enter the length");
	       String input1 = myobj.nextLine();
	       String input2 = input1;
	       int input = Integer.parseInt(input2);
	       
	      
	       for (i = 1; i <= input; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     //Appended the Prime number to the String
		     primeNumbers.add(i);
		  }	
	       }
//	       for(int i1 = 0; i1 < primeNumbers.size(); i1++) {
//	    	   
//	    	   System.out.println(primeNumbers.get(i1));
//	       }
		return primeNumbers;
			  
		  }
		}    


	


