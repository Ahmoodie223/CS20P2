package Masters;


import java.text.DecimalFormat;
import java.util.Scanner;


public class ElectionMasters {
	
	public static void main(String[] args) {
	  
		Scanner in = new Scanner(System.in);
	  //preparing code to not exceed the output past the hundredths
		DecimalFormat deca = new DecimalFormat("#.##");
	  
	 // Declaring variables based on useroutput
	
	  System.out.println("Voting results from New York");
	  
	  System.out.print("Abbas: ");
	  int abbas = in.nextInt(); 
	 
	  System.out.print("Rasheed: ");
	  int rash = in.nextInt(); 
	 
	  System.out.println("Voting results New Jersey");
	  
	  System.out.print("Abbas: ");
	  int abbasa = in.nextInt();
	  System.out.print("Rasheed: ");
	  int rasha = in.nextInt();
	  
	  System.out.println("Voting results from Connecticut");
	 
	  System.out.print("Abbas: ");
	  int abbasi = in.nextInt();
	  System.out.print("Rasheed: ");
	  int rashi = in.nextInt();
	  //Combining variables into single variables
	  int abbastotal = (abbas + abbasa + abbasi);
	 
	  int rasheedtotal = (rash + rasha + rashi);
	  
	  int total = (abbastotal + abbastotal);
	  //using double to get decimal format and calculating
	  double perc = (Double.valueOf(abbastotal) / Double.valueOf(total))*100;
	  
	  double perc1 = (Double.valueOf(rasheedtotal) / Double.valueOf(total))*100;
	  //outputting desired variables
	  System.out.println("‎ ‎ ‎ ‎ ‎ ");
	  System.out.println("Candidate 	Votes 	Percentage");
	  System.out.println("Abbas         " + abbastotal + " 	" + deca.format(perc) + "%" );
	  System.out.println("Rasheed        " + rasheedtotal + " 	" + deca.format(perc1) + "%" );
	  System.out.println("TOTAL VOTES:  " + total);
	  System.out.println("Thank you!");
	}
}


