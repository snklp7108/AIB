import java.util.Scanner;

public class Miconstructor extends AdvTest {
	int myarr[]= {10,20,30,40,50};

	public static int display(int arr[]){
		for (int i = 0; i < arr.length; i++) {
			System.out.println(" The values of array are:- "+ arr[i]);
		}
		return 0;
	}
	
		
		public static String display(String arr[]){
			for (int i = 0; i < arr.length; i++) {
				System.out.println(" The values of array are:- "+ arr[i]);
			}
			return "";
		
	}
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println(" Please enter the first number");
		int first=scan.nextInt();
		
		System.out.println(" Please enter the Second number");
		int Second=scan.nextInt();
		
		AdvTest avt= new AdvTest("India" , "Asia");
    	avt.print();
    	
    	ADD(first, Second);
    	
    	int myarr[]= {10,20,30,40,50};
    	Miconstructor.display(myarr);
    	
    	String myarr1[]= {"ABC","XYZ","123","PQR","321"};
    	Miconstructor.display(myarr1);
    	
    	
		/*
		AdvTest av= new AdvTest();
		av.fname="People";
		av.lname="Soft";
		av.print();
		
		
		Miconstructor mi2= new Miconstructor();
		mi2.fname= "ABC";
		mi2.lname= "XYZ";
		mi2.print();*/
	}

	
	
	
}
