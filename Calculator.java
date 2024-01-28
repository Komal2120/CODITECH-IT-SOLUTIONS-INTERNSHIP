import java.util.Scanner;

public class Calculator {
	
	public double addition( double a , double b) {
		return a+b;
	}
	
	public double substraction( double a , double b) {
		return a-b;
	}
	
	public double division( double a , double b) {
		return a/b;
	}
	
	public double multiplication( double a , double b) {
		return a*b;
	}
	
	public void calculations(double a , double b) {
		int operator ;
		double result ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------------------------------------------");
		System.out.println("--------CHOOSE THE OPERATION TO PERFORM-------");
		System.out.println("----------------------------------------------");
		System.out.println("1. ADDITION ");
		System.out.println("2. SUBSTRACTION ");
		System.out.println("3. MULTIPLICATION ");
		System.out.println("4. DIVISION ");
		System.out.println("----------------------------------------------");
		System.out.println("Enter the operation to perform[number] :");
		operator= sc.nextInt();
		
		switch(operator) {
		case 1 : 
			result = addition(a, b);
			System.out.println(a + " + " + b + " = "+ result);
			break;
			
		case 2 : 
			result = substraction(a, b);
			System.out.println(a + " - " + b + " = "+ result);
			break;
			
		case 3 : 
			result = multiplication(a, b);
			System.out.println(a + " * " + b + " = "+ result);
			break;
			
		case 4 : 
			result = division(a, b);
			System.out.println(a + " - " + b + " = "+ result);
			break;
		
		default:
			System.out.println("Invalid Choice! Try again");
			calculations(a,b);	
		}
		System.out.println("\n_______________________________________________________________");
		System.out.println("\nDO YOU WANT TO CALCULATE MORE ?\nEnter '1' for YES & 'O' For NO");
		int choice = sc.nextInt();
	
		if(choice==1) {
			Calculator.calculate();
		}
		else {
			System.exit(0);
		}
		
	}
	
	public static void calculate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("______________________________________________");
		System.out.println("-------------------CALCULATOR-----------------");
		System.out.println("______________________________________________");
		
		System.out.println("Enter Value 1 : ");
		double a = sc.nextDouble();
		
		System.out.println("Enter Value 2 : ");
		double b = sc.nextDouble();
		
		Calculator c  = new Calculator();
		c.calculations(a, b);
		
	}
	public static void main(String[] args) {
	
		Calculator c  = new Calculator();
		c.calculate();
		
	}

}
