package Fizz_Buzz;
import java.util.*;
public class Fizz_Buzz {
	public static String buzz(int i){
		
			final String a = "Fizz Buzz";
			final String b = "Fizz";
			final String c = "Buzz";
		
		if (i % 15 == 0) 
			return a;
		if (i % 3 == 0) 
			return b;
		if (i % 5 == 0) 
			return c;
		return Integer.toString(i);
		
	} 

	public static void main(String[] args) {
		
		while(true){
		System.out.println("Input a number");
		Scanner scr = new Scanner(System.in);
		int i = scr.nextInt();
		System.out.println("chekio(" + i + ") = " + buzz(i));
		}
	}

}
