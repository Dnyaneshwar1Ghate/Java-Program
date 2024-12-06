package Basic;

public class String1 {

	public static void main(String[] args) {
		
	
		FirstWay();
		SecondWay();
		ThirsWay();
		
		
	}
	
	private static void ThirsWay() {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Program");
		System.out.println(sb.reverse());
	}

	public static void FirstWay()
	{
		String s="This";
		String rev="";
		
		for (int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
		
	}
	
	public static void SecondWay()
	{
		StringBuilder sb=new StringBuilder("Java");
		System.out.println(sb.reverse());
		
	}
	
	
	
}
