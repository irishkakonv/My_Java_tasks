package Monkey_Typing;
import java.util.*;

public class Monkey_Typing {
	public static void enter(String str, String[] word){
		boolean con;
		int count = 0;
		String strv = str.toLowerCase();
		for (int i = 0; i < word.length; i++){
			con = strv.contains(word[i]);
				if (con == true) 
					count++;
		}
		System.out.println("count_words(\"" + str + "\", {" + Arrays.toString(word) + "}) == " + count);	
	}

	public static void main(String[] args) {
		String str = "How aresjfhdskfhskd you?";
		String[] word = {"how", "are", "you", "hello"};
		enter(str, word);

	}

}
