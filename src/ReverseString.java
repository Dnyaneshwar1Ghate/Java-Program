
public class ReverseString {
	public static void main(String[] args) {
	
		
		Way1();
		Way2();
		 
	}

	static void  Way1()
	{
		String str="Way1";
		String rev=" ";
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
						
		}
		System.out.println(rev);
	}
	static void  Way2()
	{
		String str="Way2";
		String rev=" ";
		char a[]=str.toCharArray();
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a[i];
			
		}
		System.out.println(rev);
		
		
		
	}
	}
		
	

