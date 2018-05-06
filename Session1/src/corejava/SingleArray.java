package corejava;

public class SingleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Rainbow [] = new String [7];
		Rainbow[0]="Red";
		Rainbow[1]="Orange";
		Rainbow[2]="Yellow";
		Rainbow[3]="Green";
		Rainbow[4]="indigo";
		Rainbow[5]="Blue";
		Rainbow[6]="violet";
		
		//System.out.println(Rainbow[0]);
		//System.out.println(Rainbow[1]);
		//System.out.println(Rainbow[2]);
		
		for (int x=0; x<Rainbow.length; x++) {
			System.out.println(Rainbow[x]);
		}
		
	}

}
