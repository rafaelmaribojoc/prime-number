import java.util.Scanner; 

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	static int i, n, remainder; 
	
	public static void main(String[] args) {
	        
	       System.out.print("Prime/Composite number from 1 up to:  ");
	       n = scan.nextInt();
	        
			for (i = 1; i <= n; i++) {
			    
			    if (isPrime(i) == true) {
			        System.out.println(i + " is a prime number. ");
			    } else if (isPrime(i) == false) {
			        System.out.println(i + " is a composite number. ");
			    } else {
			          break; 
			    }
			        
			}
	}
	
	public static boolean isPrime(int n) {
	    
	    
	   for (int i = 2; i < n; i++) {
		    remainder = n % i; 
		    
		    if (remainder == 0) {
		        return false; 
		    }
		
		}	   return true; 
	}
}