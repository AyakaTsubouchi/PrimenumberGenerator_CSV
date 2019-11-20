package primeNumberGenerator;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main extends PrimeNumber implements Icsv{
	public static void main(String[] args) {
	
	 List<PrimeNumber> primeNumList = new ArrayList();
	 PrimeNumber myob = new PrimeNumber();
	
	 ArrayList<Integer> myprime = myob.primeNumber();
	
	 FileWriter fileWriter = null;

	    try {
	      fileWriter = new FileWriter("prime.csv");
	      for(int i = 0; i< myprime.size(); i++) {
	    	  //fileWriter.write("helloß");	 
	    	  fileWriter.write(myprime.get(i).toString());	
	    	  fileWriter.write(COMMA);	
	    	  }
	      fileWriter.close();
	      System.out.println(myprime);
	    }catch (IOException e) {
	    	        e.printStackTrace();
	          }
	    }
}


