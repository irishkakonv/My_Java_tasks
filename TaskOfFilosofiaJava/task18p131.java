package task18p131;

public class task18p131 {
	public static void main(String[] args)
	{
		int i, j, count;
		for (i = 1; i < 100; i++)
		{
			count = 0;
			for (j = 1; j <= i; j++)
			{
				if (i == 1 || i == 2)
				{
					System.out.println(i + " is a prime number");
					break;
				}	
				if (i % j > 0)
				{	
					count++;
				}
				else
				{	
					continue;
				}
				
			if (count == (i-2) )
			{
				System.out.println(i + " is a prime number");
			}
				else 
					continue;
			}
		}
	}
}
