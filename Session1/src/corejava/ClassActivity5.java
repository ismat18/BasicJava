package corejava;

import java.util.Scanner;

public class ClassActivity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str [] = new String [10];
		str[0]="Dallas";
		str[1]="Irving";
		str[2]="Allen";
		str[3]="Plano";
		str[4]="Arlington";
		str[5]="Euless";
		str[6]="Fort Worth";
		str[7]="Frisco";
		str[8]="Luisville";
		str[9]="Hurst";
		
		System.out.println("Enter a string: ");
		
		Scanner input= new Scanner(System.in);
		
		String city=input.nextLine();

		
		int count = 0;
		
		for (int i=0; i<str.length-1; i++) {
			
			if(city.equalsIgnoreCase(str[i])) {	
			count++;
			}
		}
		if(count==0) {
			System.out.println("Not in array");
		}
		else
		{
			System.out.println("Already in array");
	
		}

	}

}
