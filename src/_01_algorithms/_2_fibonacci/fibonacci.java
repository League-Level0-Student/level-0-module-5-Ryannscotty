package _01_algorithms._2_fibonacci;

public class fibonacci {
	
	
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int sum;
		for ( int i = 0; i < 10; i++) {
			sum = num1 + num2;
			System.out.print(sum);
			num1=num2;
			num2=sum;
		}
	}

}
