package JavaProgram;

import java.util.Scanner;

public class RevNumber {

	public static void main(String[] args) {
		
		firstWay();
		secondWay();
		thirdWay();
	}

	private static void thirdWay() {
		
		
		
	}

	private static void secondWay() {


	}

	private static void firstWay() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number for reverse");
		int num=sc.nextInt();
		int rev=0;
		while(num!=0)
		{
			
			rev=rev*10+num%10;
			num=num/10;
			
		}
		System.out.println("Reverse NUmbe is "+rev);
		
	}
	
	

}
