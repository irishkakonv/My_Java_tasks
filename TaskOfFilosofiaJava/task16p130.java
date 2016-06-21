package task16p130;

import java.util.*;

public class task16p130 {
	public static void main(String[] args)
	{
		int b = 1;
		for (int c = 0; c < 25; c++)
		{
			int i, j;
			System.out.println(b);
			b++;
			
			Random rand = new Random();
			i = rand.nextInt();
			j = rand.nextInt();
			
			if (i > j)
				System.out.println(i +" more "+ j);
			else if (i < j)
				System.out.println(i +" less "+ j);
			else if (i == j)
				System.out.println(i +" equal "+ j);
		}
	}
}
