package exception;

public class MyExpception {
	public static void main(String[] args) 
	{
		int a=5;
		try
		{
		
		int b=a/0;
		System.out.println(+b);
		}
		catch(Exception e)
		{
			
			System.out.println("divide by zero");
			
		}
		int c=a/2;
		System.out.println(+c);
		
	}
		
	}

