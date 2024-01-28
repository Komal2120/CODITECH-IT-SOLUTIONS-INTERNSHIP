import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	
	public static int compareNumbers(int rand,int choice) {
		if(choice==rand) {
			System.out.println("CONGRATULATIONS! YOU HAVE GUESSED THE NUMBER RIGHT.");
			return 1 ;
		}
		else if(choice<rand) 
		{
			System.out.println("YOUR GUESS IS TOO LOW!!");
			return 0 ;
		}
		else if(choice>rand) 
		{
			System.out.println("YOUR GUESS IS TOO HIGH!!");
			return 0 ;
		}
		
		System.out.println("Invalid Choice.");
		return 0 ;	
	}
	


	public static void main(String[] args) {
		int count = 0;
		System.out.println("---------------------------------------");
		System.out.println("          NUMBER GUESSING GAME         ");
		System.out.println("---------------------------------------");
		System.out.println(" RULES:\n");
		System.out.println(" 1.ENTER ANY NUMBER BETWEEN 1 TO 100.\n 2.YOU WILL HAVE ONLY 5 CHANCES TO GUESS THE NUMBER CORRECTLY.\n 3.HINTS LIKE 'TOO HIGH' OR 'TOO LOW' WILL BE PROVIDED TO MAKE YOU GUESS THE NUMBER CORRECTLY. ");
		System.out.println("_________________________________________");
		
		Scanner sc  = new Scanner(System.in);
		Random r  = new Random();
		int rand = 0;
	    rand =r.nextInt(101);
	    int i ; 
	    for( i=0; i<5 ; i++) {
	    	System.out.println("\nEnter your guess number "+ (i+1) +" : ");
			int choice = sc.nextInt();
			int result = compareNumbers(rand,choice);
			if(result==1) {
				break;
			}
			else {
				continue;
			}
	   	
	    }
	    if(i==5) {
	    	System.out.println("\nSORRY! YOU LOST");
	    }
	    
	}

}
