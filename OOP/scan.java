import java.util.*;

class scan {
		public static void main (String args[]){
	
		String a,b,c;
		float d;
		int e;		

		Scanner S = new Scanner (System.in);

		System.out.print("Enter your name: ");
		a = S.next();
		System.out.print("Enter your address: ");
		b = S.next();
		System.out.print("Enter your city: ");
		c = S.next(); 
		System.out.print("Enter your CGPA: ");
		d = S.nextFloat();
		System.out.print("Enter your mobile number: ");
		e = S.nextInt();

		System.out.println("your entered data is: " + "\nName: " + a + "\nAddress: " + b + "\nCity: " + c + "\nCGPA: " + d + "\nMobile number: " + e);
		}
}