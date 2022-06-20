package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class prime_or_not {

	public static void main(String[] args) {
		
		String userNum = JOptionPane.showInputDialog("pick a number: ");
		
		int primeNum = Integer.parseInt(userNum);
		
		for ( int i = 2; i < primeNum/2; i++) {
			
			if (primeNum % i == 0) {
				System.out.println("this is a prime number");
			}
			else {
				System.out.println("this is not a prime number");
			}
			
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
