import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    
	    //Instanciation
	    Scanner sc = new Scanner(System.in);
		
		//Declarations & Initialization 
		int n, i,  remainder; 
		boolean isPrime = true; 
		
		//Input 
		System.out.print("Enter number: ");
		n = sc. nextInt();
		
		//Processes & Output
		for (i = 2; i < n; i++) {
		    
		    remainder = n % i; 
		    
		    if (remainder == 0) {
		        System.out.println(n + " ℅ " + i + " = " + (n % i));
		        isPrime = false; 
		        break; 
		    }
	
		    System.out.println(n + " ℅ " + i + " = " + (n % i));
		}
		
		if (isPrime) {
		    System.out.println("No zero remainder has found.");
		    System.out.println(n + " is a Prime number.");
		} else {
		    System.out.println("Zero remainder has found.");
		    System.out.println(n + " is a Composite number.");
		}
	}
}