public class fibonachi
{
	public static void main (String args[])
	{	
		int n1, n3=1;
System.out.print(args[0]+"!=");
		n1=Integer.parseInt(args[0].toString());
		for (int i=1; i<=n1;i++)
		{
			
	n3=i*n3;
		System.out.print(n3+", ");
		
			
			
		}

	}
}