import java.util.Scanner;

public class BiggestNumber {
	
	public static void main(String[] args) {
		int x,y,z;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the 1st number");
		x=s.nextInt();
		
		System.out.println("Enter the 2nd number");
		y=s.nextInt();
		
		System.out.println("Enter the 3rd number");
		z=s.nextInt();
		
		if (x>y && x>z)
		{
			System.out.println("largest number is:"+x);
		}
		else if (y>z)
		{
			System.out.println("largest number is:"+y);
		}
		else
		{
			System.out.println("largest number is:"+z);
		}
	}
	
	
	

}
