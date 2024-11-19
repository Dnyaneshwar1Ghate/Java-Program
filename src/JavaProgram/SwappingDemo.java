package JavaProgram;

public class SwappingDemo {
	
	public static void main(String[] args) {
		System.out.println("_________________________");
		fistWay();
		System.out.println("_________________________");
		secondWay();
		System.out.println("_________________________");
		thirdWay();
		System.out.println("_________________________");
	}
	
	private static void thirdWay() {
		
		int a=3;
		int b=5;
		System.out.println("Before Swap");
		System.out.println(a+"   "+b);
		
		a=a*b;    // 3*5=15
		b=a/b;    //15/5= 3  -->B
		a=a/b;    //15/3=  5   --->>A
		
		System.out.println("After Swap");
		System.out.println(a+"   "+b);
		
	}

	private static void fistWay()
	{
		int a=10; int b=20;
		System.out.println("Before Swap");
		System.out.println(a+"   "+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swap");
		System.out.println(a+"   "+b);
		
	}
	private static void secondWay()
	{
		int a=100;
		int b=200;
		System.out.println("Before Swap");
		System.out.println(a+"   "+b);
		
		a=a+b; //100+200=300
		b=a-b;  //300-200=100  B=100
		a=a-b;  //300-100=200  A=200
		
		
		System.out.println("After Swap");
		System.out.println(a+"   "+b);
		
	}

}
