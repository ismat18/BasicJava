package corejava;

import java.util.Scanner;

public class ClassActivity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int b;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Please enter a number: ");
		
		a=scanner.nextInt();
		
		
		
		//Scanner scanner = new Scanner(System.in);
	
		System.out.println("Please enter another number: ");
		
		b=scanner.nextInt();

		for (int i=a; i<b; i++) {
			
			System.out.println(i);
			
		}

		
		

	}

}
