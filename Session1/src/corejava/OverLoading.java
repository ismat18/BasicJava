package corejava;

public class OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		numbers(7);
		numbers(5.6);
		addition(1,3);
		addition(1,2,3);
		addition(1,2,3,4);
	}
	
	public static void numbers (int a) {
		
		System.out.println(a);
	}
	
    public static void numbers (double a) {
		
		System.out.println(a);
	}
    
    public static void addition (int a, int b) {
		
		System.out.println(a + b);
	}
    
public static void addition (int a, int b, int c) {
		
		System.out.println(a + b + c);
	}

public static void addition (int a, int b, int c, int d) {
	
	System.out.println(a + b + c + d);
}

}
