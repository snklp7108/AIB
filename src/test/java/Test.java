import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int a=1000, b=999, c=888;
		
		if (a>b && a>c) {
			System.out.println(" A is greater then B and C");
			
		} else if (b>a && b>c) {
			System.out.println(" B is greater then A and C");
		}
		else if (c>b && c>a) {
			System.out.println(" C is greater then A and C");
		}
		
		int p=0;
		do {
			System.out.println(" Execute atleast onces");
			p++;
		} while (p>10);
		
		int s=1;
				while (s<=10) {
					System.out.println("Here we go");
					s++;
				}
		
			double d=550.55;
		//	int i=d;  // Type mismatch cannot convert from double to int.
			int j= (int)d;
			long l=(long)d;			// Narrow type conversion
			float f= l; 			// Widening type conversion
			System.out.println("After typecasting the value of j:-"+j);
			System.out.println("After typecasting the value of l:-"+l);
			
			
		// Taking input
			Scanner scan = new Scanner(System.in); //because we want take input from scanner class
			System.out.println("Enter first value");
			//String val=scan.nextLine();
			int first=scan.nextInt(); // User input will be going to store on first 
			
			System.out.println("Enter the second value");
			int second=scan.nextInt();
			
			System.out.println("The sum of first & Second are:- "+(first+second));
			System.out.println("The sub of first & Second are:- "+(first-second));
			System.out.println("The mul of first & Second are:- "+(first*second));
			System.out.println("The div of first & Second are:- "+(first/second));
			System.out.println("The remainder of first & Second are:- "+(first%second));
			
			System.out.println("========================================");
			
			int arr[]= {10,20,30,40,50};
			int navin[]=new int[10];
			navin[5]=100;
			navin[8]=300;
			System.out.println(" The value of 5th and 8th index are:-"+(navin[5]+navin[8]));
			
			for (int i = 0; i < navin.length; i++) {
				System.out.println(" The values of array are:- "+navin[i]);
			}
			for (int i = 0; i < arr.length; i++) {
				System.out.println("The values of array are:- "+arr[i]);
				}
			
	}
	

}
 