package corejava;

public class ClassActivity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;
		int y=20;
		
		System.out.println("First num is " + x);
		System.out.println("Second number is " + y);
	
		int temp = x;
	     x = y;
	     y = temp;
		
		//swap(x, y);
	     
		//y = swap(x, x=y);
			
		System.out.println("Swap the numbers");
			
		System.out.println("First num is " + x);
		System.out.println("Second number is " + y);
		
	}
	
	/*swap(int a, int b)
	{
	     int temp = a;
	     a = b;
	     b = temp;
	}*/
	
//	int swap(int a, int b) {  // usage: y = swap(x, x=y);
//		   return a;
//	}

}
