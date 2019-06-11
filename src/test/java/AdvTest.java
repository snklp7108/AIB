
public class AdvTest {
	private String fname;
	private String lname;
	static int count=0;
	 
	AdvTest(){
		System.out.println("I am a constructor");
	}
	
	AdvTest(String f, String l){
		fname=f;
		lname=l;
	}
	
	static int ADD(int x, int y)
	{
		int ans=x+y;
		System.out.println("The sum of numbers are: "+ans);
		return ans;
		
	}	
	public void print() {
		System.out.println(fname+" "+lname);
		count++;
		System.out.println("The number of students are:- "+count);
	}
    
	public static void main(String[] args) { // 4 rows, 2 col
			
			
			int twoD[][]= new  int[][] {{10,20},
				{30,40},
				{50,60},
				{70,80}};
	
				//System.out.println("The value of 5th index is:- "+twoD[2][0]);							
				for (int i = 0; i <=3; i++) {
					for (int j = 0; j <=1; j++) {
						System.out.print("  "+twoD[i][j]);
					}
					System.out.println("");
				}
	
		}

}
