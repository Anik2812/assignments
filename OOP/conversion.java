import java.util.*;

class scan {
		public static void main (String args[]){
	
		int a,b,c,d;
		double e;	

		Scanner S = new Scanner (System.in);

		System.out.print("Enter length: ");
		a = S.nextInt();
		System.out.print("Enter breadth: ");
		b = S.nextInt();
		System.out.print("Enter Celsius: ");
		c = S.nextInt(); 

		d = 2*(a+b);
		e = (c*1.8) + 32;
	
		System.out.println("\nArea of rectangle: " + d + "\nFarenheit: " + e);
		}
}