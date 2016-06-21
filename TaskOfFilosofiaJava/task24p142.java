package task24p142;

public class task24p142 {
	public static void main(String[] args)
	{
		fibbonacci (100);
	}
	
	static void fibbonacci(int value)
	{
		int c = 1, b = 1, a = 0;
		System.out.println(c);
		System.out.println(b);
		while(c <= value || a <= value || b <= value )
		{
			a = b + c;
			if (a >= value) break;
			System.out.println(a);
			
			b = c + a;
			if (b >= value) break;
			System.out.println(b);
			
			c = a + b;
			if (c >= value) break;
			System.out.println(c);
		}
	}
}
