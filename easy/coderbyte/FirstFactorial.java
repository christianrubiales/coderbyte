package coderbyte;

import java.util.Scanner;

public class FirstFactorial {

	  int FirstFactorial(int n) { 

		  	int s = 1;
			for (int i = 1; i <= n; i++) {
				s *= i;
			}
			return s;
	  } 
	  
	  public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner  s = new Scanner(System.in);
	    FirstFactorial c = new FirstFactorial();
	    System.out.print(c.FirstFactorial(s.nextInt())); 
	  }   
}
