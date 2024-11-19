package JavaProgram;

public class SwappingDemo {
	
	public static void main(String[] args) {
		FistWay();
	}
	
	public static void FistWay()
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

}
