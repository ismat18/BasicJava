package corejava;

import java.util.Scanner;

public class ClassActivity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int add=0;
		int n;
		
        System.out.println("How many number do you want to enter? ");
        
        Scanner input = new Scanner (System.in);
			
		n=input.nextInt();
		int arr[] = new int [n];
		
		System.out.println("Please enter all the numbers: ");
        
        for(int i=0; i<n; i++) {
			arr[i]=input.nextInt();
			add = add + arr[i];
		}
		System.out.println("Add all the numbers and print the result " + add);

	}

}
