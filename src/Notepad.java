import java.util.*;

import java.net.URL;

public class Notepad {
	public static void main(String[] args) {
	
		try
		{
			URL url=new URL("https://web.postman.co/ghate.php");
			System.out.println("protocals: "+ url.getProtocol());
			System.out.println("Host Name :- : "+ url.getHost());
			System.out.println("Port Name: "+ url.getPort());
			System.out.println("File Name :- : "+ url.getFile());			
			
		}catch(Exception e)
		{System.out.println(e);
			
		}
		
		
		                    
		
	}

}
